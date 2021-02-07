package Rest.Action;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gre {

	@Test
	
	public void erp() {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20000000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://grofers.com/");
		
		driver.findElement(By.xpath("//button[text()='Detect my location']")).click();
		
		List<WebElement> l2 = new ArrayList<WebElement>();
		
		int price;
		
		do {
			
			List<WebElement> l1=driver.findElements(By.xpath("//div[@class='category-slider__category-text']"));
			
			
			for(int i=0;i<l1.size();i++) {
				
				if(l1.get(i).getText().equalsIgnoreCase("Fashion and Lifestyle")) {
					
					l2.add(l1.get(i));
					
				}
				
			}
			
			price=l2.size();
			if(price<1) {
				
				WebElement w1=driver.findElement(By.xpath("//button[@class='slider__arrow slider__arrow--next category-slider__arrow-next']"));
				
				
				JavascriptExecutor js = (JavascriptExecutor)driver;
				
				js.executeScript("arguments[0].click();", w1);
						
				
			}
			
			
			
		}while(price<1);
		
		
		
		
		
		
		
	}
	
}
