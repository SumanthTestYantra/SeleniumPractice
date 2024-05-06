package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("Sumanth");
		Thread.sleep(2000);
		driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("sumanthchinivar16@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("giftcard_2_SenderName")).sendKeys("SumanthChinivar");
		Thread.sleep(2000);
		driver.findElement(By.id("giftcard_2_SenderEmail")).sendKeys("sumanthchinivar16@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-button-2")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Shopping cart")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("3");
		Thread.sleep(2000);
		driver.findElement(By.name("updatecart")).click();
	}
}
