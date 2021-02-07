package Rest.Action;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent {

@Test

public void a1() {
	
	
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(8000000, TimeUnit.SECONDS);
	
	driver.get("https://www.spicejet.com/");
	
	driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
	
	driver.findElement(By.xpath("//a[text()=' Belagavi (IXG)']")).click();
	
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[text()=' Amritsar (ATQ)']")).click();
	
	
	List<WebElement> w9=driver.findElements(By.xpath("//span[@class='ui-datepicker-month']"));
	
	int x=w9.size();
	
	System.out.println("col");
	System.out.println(x);
	
	
	//WebElement w1=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
			
	while( ! driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText().equalsIgnoreCase("May")) {
		
	//	try {	
				driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
		
	
//	}
		
	
	
/*	catch(org.openqa.selenium.StaleElementReferenceException ex) {
		
			
		
						
					driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
			
		
		
		}*/
	}
		

	
}
}

			
		
		
	


	

