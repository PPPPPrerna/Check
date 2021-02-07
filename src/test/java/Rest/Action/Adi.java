package Rest.Action;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Adi {
	
	
	@Test
	public void fgh() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		
		//DesiredCapabilities options = new DesiredCapabilities();
		
		//options.set
		
		ChromeOptions op = new ChromeOptions();
		
		op.addArguments("-disable-notifications");
		
		
		WebDriver driver = new ChromeDriver(op);
		
		driver.manage().timeouts().implicitlyWait(2000000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://shop.adidas.co.in/");
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//a[text()='SPORTS']"))).build().perform();
		
		//List<WebElement> l1=driver.findElements(By.xpath("//div[@class='tab-pane active']/div/div/div[2]/ul/li/a"));
		
	/*	for(int i=0;i<l1.size();i++) {
			
			System.out.println(l1.get(i).getText());
			if(l1.get(i).getText().contains("Footwear")) {
				
				l1.get(i).click();
				break;
			}
			
			
		}*/
		
		//driver.findElement(By.xpath("//div[@class='tab-pane active']/div/div/div[2]/ul/li[1]/a")).click();
		
		
	/*	List<WebElement> l1=driver.findElements(By.xpath("//div[@class='tab-pane active']/div/div/div/ul/li[1]/a"));
		
		for(int i=0;i<l1.size();i++) {
			
			System.out.println(l1.get(i).getText());
			
			
		}*/
		
		WebElement w1=driver.findElement(By.xpath("//div[@class='tab-pane active']/div/div/div[2]"));
		
		w1.findElement(By.xpath("ul/li[1]/a")).click();
		
		
		
	}

}
