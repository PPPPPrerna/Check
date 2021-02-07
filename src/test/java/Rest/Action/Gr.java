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

public class Gr {

	@Test
	public void fbn() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20000000, TimeUnit.SECONDS);
		
		driver.get("https://grofers.com/?gclsrc=aw.ds&&gclid=CjwKCAiAuoqABhAsEiwAdSkVVGKEeCYKsXqK-KATsFwxbhsXpso9ED_48b6nVAc955kdHAw5tDfO5RoCbP0QAvD_BwE");
		
		driver.findElement(By.xpath("//button[text()='Detect my location']")).click();
		
		List<WebElement> l1=driver.findElements(By.xpath("//div[@class='category-slider__category-text']"));
		
		for(int i=0;i<l1.size();i++) {
			
			if(l1.get(i).getText().equalsIgnoreCase("Personal Care")) {
				
				//l1.get(i).click();
				
				System.out.println("executed");
				
				JavascriptExecutor js = (JavascriptExecutor)driver;
				
				js.executeScript("arguments[0].click();", l1.get(i));
				
				System.out.println("cool");
				
				break;
				
			}
			
		}
		
		List<String> l2 = new ArrayList<String>();
		
		l2.add("L'Oreal Paris Total Repair 5 Damaged Hair Shampoo");
		
		l2.add("Closeup Ever Fresh Red Hot Gel Toothpaste - Buy 2 Get 1 Free (3x300 g)");
		
		l2.add("Dettol Original Handwash (Refill)");
		
		List<WebElement> l6=driver.findElements(By.xpath("//div[@class='plp-product__name--box']"));
		
		
		List<WebElement> l7=driver.findElements(By.xpath("//button[@class='add-to-cart__add-btn']"));
		
		for(int i=0;i<l6.size();i++) {
			
			if(l2.contains(l6.get(i).getText())) {
				
				l7.get(i).click();
								
			}
			
			
		}
		
		
		
	}
	
	
}
