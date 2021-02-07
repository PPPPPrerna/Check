package Rest.Action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Erp {

	@Test
	
	public void m1() {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20000000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		String s[] = {"Brocolli - 1 Kg" , "Beetroot - 1 Kg" , "Beans - 1 Kg"};
		
		List<String> l1 = new ArrayList<String>();
		
		l1=Arrays.asList(s);
		
		List<WebElement> l2=driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		for(int i=0;i<l2.size();i++) {
			
			if(l1.contains(l2.get(i).getText())) {
				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
			}
			
			
		}
		
		
		
		
		
		
		
		
	}
	
	
}
