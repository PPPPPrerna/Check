package Rest.Action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ashh {
	
	
	@Test
	public void m1() throws IOException {
		
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ashishkumarportfolio.netlify.app/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement w1=driver.findElement(By.xpath("//input[@name='name']"));
		
		js.executeScript("arguments[0].scrollIntoView();", w1);
		
		/*File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"//Screenshot"+"//SSN.jpg"));*/
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		File src =tk.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"//SS"+"//vb.jpg"));
		
		
	}
	
	
	@Test (dataProvider="erpp")
	public void erp(String a , String b , String c) {
		
	
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ashishkumarportfolio.netlify.app/");
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(a);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(b);
		
		driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys(c);
		
		
	
		
	}
	
	
	@DataProvider
	
	public Object erpp() {
		
		Object b[] = new Object[][] {{"Hello","aaa@bbb.com","wwww"} ,{"qqqq","eee.com", "eee"}};
		
		return b;
		
	}
	

}
