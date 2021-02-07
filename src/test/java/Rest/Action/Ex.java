package Rest.Action;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex {
	
	
	@Test
	public void fgh() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(8000000, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<String> l1 = new ArrayList<String>();
		
		l1.add("Brocolli - 1 Kg");
		
		l1.add("Beetroot - 1 Kg");
		
		l1.add("Tomato - 1 Kg");
		
		List<WebElement> l2 = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		for(int i=0;i<l2.size();i++) {
			
			if(l1.contains(l2.get(i).getText()))
			{
				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				
			}
		}
		
		
		

		
		
	}

}
