package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickOnAElement {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://omayo.blogspot.com/");
	WebElement clickAlert=driver.findElement(By.id("alert1"));
	Actions action=new Actions(driver);
	action.click(clickAlert).perform();
}
}
