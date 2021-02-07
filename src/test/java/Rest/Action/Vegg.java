package Rest.Action;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Vegg {
	
	@Test
	
	public void fgy() {
		
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		int price;
		
		
		do {
			
			List<WebElement> l1=driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]"));
			
			
			List<WebElement> l2=l1.stream().filter(s->s.getText().contains("Cherry")).map(a->a.findElement(By.xpath("following-sibling::td[1]"))).collect(Collectors.toList());
			
		 price=l2.size();
		 
	//	 l2.forEach(b->b.getText());
		 
	/*	 List<String> l3=l1.stream().filter(s->s.getText().contains("Cherry")).map(a->a.findElement(By.xpath("following-sibling::td[1]")).getText()).collect(Collectors.toList());
			
		l3.forEach(q->System.out.println(q));	*/
			
			if(l2.size()<1) {
				
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
				
			}
			
			
			
			else {
				
				//l2.forEach(b->b.getText());
				
				l2.forEach(w->System.out.println(w.getText()));
				
			}
			
			
		}while(price<1);
		
		
		
	}
	

}
