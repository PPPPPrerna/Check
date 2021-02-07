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

public class Aqq {

	@Test
	
	public void er() {
		
		
		
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2000000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.jiomart.com/");
		
		Actions a = new Actions(driver);
		
		WebElement w1=driver.findElement(By.xpath("//a[text()=' Dairy & Bakery ']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", w1);
		
		List<String> l1 = new ArrayList<String>();
		
		l1.add("Parle Real Elaichi Premium Rusk 200 g");
		
		l1.add("Muffets And Tuffets White Bread 400 g");
		
		l1.add("Yakult Probiotic Drink 325 ml (Cup)");
		
		List<WebElement> l2 =driver.findElements(By.xpath("//span[@class='clsgetname']"));
		
		List<WebElement> lb=driver.findElements(By.xpath("//button[@title='ADD TO CART']"));
		
		for(int i=0;i<l2.size();i++) {
			
			
			if(l1.contains(l2.get(i).getText())) {
				
				lb.get(i).click();
				
			}
			
		}
		
	}
	
}
