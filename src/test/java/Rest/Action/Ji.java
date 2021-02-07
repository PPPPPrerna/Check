package Rest.Action;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Ji {
	
	
	@Test
	
	public void fbh() {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(8000000, TimeUnit.SECONDS);
		
		driver.get("https://www.jiomart.com/");
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//a[text()=' Staples ']"))).build().perform();
		
		a.moveToElement(driver.findElement(By.xpath("//a[text()=' Dals & Pulses ']"))).click().build().perform();
		
		List<String> l1 = new ArrayList<String>();
		
		l1.add("Plain Tur / Arhar Dal 2 kg");
		
		l1.add("Plain Kabuli Chana 2 kg");
		
		l1.add("Good Life Raw Peanuts 1 kg");
		
		l1.add("Loose Chilka Moong Dal 1 kg");
		
		List<WebElement> l2 = driver.findElements(By.xpath("//span[@class='clsgetname']"));
		
		List<WebElement> l3=driver.findElements(By.xpath("//span[@class='txt_btn']"));
		
		for(int i=0;i<l2.size();i++) {
			
			if(l1.contains(l2.get(i).getText())) {
				
				l3.get(i).click();
				
			}
			
		}
		
		

		
	}

}
