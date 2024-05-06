package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetRect {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/login");
	Rectangle r=driver.findElement(By.id("Email")).getRect();
	System.out.println(r.getX());
	System.out.println(r.getY());
	System.out.println(r.getHeight());
	System.out.println(r.getWidth());
}
}
