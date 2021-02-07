package Rest.Action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Srting {
	
	@Test
	public void fgh() {
		
		
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	
	List<WebElement> l8 = driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]"));
	

	for(int i=0;i<l8.size();i++) {
		
		if(l8.get(i).getText().equalsIgnoreCase("Strawberry")) {
			
			String a=driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[2]")).get(i).getText();
			
			System.out.println(a);
			break;
			
			
		}
		
	}
	
	}

}
