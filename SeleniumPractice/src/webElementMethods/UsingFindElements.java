package webElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingFindElements {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com");
	List<WebElement> we = driver.findElements(By.xpath("//div[@class='header-menu']/ul[@class='top-menu']/li"));
	for(WebElement w:we)
	{
		if(w.getText().equals("DIGITAL DOWNLOADS"))
		{
			w.click();
			break;
		}
	}
}
}
