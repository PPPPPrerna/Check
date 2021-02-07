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

public class AdidasPagination {
	
	
	@Test
	
	public void a1() {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
		
		ChromeOptions op = new ChromeOptions();
		
		op.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(op);
		
		driver.manage().timeouts().implicitlyWait(200000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://shop.adidas.co.in/");
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//a[text()='KIDS']"))).build().perform();
		
		driver.findElement(By.xpath("//div[@class='tab-pane active']/div/div/div[2]/ul/li[1]/a")).click();
		int x =0;
		
		
		while(x<1) {
		
		List<WebElement> l1=driver.findElements(By.xpath("//a[@class='adidasOriginals productIdentifier']"));
		
		for(int i=0;i<l1.size();i++) {
			
			if(l1.get(i).getText().equalsIgnoreCase("Kids-Unisex Running Star Wars 4UTURE Runner Shoes")) {
				
				
				x++;
				
				System.out.println(l1.get(i).getText());
				
				l1.get(i).click();
				
				break;
				
			}
			
		}
		
		if(x<1) {
			
			
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			
		}
		}
		
		
		
	}

}
