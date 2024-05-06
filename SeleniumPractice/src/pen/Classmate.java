package pen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Classmate {
@Test(groups="Integration")
public void write()
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://classmateshop.com/");
	Reporter.log("Writing in classmate pen",true);
	driver.close();
}
}
