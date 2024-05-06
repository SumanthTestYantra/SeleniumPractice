package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningHelpingAttribute {
@Test(invocationCount = 2, timeOut = 500)
public void ola()
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.olaelectric.com/");
	driver.close();
}

@Test(invocationCount=4, threadPoolSize = 2)
public void royalEnfield()
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.royalenfield.com/");
	driver.close();
}

@Test(enabled = false)
public void hero()
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.heromotocorp.com/");
	driver.close();
}

@Test
public void ktm()
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ktmindia.com/");
	driver.close();
}
}
