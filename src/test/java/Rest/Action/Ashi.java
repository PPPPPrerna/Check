package Rest.Action;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ashi {

	
	@Test
	
	public void start() throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(8000000, TimeUnit.SECONDS);
		
		driver.get("https://ashishkumarportfolio.netlify.app/");
		
		List<WebElement> w1=driver.findElements(By.tagName("a"));
		
		System.out.println(w1.size());
		
		List<WebElement> l1 = new ArrayList<WebElement>();
		
		
		
		
		for(int i=0;i<w1.size();i++) {
			
			if(w1.get(i).getAttribute("href")!=null) {
				
				l1.add(w1.get(i));
			}
			
			if(w1.get(i).getAttribute("href")==null) {
				
				String x=w1.get(i).getAttribute("href");
				String b=w1.get(i).getAttribute("title");
				File src=w1.get(i).getScreenshotAs(OutputType.FILE);
				
				
				
				
				
				System.out.println(b);
				
				System.out.println(x);
			}
		}
		
		System.out.println(l1.size());
		
	/*	for(int i=0;i<l1.size();i++) {
			
			HttpURLConnection connection = (HttpURLConnection) new URL(l1.get(i).getAttribute("href")).openConnection();
			
			connection.connect();
			String s=connection.getResponseMessage();
			
			
			String a=l1.get(i).getAttribute("href");
			
			System.out.println(a);
			System.out.println(s);
			System.out.println("next");
			
			connection.disconnect();
			
			
		}*/
		
	}
}
