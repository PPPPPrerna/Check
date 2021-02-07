package Rest.Action;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class One {

	
	
	@Test
	
	public void fgh() throws IOException {
		
		
		
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
				
			//	File src=l1.get(i).getScreenshotAs(OutputType.FILE);
				
				
			//	FileUtils.copyFile(src, new File("C:\\Users\\Prerna Pandey\\eclipse-workspace\\Action\\target\\ss.png"));
				
				
				l1.add(w1.get(i));
			}
			
			
		}
		
	
		for(int j=0;j<l1.size();j++) {
			
			HttpURLConnection connection = (HttpURLConnection) new URL(l1.get(j).getAttribute("href")).openConnection();
			
			
			connection.connect();
			
			String response = connection.getResponseMessage();
			
			connection.disconnect();
			
			System.out.println(l1.get(j).getAttribute("href")+" "+response);
			
		}


		
	//	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//	FileUtils.copyFile(src, new File("C:\\Users\\Prerna Pandey\\ssn.png"));
		
	//	System.out.println(l1.size());
		
	
	
	}
	
	
}
