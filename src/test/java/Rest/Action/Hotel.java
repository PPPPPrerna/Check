package Rest.Action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hotel {
	
	
	@Test
	
	public void initialize() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Actions a;
	driver.get("https://www.myntra.com/?utm_source=Google&utm_medium=cpc&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=Cj0KCQiAqo3-BRDoARIsAE5vnaKxl3nGk1Lrw2mwvXmJkJ6H8ghGSyHY5gNO7_NTBzee1I6oUUvAv8MaAvoyEALw_wcB");	
	
	
	WebElement w1=driver.findElement(By.xpath("//a[text()='Women']"));
	a= new Actions(driver);
	a.moveToElement(w1).build().perform();
	driver.findElement(By.xpath("//a[text()='Ethnic Dresses']")).click();
	
	List<WebElement> l1=driver.findElements(By.xpath("//h3[@class='product-brand']"));
	
	List<WebElement> l2=driver.findElements(By.xpath("//img[@class='img-responsive']"));
	
	for(int i=0;i<l1.size();i++) {
		
		if(l1.get(i).getText().equalsIgnoreCase("Vishudh")) {
			
			//l1.get(i).click();
			l2.get(i).click();
			
			System.out.println("cool");
			break;
		}
	}
	
	}

}
