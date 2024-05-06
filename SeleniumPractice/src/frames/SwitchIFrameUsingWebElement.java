package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.WrapsElement;

public class SwitchIFrameUsingWebElement {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	WebElement we=driver.findElement(By.xpath("//div[@rel-title='Photo Manager']//iframe"));
	driver.switchTo().frame("aswift_1");
	Actions action=new Actions(driver);
	WebElement src=driver.findElement(By.xpath("//h5[text()='High Tatras']"));
	WebElement tar=driver.findElement(By.id("trash"));
	action.dragAndDrop(src,tar).perform();
}
}
