package Laptop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Acer {
@Test(priority = -1,groups = "Integration", dependsOnGroups = "smoke")
public void startAcer()
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.acer.com/in-en");
	Reporter.log("Running Acer",true);
	driver.close();
}

@Test(priority = -2, dependsOnMethods = "startAcer")
public void stopAcer()
{
	System.out.println("Acer stopped");
}

@Test(priority=-5,dependsOnMethods = {"startAcer","stopAcer"})
public void editAcer()
{
	System.out.println("AcerEdited");
}
}
