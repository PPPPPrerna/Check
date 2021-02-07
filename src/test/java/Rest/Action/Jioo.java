package Rest.Action;

import 	java.util.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Jioo {

	@Test
	
	public void m1() {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2000000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.jiomart.com/");
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//div[@class='explorer-menu']/ul[1]/li[3]/a"))).build().perform();
		
		driver.findElement(By.xpath("//div[@class='explorer-menu']/ul[1]/li[3]/ul[1]/li[1]/a")).click();
		
		java.util.List<String> l1 = new ArrayList<String>();
			
		l1.add("Amul Pasteurised Butter 500 g (Carton)");
		
		l1.add("Yakult Probiotic Drink 325 ml (Cup)");
		
		l1.add("Amul School Pack Butter 100 g (Pack)");
		
		List<WebElement> l7=driver.findElements(By.xpath("//span[@class='clsgetname']"));
		
		List<WebElement> lj=driver.findElements(By.xpath("//button[@title='ADD TO CART']"));
		
		for(int i=0;i<l7.size();i++) {
			
			if(l1.contains(l7.get(i).getText())) {
				
				lj.get(i).click();
				
			}
			
		}
		
	}
	
	
}
