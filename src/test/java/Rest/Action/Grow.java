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

public class Grow {

	@Test
	
	public void erp() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2000000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://grofers.com/");
		
		driver.findElement(By.xpath("//button[text()='Detect my location']")).click();
		
		int price=0;
		
		
		while(price<1) {
		
		List<WebElement> l1=driver.findElements(By.xpath("//div[@class='category-slider__category-text']"));
		
		List<WebElement> l2 = new ArrayList<WebElement>();
		
		
		for(int i=0;i<l1.size();i++) {
			
			try {
			
			if(l1.get(i).getText().equalsIgnoreCase("Fashion and Lifestyle")) {
				
				//l2.add(l1.get(i));
				
				price++;
				
				
			}
			}
			
			catch(StaleElementReferenceException ex) {
				
				List<WebElement> l11=driver.findElements(By.xpath("//div[@class='category-slider__category-text']"));
					

				if(l11.get(i).getText().equalsIgnoreCase("Fashion and Lifestyle")) {
					
				//	l2.add(l11.get(i));
					
					price++;
					
					
				}
				
			}
			}
			
			//price=l2.size();
			
			
			if(price<1) {
				
				WebElement w1=driver.findElement(By.xpath("//button[@class='slider__arrow slider__arrow--next category-slider__arrow-next']"));
				
				
				JavascriptExecutor js = (JavascriptExecutor)driver;
				
				js.executeScript("arguments[0].click();", w1);

					
					
				
				
			}
			
		
		} 
		
		
	
	
}
}
