package Rest.Action;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MRT {
	
	@Test
	
	public void sds() {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(8000000, TimeUnit.SECONDS);
		
		driver.get("https://www.jiomart.com/");
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//a[text()=' Snacks & Branded Foods ']"))).build().perform();
		
		a.moveToElement(driver.findElement(By.xpath("//a[text()=' Biscuits & Cookies ']"))).click().build().perform();
		
		List<String> l1 = new ArrayList<String>();
		
		l1.add("Britannia Good Day Cashew Cookies 600 g");
		
		l1.add("Cadbury Oreo Original Vanilla Creme Cookies Jumbo Pack 500 g");
		
		l1.add("Britannia Classic Little Hearts Biscuits 75 g");
		
		List<WebElement> l2=driver.findElements(By.xpath("//span[@class='clsgetname']"));
		
		List<WebElement> l3=driver.findElements(By.xpath("//span[@class='add_plus']"));
		
		for(int i=0;i<l2.size();i++) {
			
			if(l1.contains(l2.get(i).getText())) {
				
				System.out.println("cool");
				
			//driver.findElements(By.xpath("//div[@class='cat-item '] //span[@class='txt_btn']")).get(i).click();
				
				l3.get(i).click();
				
				/*JavascriptExecutor js =(JavascriptExecutor)driver;
				
				List<WebElement> w2=(List<WebElement>)js.executeScript("return document.getElementsByClassName('txt_btn')");*/
				
				
				//js.executeScript("arguments[0].click();", w2.get(i));
				
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
