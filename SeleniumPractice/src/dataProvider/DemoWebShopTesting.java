package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoWebShopTesting {
	@DataProvider(name="data")
	public String[][] data() throws EncryptedDocumentException, IOException
	{
		File file=new File("./testData/SystemTesting.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet webShopSheet = workbook.getSheet("Sheet1");
		int rowNum=webShopSheet.getPhysicalNumberOfRows();
		int colNum=webShopSheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][] data=new String[rowNum-1][colNum];
		
		for(int i=0;i<rowNum-1;i++) {
			for(int j=0;j<colNum;j++) {
				data[i][j]=webShopSheet.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
	}
	
	@Test(dataProvider = "data")
	public void demo(String[] cred) {
		for(int i=0;i<cred.length;i++)
		{
			System.out.println(cred[i]);
		}
	}
}
