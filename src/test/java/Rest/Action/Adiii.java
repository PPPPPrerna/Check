package Rest.Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Adiii {

	@Test
	
	public void qw() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2000000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://shop.adidas.co.in/");
		
		driver.findElement(By.xpath(".//app.windget.Button[@text='Allow']")).click();
		
		
		
	}
	
}
