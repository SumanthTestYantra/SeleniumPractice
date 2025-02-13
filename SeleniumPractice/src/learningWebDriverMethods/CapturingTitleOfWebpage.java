package learningWebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingTitleOfWebpage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://pizzaonline.dominos.co.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		
//		driver.quit();
//		driver.close();
	}
}
