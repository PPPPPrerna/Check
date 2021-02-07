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

public class Gri {

	@Test
	
	public void fra() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		
ChromeOptions op = new ChromeOptions();
		
		op.addArguments("-disable-notifications");
		
		
		WebDriver driver = new ChromeDriver(op);
		
		driver.manage().timeouts().implicitlyWait(2000000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
		driver.get("https://shop.adidas.co.in/?gclid=Cj0KCQiA6t6ABhDMARIsAONIYyyQOomiv6R6LkYB9far3__wAsYVGU9cBGaXdIXgErcdTYUsPqCKjqoaAlFzEALw_wcB#category/Pag-60/No-0/0/All/maxDiscountPercent_d:[21%2060]");
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//a[text()='NEW ARRIVALS']"))).build().perform();
		
		driver.findElement(By.xpath("//div[@class='tab-pane active']/div/div/div[2]/ul/li[1]/a")).click();
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		
	//	js.executeScript("window.scrollBy(0,10000)");
		
		Actions a1 = new Actions(driver);
		
		a1.moveToElement(driver.findElement(By.xpath("//*[@id='productSearchTab_GE0350']/a/img"))).build().perform();
		
		
	}
	
}
