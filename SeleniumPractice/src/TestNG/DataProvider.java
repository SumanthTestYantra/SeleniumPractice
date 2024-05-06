package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {
	@org.testng.annotations.DataProvider(parallel=true,name="cred")
	public String[][] sendData()
	{
		String[][] sarr= {{"admin","manager"},{"admin1","manager1"}};
		return sarr;
	}
	
	@Test(dataProvider="cred")
	public void login(String[] cred) throws InterruptedException
	{
		System.out.println(cred[0]);
		System.out.println(cred[1]);
	}
}
