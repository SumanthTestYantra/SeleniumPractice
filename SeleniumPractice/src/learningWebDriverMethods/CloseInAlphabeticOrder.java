package learningWebDriverMethods;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseInAlphabeticOrder {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/user/Downloads/TestPage.html");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(7000);
		Set<String> wid = driver.getWindowHandles();
		Map<String,String> title=new TreeMap();
		for(String s:wid)
		{
			String s1=driver.switchTo().window(s).getTitle();
			Thread.sleep(1000);
			title.put(s1,s);
		}
	 
		for(Map.Entry<String,String> hs:title.entrySet())
		{
		driver.switchTo().window(hs.getValue()).close();	
		Thread.sleep(2000);
		}
	}
}
