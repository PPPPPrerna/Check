package Rest.Action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Spice {

	@Test
	public void vpn() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		
		List<WebElement> l1=driver.findElements(By.xpath("//div[@class='dropdownDiv']/ul[1]/li"));
		
		for(int i=0;i<l1.size();i++) {
			
			String a=l1.get(i).getText();
			
			System.out.println(a);
			
			if(l1.get(i).getText().contains("Bagdogra (IXB)")) {
				
				l1.get(i).click();
				break;
				
			}
			
		}
		
		
	}
	

}
