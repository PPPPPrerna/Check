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

public class Aqw {

	@Test
	
	public void erp() {
		
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		
		ChromeOptions op = new ChromeOptions();
		
		op.addArguments("disable-notifications");
		
		WebDriver driver = new ChromeDriver(op);
		
		driver.manage().timeouts().implicitlyWait(2000000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://shop.adidas.co.in/");
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//a[text()='WOMEN']"))).build().perform();
		
		driver.findElement(By.xpath("//div[@class='tab-content']/div[2]/div/div/div[2]/ul/li[2]/a")).click();
		
		List<WebElement> l2=driver.findElements(By.xpath("//a[@class='adidasOriginals productIdentifier']"));
		
		//List<WebElement> l3=driver.findElements(By.xpath("//img[@class='lazy img-responsive']"));
		
		for(int i=0;i<l2.size();i++) {
			
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].scrollIntoView();", l2.get(i));
			
			if(l2.get(i).getText().equalsIgnoreCase("Women's adidas by Stella Mccartney Training Seamless Tank Top")) {
				
				System.out.println("cool");
				
				Actions as = new Actions(driver);
				
				//as.moveToElement(l3.get(i)).click().build().perform();
				
				List<WebElement> l4=driver.findElements(By.xpath("//img[@class='lazy img-responsive']"));
				
				js.executeScript("arguments[0].click();", l4.get(i));
				
				
				
				break;
				
			}
			
		}
		
		
	}
	
	
}
