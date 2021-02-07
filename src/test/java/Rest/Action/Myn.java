package Rest.Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Myn {
	
	
	
	@Test
	
	public void eas() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		
		ChromeOptions op = new ChromeOptions();
		
		op.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(op);
		
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/?utm_source=Google&utm_medium=cpc&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=Cj0KCQiAqo3-BRDoARIsAE5vnaKxl3nGk1Lrw2mwvXmJkJ6H8ghGSyHY5gNO7_NTBzee1I6oUUvAv8MaAvoyEALw_wcB");
		
		Actions a = new Actions(driver);
		
		WebElement w1=driver.findElement(By.xpath("//a[text()='Women']"));
		
		a.moveToElement(w1).build().perform();
		
		driver.findElement(By.xpath("//div[@class='desktop-navLinks']/div[2]/div/div/div/div/li[3]/ul/li[3]/a")).click();
		
		WebElement l1=driver.findElement(By.xpath("//h4[text()='Women Solid Mid-Top Flat Boots']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();", l1);
		
		
		
	}

}
