package Rest.Action;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JJ {
	
	@Test
	
	public void fgh() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2000000, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("s");
		
		List<WebElement> l1=driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]"));
		
		List<WebElement> l2=l1.stream().filter(a->a.getText().contains("s")).collect(Collectors.toList());
		
		System.out.println("The size of l1 is"+l1.size());
		
		System.out.println("The sizeof l2 is "+l2.size());
		
		
	}

}
