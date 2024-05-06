package learningWebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNavigateMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
//		Thread.sleep(2000);
//		driver.navigate().refresh();
		
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
		
		driver.navigate().to("https://www.google.com/");
		
		
	}
}
