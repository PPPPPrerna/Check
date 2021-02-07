package Rest.Action;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazee {

	@Test
	public void nmkl() throws MalformedURLException, IOException {
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(8000000, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
		
		WebElement w1=driver.findElement(By.xpath("//div[@id='navFooter']"));
		
		List<WebElement> l1=w1.findElements(By.tagName("a"));
		
		List<WebElement> l2 = new ArrayList<WebElement>();
		
		for(int i=0;i<l1.size();i++) {
			
			if(l1.get(i).getAttribute("href")!=null && (!l1.get(i).getAttribute("href").contains("javascript"))) {
				
				l2.add(l1.get(i));
				
			}
		}
		
		System.out.println(l2.size());
		System.out.println(l1.size());
		
		for(int i=0;i<l2.size();i++) {
			
			HttpURLConnection conn = (HttpURLConnection) new URL(l2.get(i).getAttribute("href")).openConnection();
			
			conn.connect();
			String a = conn.getResponseMessage();
			System.out.println(a);
			conn.disconnect();
			
		}


	}
	
	
}
