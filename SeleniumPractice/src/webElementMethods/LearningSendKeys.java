package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningSendKeys {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
	driver.findElement(By.xpath("//input[@type='text' and @title='search']")).sendKeys("Hero");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text' and @title='search']")).clear();
}
}
