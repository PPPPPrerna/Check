package Rest.Action;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Spicy {

	@Test
	
	public void m1() {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2000000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		
		List<WebElement> l1=driver.findElements(By.xpath("//a[@onclick='javascript:$CityDropDown.SetSelectedValue(this);return false;']"));
		
		for(int i=0;i<l1.size();i++) {
			
			if(l1.get(i).getText().contains("Gorakhpur")) {
				
				l1.get(i).click();
				
				break;
				
			}
			
		}
		
List<WebElement> l2=driver.findElements(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@onclick='javascript:$CityDropDown.SetSelectedValue(this);return false;']"));
		
		for(int i=0;i<l2.size();i++) {
			
			if(l2.get(i).getText().contains("Goa")) {
				
				l2.get(i).click();
				
				break;
				
			}
			
		}
		
		int price;
		
		do {
		
		List<WebElement> l3=driver.findElements(By.xpath("//span[@class='ui-datepicker-month']"));
		
		List<WebElement> l4 = new ArrayList<WebElement>();
		
		
		
		for(int i=0;i<l3.size();i++) {
			
			if(l3.get(i).getText().equalsIgnoreCase("April")) {
				
				l4.add(l3.get(i));
				
			}
			
		}
		
		price=l4.size();
		
		if(price<1) {
			
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			
		}
		
		
		
	}while(price<1);
	
		
		List<WebElement> l4=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar'] //td[@data-handler='selectDay']/a"));
		
		for(int i=0;i<l4.size();i++) {
			
			if(l4.get(i).getText().equalsIgnoreCase("19")) {
				
				l4.get(i).click();
				
				break;
				
			}
			
		}
		
		
	}
	
}
