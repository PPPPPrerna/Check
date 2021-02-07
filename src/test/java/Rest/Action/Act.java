package Rest.Action;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Act {
	
	
	String s1[] = {"G Fresh Potato" , "G Fresh Onion"  , "Dabur Veggie Fruit & Vegetable Wash (Bottle)" , "G Fresh Brown Coconut","G Fresh Lady Finger"};
	
	
	//"G Fresh Tomato Hybrid" , "G Fresh Lady Finger" ,
	
	//,  "G Fresh Bottle Gourd (Lauki)"
	
	@Test 
	
	public void getstart() throws  IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(8000000, TimeUnit.SECONDS);
	

	driver.get("https://grofers.com/cn/vegetables-fruits/cid/1487");
	
	//try {
		
		
		if(driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[2]/header/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div/button")).isDisplayed()) {
			
			driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[2]/header/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div/button")).click();
			
			}
			
		/*	else {
				
				driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[2]/header/div[2]/div[2]/div/div/div/div[2]/div/div[3]/div[2]/a/span[2]")).click();
			}*/
			
			else {
				
				driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[2]/header/div[2]/div[2]/div/div/div/div[2]/div/div[3]/div[2]")).click();
			}
		
		try {
			List<WebElement> l1=driver.findElements(By.xpath("//div[@class='plp-product__name--box']"));
			
			List l2=Arrays.asList(s1);
			
			for(int i=0;i<l1.size();i++) {
				
				
				        
					 String name=l1.get(i).getText();
						
						if(l2.contains(name)) {
							
							System.out.println(name);
							
							//List<WebElement> l3=driver.findElements(By.xpath("//span[@class='add-to-cart__text']"));
							
							JavascriptExecutor js = (JavascriptExecutor)driver ;
							
							//List<WebElement> w1=(List<WebElement>)js.executeScript("return document.getElementsByClassName('add-to-cart__add-btn')");
							
							//w1.click();
							
							List<WebElement> w1= (List<WebElement>)js.executeScript("return document.getElementsByClassName('add-to-cart__text')");
							
							js.executeScript("arguments[0].click();",w1.get(i));
							
							//l3.get(i).click();
							
						}
					

					 
					 
				        
				    			  			
				  		}
		}
		
		
		catch (StaleElementReferenceException elementHasDisappeared) {
			
			List<WebElement> l1=driver.findElements(By.xpath("//div[@class='plp-product__name--box']"));
			
			List l2=Arrays.asList(s1);
			
			for(int i=0;i<l1.size();i++) {
				
				
				        
					 String name=l1.get(i).getText();
						
						if(l2.contains(name)) {
							
							System.out.println(name);
							
							//List<WebElement> l3=driver.findElements(By.xpath("//span[@class='add-to-cart__text']"));
							
							JavascriptExecutor js = (JavascriptExecutor)driver ;
							
							//List<WebElement> w1=(List<WebElement>)js.executeScript("return document.getElementsByClassName('add-to-cart__add-btn')");
							
							//w1.click();
							
							List<WebElement> w1= (List<WebElement>)js.executeScript("return document.getElementsByClassName('add-to-cart__text')");
							
							js.executeScript("arguments[0].click();",w1.get(i));
							
							//l3.get(i).click();
							
						}
					

					 
					 
				        
				    			  			
				  		}
			
			
		}
		
		

		  	

		    
		    	  
		    	  
		    	  
		      }
		
			
	
			}


		
	
	
	

