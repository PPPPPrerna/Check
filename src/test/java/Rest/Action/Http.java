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

public class Http {

	
	@Test
	
	public void start() throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(8000000, TimeUnit.SECONDS);
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> l1=driver.findElements(By.tagName("a"));
		
		List<WebElement> l2 = new ArrayList<WebElement>();
		
		for(int i=0;i<l1.size();i++) {
			
			if(l1.get(i).getAttribute("href")!=null && (!l1.get(i).getAttribute("href").contains("javascript"))) {
				
				l2.add(l1.get(i));
				
			}
			
		}
		
		System.out.println(l2);
		
		
		for(int j=0;j<l2.size();j++) {
			
			HttpURLConnection connection = (HttpURLConnection) new URL(l2.get(j).getAttribute("href")).openConnection();
			
			
			connection.connect();
			
			String response = connection.getResponseMessage();
			
			connection.disconnect();
			
			System.out.println(l2.get(j).getAttribute("href")+" "+response);
			
		}
		
		
	}
	
}
