package Rest.Action;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hey {

	@Test
	
	public void asa() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
		ChromeOptions ch = new ChromeOptions();
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(200000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://shop.adidas.co.in/");
		
		Actions a = new Actions(driver);
		
		WebElement w1=driver.findElement(By.xpath("//a[text()='OUTLET']"));
		
		a.moveToElement(w1).build().perform();
		
		List<WebElement> l1=driver.findElements(By.xpath("//div[@id='Outlet']/div/div/div/div/a"));
		
		for(int i=0;i<l1.size();i++) {
			
			if(l1.get(i).getText().equalsIgnoreCase("Women")) {
				
				//System.out.println("cool");
				
				driver.findElements(By.xpath("//div[@id='Outlet']/div/div/div/ul/li[1]/a")).get(i).click();
				
				break;
				
				
				
				
			}
			
		}
		
		List<String> lk = new ArrayList<String>();
		
		lk.add("Women's adidas Originals SUPERSTAR FR SHOES");
		
		lk.add("Women's adidas Originals Sleek Shoes");
		
		lk.add("Women's adidas Running Cyberg 1.0 Shoes");
		
		List<WebElement> lm = new ArrayList<WebElement>();
		
		List<WebElement> w3=driver.findElements(By.xpath("//a[@class='adidasOriginals productIdentifier']"));
		
		for(int i=0;i<w3.size();i++) {
			
			System.out.println(w3.get(i).getText());
			
			
			if(lk.contains(w3.get(i).getText())) {
				
				System.out.println("yeah");
				
				/*driver.findElement(By.xpath("//span[@id='4062056595097']")).click();
				
				driver.findElement(By.xpath("//div[@id='card-cart-btn']")).click();*/
				
				
				
				
			}
			
		}
		
		
	}
	
	}

