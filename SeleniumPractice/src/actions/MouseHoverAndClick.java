package actions;

import java.nio.file.WatchEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAndClick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://celloworld.com/");		
		Actions action=new Actions(driver);
		WebElement lunchBox=driver.findElement(By.xpath("//a[text()='LUNCH BOXES']"));
		action.moveToElement(lunchBox).perform();
		WebElement glassLunchBox=driver.findElement(By.xpath("//a[text()='GLASS LUNCH BOXES']"));
		action.moveToElement(glassLunchBox).click().perform();
	}
}
