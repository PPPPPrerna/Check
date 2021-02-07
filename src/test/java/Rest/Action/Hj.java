package Rest.Action;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hj {

	@Test
	
	public void fgy() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		int x;
		
		do {
		
		List<WebElement> l1=driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]"));
		
		List<WebElement> l2=l1.stream().filter(a->a.getText().contains("Cherry")).map(b->b.findElement(By.xpath("following-sibling::td[1]"))).collect(Collectors.toList());
		
		//l2.forEach(c->System.out.println(c));
		
		l2.forEach(d->System.out.println(d.getText()));
		
		 x=l2.size();
		 
		 if(x<1) {
			 
			 driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
			 
		 }
		
		}while(x<1);
		
		
	}
	
	
}
