package Laptop;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotations {

	@Test
	public void demo()
	{
		System.out.println("Hello, I am the method");
	}
	
	@Test
	public void sample()
	{
		System.out.println("I am the sample method");
	}
	
	@BeforeSuite
	public void suite()
	{
		System.out.println("Welecome to my suite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("End of my suite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Welcome to my test");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("End of my test");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Welcome to my class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("End of my class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Welcome to my method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("End of my method");
	}
}
