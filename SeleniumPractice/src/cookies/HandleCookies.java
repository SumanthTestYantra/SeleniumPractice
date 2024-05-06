package cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCookies {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().
		
		driver.get("https://demo.guru99.com/test/cookie/selenium_cookie.php");
		Set cookies=driver.manage().getCookies();
		System.out.println(cookies);
		System.out.println(driver.manage().getCookieNamed("Selenium"));
		Cookie cook=new Cookie("MyCookie", "1234");
		driver.manage().addCookie(cook);
		System.out.println(driver.manage().getCookieNamed("MyCookie"));
//		driver.manage().deleteCookieNamed("MyCookie");
		driver.manage().deleteCookie(cook);
	
	}
}
