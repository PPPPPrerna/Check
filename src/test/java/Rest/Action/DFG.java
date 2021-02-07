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

public class DFG {
	
	@Test
	
	public void fgh() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(8000000, TimeUnit.SECONDS);
		
		driver.get("https://www.jiomart.com/");

		Actions a = new Actions(driver);
		
		
		a.moveToElement(driver.findElement(By.xpath("//a[text()=' Dairy & Bakery ']"))).build().perform();
		
		a.moveToElement(driver.findElement(By.xpath("//a[text()=' Toast & Khari ']"))).click().build().perform();
		
		List<String> l1 = new ArrayList<String>();
		
		
		l1.add("Parle Real Elaichi Premium Rusk 200 g");
		
		l1.add("Britannia Toastea Premium Bake Rusk 273 g");
		
	
		
		//List<WebElement> l2 =driver.findElements(By.xpath("//span[@class='clsgetname']"));
		
		List<WebElement> l2=driver.findElements(By.xpath("//div[@class='cat-item ']/a/span[3]"));
		
		
		for(int i=0;i<l2.size();i++) {
			
			if(l1.contains(l2.get(i).getText())) {
				
				//List<WebElement> l8=driver.findElements(By.xpath("//button[@title='ADD TO CART']"));
				
			//	List<WebElement> l4=driver.findElements(By.xpath("//*[@id='mstar_box']/div/div/div/div/div/div/button/span[1]"));
				
List<WebElement> l4=driver.findElements(By.xpath("//div[@class='cart_btn']/button/span[2]"));
				
				JavascriptExecutor js = (JavascriptExecutor)driver;
				
				js.executeScript("arguments[0].click();",l4.get(i));
				
				
			//	System.out.println(l4.size());
				
		/*		System.out.println(l4.get(i).getText());
				JavascriptExecutor js = (JavascriptExecutor)driver;
				
				js.executeScript("arguments[0].click();", l4.get(i));*/
				
				
			}
			
		}
		
		
		
		
		
		
	}

}
