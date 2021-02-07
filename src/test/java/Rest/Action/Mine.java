package Rest.Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mine {

	@Test
	
	public void initialize() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(8000000, TimeUnit.SECONDS);
		
		driver.get("https://www.myntra.com/?utm_source=Google&utm_medium=cpc&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=Cj0KCQiAqo3-BRDoARIsAE5vnaKxl3nGk1Lrw2mwvXmJkJ6H8ghGSyHY5gNO7_NTBzee1I6oUUvAv8MaAvoyEALw_wcB");
		
		WebElement w1=driver.findElement(By.xpath("//div[@class='desktop-popularSearch']"));
		
		
		
		
		
	}
	
}
