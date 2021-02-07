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

public class Page {
	
	@Test
	
	public void m1() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20000000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://grofers.com/?gclsrc=aw.ds&&gclid=CjwKCAiAsOmABhAwEiwAEBR0ZjEN7CocYPq0s4nPqGAfpl6qIbB3CPhSmCVCFRsTecpAPgPPm2p2FBoCLrgQAvD_BwE");
		
		driver.findElement(By.xpath("//button[text()='Detect my location']")).click();
		
		List<WebElement> l1=driver.findElements(By.xpath("//div[@class='category-slider__category-text']"));
		
		int price =0;
		
		while(price<1) {
		
		for(int i=0;i<l1.size();i++) {
			
			try {
			
			if(l1.get(i).getText().equalsIgnoreCase("Fashion and Lifestyle")) {
				
				price++;
				
			}
		}
		
		catch(StaleElementReferenceException ex) {
			
			List<WebElement> l2=driver.findElements(By.xpath("//div[@class='category-slider__category-text']"));
			
			
if(l2.get(i).getText().equalsIgnoreCase("Fashion and Lifestyle")) {
				
				price++;
				
				
				
				
			}
			
			
		}
		
		}
		
		
		if(price<1) {
			
			WebElement w1=driver.findElement(By.xpath("//div[@aria-label='Next Product']"));
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].click();", w1);
			
			
			
		}
			}
		
	
		
	}
	

}
