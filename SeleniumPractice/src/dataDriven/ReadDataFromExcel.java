package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("./testData/testData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet("Sheet1");
		int rowNum=sheet.getPhysicalNumberOfRows();
		int colNum=sheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][] data=new String[rowNum-1][colNum];
		
		for(int i=1,k=0;i<rowNum;i++,k++) {
			for(int j=0;j<colNum;j++) {
				data[k][j]=sheet.getRow(i).getCell(j).toString();
				System.out.print(data[k][j]+" ");
			}
			System.out.println();
		}
		
	}
}
