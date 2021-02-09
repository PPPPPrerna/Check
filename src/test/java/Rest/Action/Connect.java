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

public class Connect {
	
	
	@Test
	
	public void start() throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.driver.chrome", System.getProperty("user.dir")+"//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2000000, TimeUnit.SECONDS);
		
		driver.get("https://www.myntra.com/");
		
		List<WebElement> l1=driver.findElements(By.tagName("a"));
		
		List<WebElement> l2 = new ArrayList<WebElement>();
		
		for(int i=0;i<l1.size();i++) {
			
			if(l1.get(i).getAttribute("href")!=null && (!l1.get(i).getAttribute("href").contains("javascript"))) {
				
				
				l2.add(l1.get(i));
			}
		}
		
		System.out.println(l1.size());
		
		System.out.println(l2.size());
		
		for(int i=0;i<l2.size();i++) {
			
			HttpURLConnection con = (HttpURLConnection) new URL(l2.get(i).getAttribute("href")).openConnection();
			
			con.connect();
			
			String x=con.getResponseMessage();
			
			System.out.println(x);
			
			con.disconnect();
			
		}
		
		
	}

}
