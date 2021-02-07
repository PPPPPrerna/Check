package Rest.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Alert {

	@Test
	public void nml() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@class='inputs']")).sendKeys("Prerna");
		
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		
		String a=driver.switchTo().alert().getText();
		
		System.out.println(a);
		
		driver.switchTo().alert().accept();
		
		Actions a1 = new Actions(driver);
	
		
		
	}
	
}
