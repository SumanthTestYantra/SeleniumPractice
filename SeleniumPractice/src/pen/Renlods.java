package pen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Renlods {
@Test(groups="erp",dependsOnGroups = "crm")
public void write()
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	Reporter.log("Writting in reynolds",true);
	driver.close();
}
}
