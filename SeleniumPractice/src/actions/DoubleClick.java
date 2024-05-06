package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demoapp.skillrary.com/");
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Selenium Training")).click();
//	WebElement doubleclick=driver.findElement(By.id("add"));
//	Actions action=new Actions(driver);
//	Thread.sleep(4000);
//	action.doubleClick(doubleclick).perform();
	
	Actions action=new Actions(driver);
	WebElement doubleclick=driver.findElement(By.id("add"));
	action.moveToElement(doubleclick).perform();
	action.doubleClick().perform();
}
}
