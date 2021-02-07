package Rest.Action;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Groof {
	
	
	@Test
	
	public void a1() {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2000000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://grofers.com/");
		
		driver.findElement(By.xpath("//button[text()='Detect my location']")).click();
		
		int x=0;
		
		while(x<1) {
		
		List<WebElement> l1=driver.findElements(By.xpath("//div[@class='category-slider__category-text']"));
		
		for(int i=0;i<l1.size();i++) {
			
			if(l1.get(i).getText().equalsIgnoreCase("Fashion and Lifestyle")) {
				
				x++;
				
			}
			
		}
		
		if(x<0) {
			
			driver.findElement(By.xpath("//div[@class='slider__arrow--nav slider__arrow--right icon-angle-bracket-right slider__arrow--circle']")).click();
		}
		
		}
		
		
	}

}
