package Rest.Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Asw {
	
	
	@Test(dataProvider="q1")
	
	public void erp(String x , String y , String z) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20000000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://ashishkumarportfolio.netlify.app/");
		
		WebElement w1=driver.findElement(By.xpath("//input[@name='name']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();", w1 );
		
		w1.sendKeys(x);
		
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(y);
		
		driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys(z);
		
	}
	
	
	@DataProvider
	public Object q1() {
		
		Object b[][] = {{"ccc" , "sss@mmm.com" , "cool"} , {"aaa" , "sss.com" , "aaaa"} , {"qqq","ss@ll.com" ,"aa"}};
		
		return b ;
		
	}

}
