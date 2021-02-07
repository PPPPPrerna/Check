package Rest.Action;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hotl {

	@Test
	public void abc() {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(8000000, TimeUnit.SECONDS);
		
		driver.get("https://www.booking.com/index.en.html?aid=309654;label=hotels-english-en-india-vl1TzBEahNveh3Wz3MVhFwS473169986384:pl:ta:p1:p2:ac:ap:neg:fi:tiaud-297601666275:kwd-17218370:lp9302104:li:dec:dm:ppccp=UmFuZG9tSVYkc2RlIyh9YcsZ-Id2vkzIfTmYhvC5HOg;ws=&gclid=CjwKCAiA_9r_BRBZEiwAHZ_v12TAlBKNwblIw44Qf84MCAWJDxGb73BVhMr-Q0IMjiUSAZZicM-zuxoCAlQQAvD_BwE");
		
		
		driver.findElement(By.xpath("//div[@data-component='search/dates/date-field-select']")).click();
		
		
		while(!driver.findElement(By.xpath("//div[@class='bui-calendar__month']")).getText().contains("July")) {
			
			
			driver.findElement(By.xpath("//div[@class='bui-calendar__control bui-calendar__control--next']")).click();
			
		}
		
	List<WebElement> l1 =driver.findElements(By.xpath("//td[@data-bui-ref='calendar-date']"));
		
		for(int i=0;i<l1.size();i++) {
			
			if(l1.get(i).getText().contains("14")) {
				
				l1.get(i).click();
				break;
				
			}
		}
			
			while(!driver.findElement(By.xpath("//div[@class='bui-calendar__month']")).getText().contains("July")) {
				
				
				driver.findElement(By.xpath("//div[@class='bui-calendar__control bui-calendar__control--next']")).click();
				
			}
			
		List<WebElement> l2 =driver.findElements(By.xpath("//td[@data-bui-ref='calendar-date']"));
			
			for(int j=0;j<l2.size();j++) {
				
				if(l2.get(j).getText().contains("29")) {
					
					l2.get(j).click();
					break;
					
				}
		
	}
		
		
	}
	
}

