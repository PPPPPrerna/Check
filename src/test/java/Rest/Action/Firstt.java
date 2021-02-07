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

public class Firstt {
	
	
	@Test
	public void vbn() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
ChromeOptions op = new ChromeOptions();
		
		op.addArguments("--disable-notifications");

		
		
		WebDriver driver = new ChromeDriver(op);
		
		driver.manage().timeouts().implicitlyWait(2000000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.get("https://shop.adidas.co.in/#category/Pag-60/No-0/0/All/maxDiscountPercent_d:[0%20100]");
		
		List<WebElement> l1=driver.findElements(By.xpath("//a[@data-catgtype='topcategory']"));
		
		for(int i=0;i<l1.size();i++) {
			
			if(l1.get(i).getText().equalsIgnoreCase("OUTLET")) {
				
				Actions a = new Actions(driver);
				
				a.moveToElement(l1.get(i)).build().perform();
				
				break;
				
			}
			
		}
		
		List<WebElement> l2=driver.findElements(By.xpath("//div[@class='tab-pane active']/div/div/div/div/a"));
		
	//	List<WebElement> l3=driver.findElements(By.xpath("//div[@class='tab-pane active']/div/div/div/ul/li[2]"));
		
		for(int i=0;i<l2.size();i++) {
			
			
			String x=l2.get(i).getText();
			
			System.out.println(x);
			
			if(l2.get(i).getText().equalsIgnoreCase("Women")) {
				
				System.out.println("Hi");
				
				//String xy=l3.get(i).getText();
				//System.out.println(xy);
				
			//	l3.get(i).click();
				
				WebElement w3=driver.findElements(By.xpath("//div[@class='tab-pane active']/div/div/div/ul/li[2]")).get(i);
				
				Actions a = new Actions(driver);
				
				a.moveToElement(w3).click().build().perform();
				
				System.out.println("cool");
				String hh=driver.findElements(By.xpath("//div[@class='tab-pane active']/div/div/div/ul/li[2]")).get(i).getText();
				
				System.out.println(hh);
				
				break;
				
			
			
		}
		
	
			
		
}

	}
}
