package learningWebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchWebSite {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
	}
}
