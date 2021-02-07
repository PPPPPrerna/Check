package Rest.Action;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Aq {
	
	
	@Test
	
	public void fhu() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://shop.adidas.co.in/");
		
		WebElement w3=driver.findElement(By.xpath("//a[text()='KIDS']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(w3).build().perform();
		
		WebElement w4=driver.findElement(By.xpath("//div[@id='Kids']/div/div/div/ul/li[2]/a"));
		
	w4.click();	
		
		
		
		
	}

}
