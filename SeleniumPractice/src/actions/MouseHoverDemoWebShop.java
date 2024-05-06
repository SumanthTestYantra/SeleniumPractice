package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemoWebShop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions action=new Actions(driver);
		WebElement computers=driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
		action.moveToElement(computers).perform();
		
		WebElement notebooks=driver.findElement(By.xpath("//a[contains(text(),'Notebooks')]"));
		action.moveToElement(notebooks).click().perform();
	}
}
