package Rest.Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lets {

	@Test(dataProvider="njh")
	public void fgh(String name , String email , String message) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(8000000, TimeUnit.SECONDS);
		

driver.get("https://ashishkumarportfolio.netlify.app/");


driver.findElement(By.xpath("//input[@name='name']")).sendKeys(name);

driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);

driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys(message);
	}
	
	@DataProvider
	
	public Object[][] nmkl() {
		
	Object obj[][]= new Object[2][3];
	
	obj[0][0]="sndnndjd";
	obj[0][1]="aaaaaa";
	obj[0][2]="mmmmmmm";
	obj[1][0]="qqqq";
	obj[1][1]="pppp";
	obj[1][2]="ooooo";
	
	return obj;
		
	}
	
	@DataProvider
	
	public Object[][] njh(){
		
	Object b[][] = {{"aaaa","qqqq","nnnnn"},{"ssss","aaaa","jjjjjj"}}; 
	
	return b;
		
		
	}
	
	
}
