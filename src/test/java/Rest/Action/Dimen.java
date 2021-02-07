package Rest.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dimen {

	@Test
	public void a1()
	{
		
		System.setProperty("webdriver.cgrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Dimension d=driver.manage().window().getSize();
		
	//	driver.manage().window().setSize(new Dimension(122,890));;
		
		
		System.out.println("This is d width"+d.getWidth());
		
		System.out.println("dis is d height"+d.getHeight());
		
		
		
		
		driver.get("https://ashishkumarportfolio.netlify.app/");
		
		String b=driver.findElement(By.xpath("//p[@class='brand']/strong")).getText();
		
		Assert.assertEquals(b, "Prerna");
		
		
		
		
		
	}
}
