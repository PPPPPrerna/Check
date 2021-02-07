package Rest.Action;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Grp {
	
	
	@Test
	
	public void fbn() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(8000000, TimeUnit.SECONDS);
		

		driver.get("https://grofers.com/?gclsrc=aw.ds&&gclid=Cj0KCQiAjKqABhDLARIsABbJrGkcRZUtoeT6I7mKpFLR8r7hcinuPcSSYNdVcruK2cO8v2FQYpx-F1caArSsEALw_wcB");
		
		driver.findElement(By.xpath("//button[text()='Detect my location']")).click();
		
		WebElement w1=driver.findElement(By.xpath("//div[text()='Vegetables & Fruits']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", w1);
		
		List<String> l1 = new ArrayList<String>();
		
		l1.add("Veggie Clean 100% Safe, Scientific & Natural Fruit & Vegetable Wash Liquid, Removes 99.9% Germs, Pesticides & Waxes, No harmful Preservatives, Sulphates, Soap or Alcohol");
		
		l1.add("G Fresh Onion");
		
		l1.add("G Fresh Tomato Hybrid");
		
		List<WebElement> l2 = driver.findElements(By.xpath("//div[@class='plp-product__name--box']"));
		
		for(int i=0;i<l2.size();i++) {
			
			try {
			
			if(l1.contains(l2.get(i).getText())) {
				
			//	JavascriptExecutor js = (JavascriptExecutor)driver;
				
				//driver.findElements(By.xpath("//button[@class='add-to-cart__add-btn']/span[1]")).get(i).click();
				
				driver.findElements(By.xpath("//span[@class='add-to-cart__text']")).get(i).click();
				
				
			}
			
			}
			catch(StaleElementReferenceException ex) {
				
				List<WebElement> l3 = driver.findElements(By.xpath("//div[@class='plp-product__name--box']"));
				if(l1.contains(l3.get(i).getText())) {
					
					//	JavascriptExecutor js = (JavascriptExecutor)driver;
						
						//driver.findElements(By.xpath("//button[@class='add-to-cart__add-btn']/span[1]")).get(i).click();
						
					
					driver.findElements(By.xpath("//span[@class='add-to-cart__text']")).get(i).click();
					
						
						
					}
						
				
				
			}
			
			
		}
		
			
			
}
}
