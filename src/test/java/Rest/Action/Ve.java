package Rest.Action;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ve {
	
	@Test
	
	public void fgh() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2000000, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		int price;
		
		do {
			
			List<WebElement> l1=driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]"));
			
			List<String> l2=l1.stream().filter(s->s.getText().contains("Banana")).map(a->a.getText()).collect(Collectors.toList());
			
			price=l2.size();
			
			if(price<1) {
				
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
				
				
			}
			
			
		}while(price<1);
		
		
		
		
		
		
		
	}

}
