  package selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://omayo.blogspot.com/");
	WebElement multiSelect = driver.findElement(By.id("multiselect1"));
	Select dropdown=new Select(multiSelect);
	dropdown.selectByIndex(1);
	dropdown.selectByVisibleText("Audi");
	dropdown.selectByValue("volvox");
	String firstOption=dropdown.getFirstSelectedOption().getText();
	System.out.println("First selected option");
	System.out.println(firstOption);
	List<WebElement> allselect = dropdown.getAllSelectedOptions();
	System.out.println("All selected options");
	for(WebElement w:allselect)
	{
		System.out.println(w.getText());
	}
	List<WebElement> allOption = dropdown.getOptions();
	System.out.println("All options");
	for(WebElement w:allOption)
	{
		System.out.println(w.getText());
	}
	dropdown.deselectByIndex(0);
	dropdown.deselectAll();
}
}
