package Rest.Action;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calender {

	@Test
	public void m1() {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2000000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.booking.com/index.en.html?aid=309654;label=hotels-english-en-india-vl1TzBEahNveh3Wz3MVhFwS432876510899:pl:ta:p1:p2:ac:ap:neg:fi:tiaud-297601666475:kwd-17218370:lp9302104:li:dec:dm:ppccp=UmFuZG9tSVYkc2RlIyh9YcsZ-Id2vkzIfTmYhvC5HOg;ws=&gclid=CjwKCAiAsOmABhAwEiwAEBR0ZksueGRcbmaLV8ym94r2zLjrC9PaZy4Etgr52p6vCeu5V9ZGdTWPXxoCd2cQAvD_BwE");

		driver.findElement(By.xpath("//span[@class='sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb']")).click();
		
		int x =0;
		
		List<WebElement> l1=driver.findElements(By.xpath("//div[@class='bui-calendar__month']"));
		
		while(x<1) {
		
		for(int i=0;i<l1.size();i++) {
			
			try {
			
			if(l1.get(i).getText().contains("May")) {
				
				x++;
				
				
			}
			}
			
			catch(StaleElementReferenceException ex) {
				

				List<WebElement> l2=driver.findElements(By.xpath("//div[@class='bui-calendar__month']"));
				
				
				if(l2.get(i).getText().contains("December")) {
					
					x++;
					
					
				}
				
				
				
			}
			
		}
		
		if(x<1) {
			
			driver.findElement(By.xpath("//div[@class='bui-calendar__control bui-calendar__control--next']")).click();
			
		}
		
		}
		
	
		List<WebElement> lr=driver.findElements(By.xpath("//div[@class='bui-calendar__content']/div[2] //td[@class='bui-calendar__date']"));
	
		
		for(int i=0;i<lr.size();i++) {
			
			
			if(lr.get(i).getText().equalsIgnoreCase("19")) {
				
				lr.get(i).click();
				
				break;
				
			}
			
		}
		
		
	}
	
	
}
