package Rest.Action;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Xa {

	@Test
	
	public void m1() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://grofers.com/?gclsrc=aw.ds&&gclid=CjwKCAiAsOmABhAwEiwAEBR0ZieIzxSYDVmxjlC98GWlb6U5DnPZng6u2IPqB7SqOqB3gdc9fv6aKxoCqa8QAvD_BwE");
		
		driver.findElement(By.xpath("//button[text()='Detect my location']")).click();
		
		int price ;
		
		List<WebElement> lh = new ArrayList<WebElement>();
		
		do {
		
		List<WebElement> l1=driver.findElements(By.xpath("//div[@class='category-slider__category-text']"));
		
		for(int i=0;i<l1.size();i++) {
			
		//	try {
			
			if(l1.get(i).getText().equalsIgnoreCase("Fashion and Lifestyle")) {
				
				lh.add(l1.get(i));
				
			}
			//}
			
		/*	catch(StaleElementReferenceException ex) {
				
				List<WebElement> l2=driver.findElements(By.xpath("//div[@class='category-slider__category-text']"));
				
				
				if(l2.get(i).getText().contains("Fashion and Lifestyle")) {
					
					lh.add(l2.get(i));
					
				}
				
			}*/
			
			
		}
		
		price=lh.size();
		
		if(price<1) {
			
			WebElement w2=driver.findElement(By.xpath("//button[@class='slider__arrow slider__arrow--next category-slider__arrow-next']"));
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].click();", w2);
			
			
		}
		
		}while(price<1);
		
		
		
		
	}
	
}
