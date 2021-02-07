package Rest.Action;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mart {
	
	
	@Test
	public void fgh() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(8000000, TimeUnit.SECONDS);
		

		driver.get("https://www.jiomart.com/");
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//a[text()=' Dairy & Bakery ']"))).build().perform();
		
		driver.findElement(By.xpath("//a[text()=' Cheese ']")).click();
		
		List<String> l1 = new ArrayList<String>();
		
		l1.add("Britannia Cheese Cubes 200 g (Carton)");
		
		l1.add("Britannia Cheezza 400 g (Carton)");
		
		List<WebElement> l2 = driver.findElements(By.xpath("//span[@class='clsgetname']"));
		
		for(int i=0;i<l2.size();i++) {
			
			if(l1.contains(l2.get(i).getText())) {
				
				System.out.println("cool");
				
				//driver.findElements(By.xpath("//button[@type='button']/span[1]")).get(i).click();
				
				WebElement ws=driver.findElements(By.xpath("//span[@class='txt_btn']")).get(i);
				
				JavascriptExecutor js = (JavascriptExecutor)driver;
				
				js.executeScript("arguments[0].click();", ws);
				
				
				
			}
			
		}
		
		
		
	}

}
