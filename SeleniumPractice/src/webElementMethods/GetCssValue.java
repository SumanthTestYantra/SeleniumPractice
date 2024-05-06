package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	String text=driver.findElement(By.xpath("//a[@class='ico-register']")).getCssValue("font");
	System.out.println(text);
	Dimension e = driver.findElement(By.xpath("//a[@class='ico-register']")).getSize();
	System.out.println(e.getHeight());
	System.out.println(e.getWidth());
}
}
