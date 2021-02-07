package Rest.Action;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Veg {
	
	
	@Test
	public void cvc() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		List<WebElement> l1=driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]"));
		
	
		List<String> l2=l1.stream().filter(s->s.getText().contains("Rice")).map(a->getPriceValue(a)).collect(Collectors.toList());
		
		l2.forEach(x->System.out.println(x));
		
		
		
	}
	
	private static String getPriceValue(WebElement q) {
		
		
		String s1 = q.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return s1;
	}

}
