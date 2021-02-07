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

public class Jio {

	@Test
	
	public void start() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Actions a ;
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(8000000, TimeUnit.SECONDS);
		
		driver.get("https://www.jiomart.com/");
		
		a= new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//a[text()=' Dairy & Bakery ']"))).build().perform();
		
		driver.findElement(By.xpath("//a[text()=' Toast & Khari ']")).click();
		
		List<String> l1 = new ArrayList<String>();
		
		l1.add("Parle Real Elaichi Premium Rusk 200 g");
		l1.add("Britannia Toastea Premium Bake Rusk 273 g");
		
		List<WebElement> l2=driver.findElements(By.xpath("//span[@class='clsgetname']"));
		
		for(int i=0;i<l2.size();i++) {
			
			String name=l2.get(i).getText();
			
			if(l1.contains(name)) {
				
				List<WebElement> l4=driver.findElements(By.xpath("//div[@class='cart_btn']/button"));
				
				JavascriptExecutor js = (JavascriptExecutor)driver;
				
				js.executeScript("arguments[0].click();",l4.get(i));
				
			}
			
		}
		
		/*WebElement w1=driver.findElement(By.xpath("//span[text()='Britannia 100% Veg Choco Chill Sliced Cake 70 g']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", w1);*/
		
	}
	
}
