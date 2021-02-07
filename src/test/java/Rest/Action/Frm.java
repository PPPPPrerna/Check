package Rest.Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Frm {

	@Test
	
	public void era() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(200000000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		//driver.findElement(By.id("draggable")).click();
		
		Actions a = new Actions(driver);
	WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement destion = driver.findElement(By.xpath("//div[@id='droppable']"));
	
		a.moveToElement(driver.findElement(By.id("draggable"))).click().dragAndDrop(source, destion).build().perform();
		
		
		
		
	}
	
	
}
