package Rest.Action;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hotell {

	@Test
	
	public void erp() {
		
		System.setProperty("webdriver.driver.chrome", System.getProperty("user.dir")+"//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20000000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.booking.com/index.en.html?aid=309654;label=hotels-english-en-india-vl1TzBEahNveh3Wz3MVhFwS433577572936:pl:ta:p1:p2:ac:ap:neg:fi:tiaud-297601666475:kwd-17218370:lp9302104:li:dec:dm:ppccp=UmFuZG9tSVYkc2RlIyh9YcsZ-Id2vkzIfTmYhvC5HOg;ws=&gclid=CjwKCAiAjeSABhAPEiwAqfxURZgcazn8B-fJNgihgV1Vp7yQcERPeBXCflaCYU_RHcFndbo80c1RDBoCRaEQAvD_BwE");
		
		driver.findElement(By.xpath("//div[@data-mode='checkin']/div/span[1]")).click();
		
		while(!driver.findElement(By.xpath("//div[@class='bui-calendar__month']")).getText().contains("May")) {
			
		driver.findElement(By.xpath("//div[@data-bui-ref='calendar-next']")).click();	
		
		}
		
		
		List<WebElement> l1=driver.findElements(By.xpath("//td[@data-bui-ref='calendar-date']/span[1]/span"));
		
		
		
		for(int i=0;i<l1.size();i++) {
			
			if(l1.get(i).getText().equalsIgnoreCase("19")) {
				
				l1.get(i).click();
				
				break;
				
			}
			
		}
		
			
			
		
	
	
	
	while(!driver.findElement(By.xpath("//div[@class='bui-calendar__month']")).getText().contains("December")) {
		
	driver.findElement(By.xpath("//div[@data-bui-ref='calendar-next']")).click();	
	
	}
	
	
	List<WebElement> l2=driver.findElements(By.xpath("//td[@data-bui-ref='calendar-date']/span[1]/span"));
	
	
	
	for(int i=0;i<l2.size();i++) {
		
		if(l2.get(i).getText().equalsIgnoreCase("19")) {
			
			l2.get(i).click();
			
			break;
			
		}
		
	}
	
		
		
	}
	
	
	
		
		
		
		
		
	}
	
	

