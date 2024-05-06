package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		String text=driver.findElement(By.xpath("//label[@for='pollanswers-1']")).getText();
		System.out.println(text);
		String text1=driver.findElement(By.xpath("(//a[@href='/digital-downloads'])[1]")).getText();
		System.out.println(text1);
	}
}
