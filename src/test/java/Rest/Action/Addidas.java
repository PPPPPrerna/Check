package Rest.Action;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Addidas {
	
	
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
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		a.moveToElement(driver.findElement(By.xpath("//a[text()='NEW ARRIVALS']"))).build().perform();
		
		driver.findElement(By.xpath("//div[@class='tab-pane active']/div/div/div[3]/ul/li[2]/a")).click();
		
		List<WebElement> l1=driver.findElements(By.xpath("//a[@class='adidasOriginals productIdentifier']"));
		
		for(int i=0;i<l1.size();i++) {
			
			
			if(l1.get(i).getText().equalsIgnoreCase("Unisex adidas Training Trail Bottle 750 ML")) {
			//	js.executeScript("arguments[0].scrollIntoView();", l1.get(i));
				
				
				a.moveToElement(l1.get(i)).build().perform();
				
				driver.findElement(By.xpath("//*[@id='4061612192312']")).click();
				
				driver.findElements(By.xpath("//div[@id='card-cart-btn']")).get(i).click();
				
				
				break;
				
			}
			
		}
		
		
		
	}

}
