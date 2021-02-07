package Rest.Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Am {

	@Test
	public void fvb() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2000000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		/*driver.get("https://www.amazon.in/");
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-orders']"))).click().build().perform();
		
		driver.navigate().back();
		
		//driver.findElement(By.xpath("//span[@class='nav-line-2 nav-long-width']")).click();
		
		driver.findElement(By.xpath("//a[text()='Amazon Pay']")).click();
		
		driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_mobiles']")).click();
		
		String a1=driver.findElement(By.xpath("//div[@id='glow-ingress-block']/span[1]")).getText();
		
		System.out.println(a1);
		
		String b=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).getText();
		
		System.out.println(b);
		
		String d=driver.findElement(By.xpath("//div[@id='nav-global-location-slot']/span[1]/a[1]/div[2]/span[1]")).getText();
		
		System.out.println(d);
		
		String name=driver.findElement(By.xpath("//a[@id='nav-orders']/span[1]")).getText();
		
		System.out.println(name); */
		
		driver.get("https://www.booking.com/index.en.html?aid=309654;label=hotels-english-en-india-vl1TzBEahNveh3Wz3MVhFwS432876510899:pl:ta:p1:p2:ac:ap:neg:fi:tiaud-297601666475:kwd-17218370:lp9302104:li:dec:dm:ppccp=UmFuZG9tSVYkc2RlIyh9YcsZ-Id2vkzIfTmYhvC5HOg;ws=&gclid=CjwKCAiAl4WABhAJEiwATUnEF7XdsGugr2ObckFMjAcDWnNwIElV2okbGobNZK1qFSofDF8sKH_vsRoCDmYQAvD_BwE");
		
	//	driver.findElement(By.xpath("//div[@class='bui-group bui-button-group bui-group--inline bui-group--align-end bui-group--vertical-align-middle']/div[4]/a[1]")).click();
		
		//driver.findElement(By.xpath("//div[@class='bui-group bui-button-group bui-group--inline bui-group--align-end bui-group--vertical-align-middle']/div[5]/a[1]")).click();
		
		driver.findElement(By.xpath("//div[@class='bui-group bui-button-group bui-group--inline bui-group--align-end bui-group--vertical-align-middle']/div[6]/a[1]")).click();
		
	}
	
	
}
