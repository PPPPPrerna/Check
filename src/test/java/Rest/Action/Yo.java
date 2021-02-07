package Rest.Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Yo {

	@Test
	public void fgh() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20000000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://shop.adidas.co.in/#category/Pag-240/No-0/0/All/_facet_.DIVISION_CATEGORY_ss:(%22ACCESSORIES%22)%20AND%20_facet_.GENDER_FACET_ss:(%22WOMEN%22)%20AND%20maxDiscountPercent_d:[0%20100]");
		
		WebElement w1=driver.findElement(By.xpath("//a[text()='WOMEN']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(w1).build().perform();
		
		driver.findElement(By.xpath("//a[text()='Essentials']")).click();
		
		
	}
	
	
}
