package webElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingByIndex {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://omayo.blogspot.com/");
	WebElement w = driver.findElement(By.id("drop1"));
	Select select=new Select(w);
	select.selectByValue("def");
	Thread.sleep(3000);
	select.selectByVisibleText("doc 2");
	Thread.sleep(3000);
	select.selectByIndex(0);
	List<WebElement> w1 = select.getOptions();
	for(WebElement w2:w1)
	{
		System.out.println(w2.getText());
	}
}
}
