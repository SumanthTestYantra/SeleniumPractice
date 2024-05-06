package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureRecentlyViewedProducts {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[5]")).click();
		driver.findElement(By.id("small-searchterms")).sendKeys("Smartphone");
		driver.findElement(By.xpath("(//input[@value='Search'])[1]")).submit();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		driver.findElement(By.linkText("Recently viewed products")).click();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File ss=ts.getScreenshotAs(OutputType.FILE);
		File f=new File("./ErrorShots/image2.png");
		FileHandler.copy(ss, f);
	}
}
