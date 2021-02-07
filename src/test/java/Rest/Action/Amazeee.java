package Rest.Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazeee {

	@Test
	public void m1() {
		
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20000000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement w1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(w1).click().sendKeys("Prerna").doubleClick().build().perform();
		
		
	}
	
	
	
}
