package Rest.Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class As {

	@Test
	
	public void a1() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(200000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://ashishkumarportfolio.netlify.app/");
		
		String a=driver.findElement(By.xpath("//p[@class='brand']/strong")).getText();
		
		Assert.assertTrue(a.equalsIgnoreCase("Ashish"), "Correct Text");
		
		
		
	}
	
}
