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

public class First {
	
	Actions a;

	@Test
	public void dfg() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeOptions op = new ChromeOptions();
		
		op.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(op);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(200000000, TimeUnit.SECONDS);
		
		driver.get("https://shop.adidas.co.in/");
		
		WebElement w1=driver.findElement(By.xpath("//div[@id='cartIcon']"));
		
		 a = new Actions(driver);
		
		a.moveToElement(w1).build().perform();
		
		driver.findElement(By.xpath("//span[text()='CHECKOUT']")).click();
		
		driver.findElement(By.xpath("//input[@class='sprite-continue-shopping-blue']")).click();
		
		WebElement w2=driver.findElement(By.xpath("//a[@id='OUTLET']"));
		
		 a = new Actions(driver);
		 
		 a.moveToElement(w2).build().perform();
		 
		 List<WebElement> l3=driver.findElements(By.xpath("//a[contains(@style,'font-family:AdineuePROBlack')]"));
		 
	//	List<WebElement> l4= driver.findElements(By.xpath("//a[contains(@style,'font-size:13px;')]"));
		
		//System.out.println(l4.size());
		
		 for(int i=0;i<l3.size();i++) {
			 
			if(l3.get(i).getText().equalsIgnoreCase("Women")) {
				
				WebElement w5=l3.get(i);
				
				//String s=w5.findElement(By.xpath(".//a[contains(@style,'font-size:13px')]")).getText();
				
				List<WebElement> l0=w5.findElements(By.xpath(".//a[contains(@style,'font-size:13px')]"));
				
				System.out.println(l0.size());
				break;
				
			//	String s=l0.get(i).getText();
				
			//	System.out.println(s);
				
			/*	if(l4.get(i).getText().equalsIgnoreCase("Footwear")) {
					
					l4.get(i).click();
					
					break;
					
				} */
				
			}
			 
			 
		 }
		
		
	
		
	}
	
	
}
