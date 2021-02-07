package Rest.Action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tab {

	@Test
	
	public void fgh() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement w1=driver.findElement(By.xpath("//table[@id='customers']"));
		
		List<WebElement> l1=w1.findElements(By.xpath(".//tbody/tr"));
		
		System.out.println(l1.size());
		
		for(int i=2;i<l1.size();i++) {
			
			
			for(int j=1;j<=3;j++) {
			
			String a=driver.findElement(By.xpath("//tbody/tr["+i+"]/td["+j+"]")).getText();
			
			System.out.println(a);
			
			}
		}
		
		
		
	}
	
}
