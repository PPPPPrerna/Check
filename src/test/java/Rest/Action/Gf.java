package Rest.Action;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gf {
	
	
	@Test
	public void asd() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(200000000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://grofers.com/?gclsrc=aw.ds&&gclid=CjwKCAiAr6-ABhAfEiwADO4sfa9pqh-c3lI0Umh5G__jxz06G0iYF0bDu_hcTS74W8OJutcEgJ6zkBoC6zkQAvD_BwE");
		
		driver.findElement(By.xpath("//button[text()='Detect my location']")).click();
		
		List<WebElement> l1=driver.findElements(By.xpath("//div[@class='store-card-categories'] //div[@class='category-slider__category-text']"));
		
		while(!driver.findElement(By.xpath("//div[@class='category-slider__category-text']")).getText().equalsIgnoreCase("Home Improvement and Accessories")) {
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			try {
			
	      WebElement w1= driver.findElement(By.xpath("//div[@aria-label='Next Product']"));
	      
	      js.executeScript("arguments[0].click();", w1);
	      
			}
			
			catch(StaleElementReferenceException ex) {
			
				  WebElement w1= driver.findElement(By.xpath("//div[@aria-label='Next Product']"));
			      
			      js.executeScript("arguments[0].click();", w1);
			    
				
				
			}
	      
			
		}
	
		
		
	}

}
