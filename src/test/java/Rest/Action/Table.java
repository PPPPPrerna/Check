package Rest.Action;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Table {

	@Test
	
	public void start() {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(8000000, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement w1=driver.findElement(By.xpath("//div[@class='tableFixHead']/table"));
		
		File sec=w1.getScreenshotAs(OutputType.FILE);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		
		List<WebElement> l1=w1.findElements(By.xpath(".//tbody/tr"));
		
		
		
		
		
		System.out.println(l1.size());
		
		String beforeXpath = ".//tbody/tr["; 
		
		String afterXpath = "]/td[4]";
		
		for(int i=1;i<l1.size();i++) {
			
			String s1=w1.findElement(By.xpath(beforeXpath+i+afterXpath)).getText();
			
		//	String s1=w1.findElement(By.xpath(".//tbody/tr["+i+"]/td[4]")).getText();
			
			System.out.println(s1);
			
		}
		
	}
	
	
}
