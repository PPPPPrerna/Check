package Rest.Action;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sam {

	@Test
	
	public void njk() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(8000000, TimeUnit.SECONDS);
		

driver.get("https://www.google.com/search?q=ambani&rlz=1C1CHBF_enIN924IN924&oq=ambani&aqs=chrome..69i57j46i433j0i433l4j0j0i433.2705j0j7&sourceid=chrome&ie=UTF-8");
	
File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\Screenshot\\spl.png"));




	}
	
	
}
