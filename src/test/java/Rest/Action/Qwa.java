package Rest.Action;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Qwa {
	
	
	@Test
	
	public void erp() {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		
		ChromeOptions op = new ChromeOptions();
		
		op.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(op);
		
		driver.manage().timeouts().implicitlyWait(2000000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://shop.adidas.co.in/");
		
		Actions a = new Actions(driver);
		
		WebElement w1=driver.findElement(By.xpath("//a[text()='BRANDS']"));
		
		a.moveToElement(w1).build().perform();
		
		driver.findElement(By.xpath("//div[@class='tab-pane active']/div/div/div[2]/ul/li[2]/a")).click();
		
		List<WebElement> l1=driver.findElements(By.xpath("//a[@class='adidasOriginals productIdentifier']"));
		
		List<WebElement> l2=driver.findElements(By.xpath("//img[@class='lazy img-responsive']"));
		
		int k=0;
		
		
		for(int i=0;i<l1.size();i++) {
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].scrollIntoView();", l1.get(i));
			
			
			
			
			if(l1.get(i).getText().equalsIgnoreCase("Women's Classic Cargo Joggers")) {
				
				System.out.println("cool");
				Actions a3=new Actions(driver);
				
				a3.moveToElement(l2.get(i)).build().perform();
				
				break;
			}
			
		}
		
		
		List<WebElement> lb=driver.findElements(By.xpath("//span[@style='cursor:pointer;margin:0px 3px;']"));
		
		for(int i=0;i<lb.size();i++) {
			
			if(lb.get(i).getText().equalsIgnoreCase("M")) {
				
				lb.get(i).click();
				
				break;
				
			}
			
		}
		
		
		List<WebElement> ln=driver.findElements(By.xpath("//div[@id='card-cart-btn']"));
		
		for(int i=0;i<ln.size();i++) {
			
			if(l1.get(i).getText().equalsIgnoreCase("Women's Classic Cargo Joggers")) {
			
				ln.get(i).click();
				
				System.out.println("yeah");
				
				break;
				
				
			}
			
		}
		
		
		
		System.out.println("*********");
		List<WebElement> li=driver.findElements(By.xpath("//a[@class='adidasOriginals productIdentifier']"));
		
		List<WebElement> l22=driver.findElements(By.xpath("//img[@class='lazy img-responsive']"));
		
		for(int i=0;i<li.size();i++) {
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].scrollIntoView();", li.get(i));
			
			
			
			
			if(li.get(i).getText().equalsIgnoreCase("Men's Y-3 Classic Harrington Jacket")) {
				
				System.out.println("cool");
				Actions a3=new Actions(driver);
				
				a3.moveToElement(l22.get(i)).build().perform();
				
				break;
			}
			
		}
		
		
		List<WebElement> lbb=driver.findElements(By.xpath("//span[@style='cursor:pointer;margin:0px 3px;']"));
		
		for(int i=0;i<lbb.size();i++) {
			
			if(lbb.get(i).getText().equalsIgnoreCase("L")) {
				
				lbb.get(i).click();
				
				break;
				
			}
			
		}
		
		
		List<WebElement> lnn=driver.findElements(By.xpath("//div[@id='card-cart-btn']"));
		
		for(int i=0;i<lnn.size();i++) {
			
			if(li.get(i).getText().equalsIgnoreCase("Men's Y-3 Classic Harrington Jacket")) {
			
				lnn.get(i).click();
				
				break;
				
				
			}
			
		}
		
		
		WebElement we=driver.findElement(By.xpath("//div[@id='cartIcon']"));
	
	Actions ai = new Actions(driver);
	
	ai.moveToElement(we).build().perform();
	
	driver.findElement(By.xpath("//a[@class='btn_showcart']")).click();
	
	
	driver.findElement(By.xpath("//button[@button='checkForRedirectBtn']")).click();
	
		
	}

}
