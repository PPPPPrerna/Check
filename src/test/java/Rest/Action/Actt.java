package Rest.Action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Actt {

	
	@Test
	public void release() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement w1=driver.findElement(By.id("twotabsearchtextbox"));
		
		Actions a = new Actions(driver);
		
	Wait wait = new FluentWait(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().sendKeys("chair").clickAndHold().build().perform();
		
		//a.moveToElement(w1).click().keyDown(Keys.SHIFT).sendKeys("dahi").keyUp(Keys.SHIFT).build().perform();
		//a.moveToElement(w1).click().sendKeys(Keys.chord(Keys.SHIFT,"and")).build().perform();*/
		
		//List<WebElement> l4=driver.findElements(By.xpath("//li[@class='nav_first']"));
		
	//	System.out.println(l4.size());
		
		
	}
	
}
