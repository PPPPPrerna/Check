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

public class Grof {

	
	@Test
	public void erp() {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(200000000, TimeUnit.SECONDS);
		
		driver.get("https://grofers.com/?gclsrc=aw.ds&&gclid=Cj0KCQiA9P__BRC0ARIsAEZ6irhIGXwsz8qTT5kZWeJCbSwY6Sq3SnAWPP4XJPR1EPGvtFSrw-i-Iu0aArgREALw_wcB");
		
		driver.findElement(By.xpath("//button[@class='btn location-box mask-button']")).click();
		
		try {
		
		WebElement w1=driver.findElement(By.xpath("//div[text()='Vegetables & Fruits']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", w1);
		
		}
		catch(StaleElementReferenceException  e) {
			
			WebElement w1=driver.findElement(By.xpath("//div[text()='Vegetables & Fruits']"));
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].click();", w1);
			
			
			
		}
		
		List<String> l9 = new ArrayList<String>();
		
		l9.add("Dabur Veggie Fruit & Vegetable Wash (Bottle)");
		l9.add("G Fresh Onion");
		
		List<WebElement> l8=driver.findElements(By.xpath("//div[@class='plp-product__name--box']"));
		
		for(int i=0;i<l8.size();i++) {
			
			try {
			String name=l8.get(i).getText();
			
			if(l9.contains(name)) {
			driver.findElements(By.xpath("//span[@class='add-to-cart__text']")).get(i).click();	
			}
			}
		
			catch(StaleElementReferenceException  e) {
				
				List<WebElement> c=driver.findElements(By.xpath("//div[@class='plp-product__name--box']"));
				
				
				String name=c.get(i).getText();
				
				if(l9.contains(name)) {
				driver.findElements(By.xpath("//span[@class='add-to-cart__text']")).get(i).click();	
				}
			}
				
			
				
				

			
			
			
		/*	try {
			
			if(l9.contains(l8.get(i).getText())) {
				
				driver.findElement(By.xpath("//button[@class='add-to-cart__add-btn']")).click();
			}
			}
			
			catch(StaleElementReferenceException  e1) {
				
				if(l9.contains(l8.get(i).getText())) {
				driver.findElement(By.xpath("//button[@class='add-to-cart__add-btn']")).click();	
				
				}
			}*/
			
			
		}
		
		
		
	}
	
}
