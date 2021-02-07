package Rest.Action;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Https {

	@Test
	
	public void erp() throws MalformedURLException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.myntra.com/?utm_source=Google&utm_medium=cpc&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=Cj0KCQiAqo3-BRDoARIsAE5vnaKxl3nGk1Lrw2mwvXmJkJ6H8ghGSyHY5gNO7_NTBzee1I6oUUvAv8MaAvoyEALw_wcB");
		
		driver.get("https://www.amazon.com/");
		
		
		WebElement w1=driver.findElement(By.xpath("//div[@id='navFooter']"));
		
		List<WebElement> l1=w1.findElements(By.tagName("a"));
		
		List<WebElement> l2 = new ArrayList<WebElement>();
		
		for(int i=0;i<l1.size();i++) {
			
			
			if(l1.get(i).getAttribute("href")!=null) {
				
				l2.add(l1.get(i));
				
			}
			
		}
		
		System.out.println(l2.size());
		
		//HttpURLConnection con = (HttpURLConnection) new URL()
		
		for(int j=0;j<l2.size();j++) {
			
			HttpURLConnection con = (HttpURLConnection) new URL(l2.get(j).getAttribute("href")).openConnection();
			
			con.connect();
			
			String a=con.getResponseMessage();
			
			
			
			con.disconnect();
			
			System.out.println(a);
			
			
		}
		
		
	}
	
}
