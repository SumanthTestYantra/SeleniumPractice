package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		String text=driver.findElement(By.xpath("//a[@class='ico-register']")).getAttribute("href");
		System.out.println(text);
		String text1=driver.findElement(By.xpath("//a[@class='ico-register']")).getTagName();
		System.out.println(text1);
	}
}
