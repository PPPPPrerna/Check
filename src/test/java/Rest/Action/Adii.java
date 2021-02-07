package Rest.Action;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Adii {

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
		
		a.moveToElement(driver.findElement(By.xpath("//a[text()='OUTLET']"))).build().perform();
		
		driver.findElement(By.xpath("//div[@class='tab-content']/div[6]/div/div/div[2]/ul/li[1]/a")).click();
		
		
	//	a2.moveToElement(driver.findElement(By.xpath("//div[@id='plpDiv']"))).build().perform();
		
	
		List<WebElement> l1=driver.findElements(By.xpath("//a[@class='adidasOriginals productIdentifier']"));
		
		List<WebElement> l2=driver.findElements(By.xpath("//img[@class='lazy img-responsive']"));
		
		
		for(int i=0;i<l1.size();i++) {
			
			if(l1.get(i).getText().equalsIgnoreCase("Women's adidas Originals SL Andridge Shoes")) {
				
				
				JavascriptExecutor js = (JavascriptExecutor)driver;
				
				js.executeScript("arguments[0].scrollIntoView();", l1.get(i));
				
				Actions a1 = new Actions(driver);
				
				a1.moveToElement(l2.get(i)).click().build().perform();
			
				//driver.findElements(By.xpath("//div[text()='Add To Bag']")).get(i).click();
				
			
				
				break;
				
			}		
		
	}
		
		Set s1=driver.getWindowHandles();
		
		Iterator<String> it=s1.iterator();
		
		String parent=it.next();
		
		String child=it.next();
		
		driver.switchTo().window(child);
		
		String a1=driver.getTitle();
		
		System.out.println(a1);
		
		//driver.findElement(By.xpath("//*[@id='facetSizeDetails']/label[3]")).click();
		
		
		List<WebElement> li=driver.findElements(By.xpath("//label[@data-productid='FX8106']"));
		
		for(int i=0;i<li.size();i++) {
			
			if(li.get(i).getText().equalsIgnoreCase("7")) {
				
				li.get(i).click();
				break;
				
			}
			
		}
		
		
		
	
	
	
}
}
