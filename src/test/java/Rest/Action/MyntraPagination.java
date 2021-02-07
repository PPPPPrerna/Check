package Rest.Action;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyntraPagination {

	@Test
	
	public void a1() {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
		
		ChromeOptions op = new ChromeOptions();
		
		op.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(op);
		
		driver.manage().timeouts().implicitlyWait(2000000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Women']"))).build().perform();
		
		driver.findElement(By.xpath("//a[text()='Bra']")).click();
		
		int price = 0;
		
		
		while(price<1) {
		
		List<WebElement> l1=driver.findElements(By.xpath("//h4[@class='product-product']"));
		
		for(int i=0;i<l1.size();i++) {
			
			if(l1.get(i).getText().equalsIgnoreCase("Lightly Padded Everyday Bra")) {
				
				price++;
				
				l1.get(i).click();
				
				//System.out.println(l1.get(i).getText());
				
			}
			
		}
		
		if(price<1) {
			
			driver.findElement(By.xpath("//li[@class='pagination-next']")).click();
			
		}
		
		}
		
		
		
		
		
	}
	
	
}
