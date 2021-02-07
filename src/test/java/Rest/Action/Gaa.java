package Rest.Action;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gaa {

	@Test
	public void begin() throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2000000, TimeUnit.SECONDS);
		
		driver.get("https://www.game.tv/");
		
		List<WebElement> l1=driver.findElements(By.tagName("a"));
		
		System.out.println(l1.size());
		
		List<WebElement> l2 = new ArrayList<WebElement>();
		
		for(int i=0;i<l1.size();i++) {
			
			if(l1.get(i).getAttribute("href")!=null && !l1.get(i).getAttribute("href").contains("javascript")) {
				
				l2.add(l1.get(i));
				
			}
			
		}
		
		System.out.println(l2.size());
		
		for(int i=0;i<l2.size();i++) {
			
			HttpURLConnection connection = (HttpURLConnection) new URL(l2.get(i).getAttribute("href")).openConnection();
			
			connection.connect();
			
			String a=connection.getResponseMessage();
			
			System.out.println(a);
			
			connection.disconnect();
			
		}
		
	}
	
	
}
