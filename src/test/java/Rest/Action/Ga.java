package Rest.Action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ga {

	
	@Test
	public void nmk() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.game.tv/");
		
		List<WebElement> l1=driver.findElements(By.xpath("//figcaption[@class='game-name']"));
		
		for(int i=0;i<l1.size();i++) {
			
			
			try {
			
			
			String a=l1.get(i).getText();
			
			System.out.println(a);
			
			l1.get(i).click();
			
			driver.navigate().back();
			}
			
			catch(StaleElementReferenceException e) {
				
				List<WebElement> l2=driver.findElements(By.xpath("//figcaption[@class='game-name']"));
				
				
				String a=l2.get(i).getText();
				
				System.out.println(a);
				
				JavascriptExecutor js = (JavascriptExecutor)driver;
				
				js.executeScript("arguments[0].click();", l2.get(i));
				
				
				driver.navigate().back();
	
				
				
			}
			
		}
		
		
	}
	
}
