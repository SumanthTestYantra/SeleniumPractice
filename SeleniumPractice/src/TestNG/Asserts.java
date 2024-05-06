package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asserts {
@Test
public void demo()
{
	String username = "komalgupta121@gmail.com";
	String password = "Shakuni123.@";
	String url="https://demowebshop.tricentis.com/";

	// Launching the browser
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser is launched");
	driver.manage().window().maximize();
	System.out.println("The browser is maximized");
	SoftAssert sa=new SoftAssert();

	// Adding implicit wait
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	// launching the website
	driver.get(url);
	sa.assertEquals(driver.getCurrentUrl(),"hi","dummy");
	Reporter.log("Url is launched",true);
	
//	System.out.println("Demowebshop is launched");
//
//	// click on login
//	driver.findElement(By.linkText("Log in")).click();
//	System.out.println("user clicked on login");
//	String title = driver.getTitle();
//	if (title.contains("Login")) {
//		System.out.println("Login page is displayed");
//	} else
//		System.out.println("Login page is not displayed");
//
//	// Logging in to the application
//
//	// Entering email id
//	Thread.sleep(2000);
//	driver.findElement(By.id("Email")).clear();
//	driver.findElement(By.id("Email")).sendKeys(username);
//	System.out.println("Email has been entered to email id text field");
//
//	// Entering password
//	driver.findElement(By.id("Password")).clear();
//	driver.findElement(By.id("Password")).sendKeys(password);
//	System.out.println("Password is entered");
//
//	// clicking on login button
//	driver.findElement(By.xpath("//input[@value='Log in']")).click();
//	System.out.println("Clicked on login button");
//
//	// To check whether user is logged in or not
//	if (driver.findElement(By.linkText("komalgupta121@gmail.com")).isDisplayed()) {
//		System.out.println("User logged in successfully");
//	} else {
//		System.out.println("Login failed");
//	}
//
//	// Clicking on logout
//	driver.findElement(By.linkText("Log out")).click();
//	System.out.println("The user clicked on log out");
//	if (driver.findElement(By.linkText("Register")).isDisplayed()) {
//		System.out.println("User logged out successfully");
//	} else
//		System.out.println("Logout failed");
//
//	// closing the browser
	driver.quit();
	System.out.println("Browser is closed");
	sa.assertAll();
}
}
