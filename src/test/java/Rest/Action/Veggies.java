package Rest.Action;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Veggies {
	
	
	@Test
	
	public void vpn() {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna Pandey\\Desktop\\chrome v-87\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
		List<String> l3 = new ArrayList<String>();
		
		l3.add("aaa");
		l3.add("bbb");
		l3.add("ddd");
		l3.add("eee");
		l3.add("aaa");
		
		long kl=l3.stream().filter(s->s.contains("a")).count();
		
		
		//System.out.println(kl);
		
		List<String> lj=l3.stream().distinct().collect(Collectors.toList());
		
		lj.forEach(s->System.out.println(s));
		
		
		
		
		/*lm.forEach(a->System.out.println(a));
		
		
		List<String> l1 = new ArrayList<String>();
		
		l1.add("aaa");
		l1.add("bbb");
		l1.add("cccc");
		l1.add("ddddd");
		*/
		
		
		
		
		
		
		
		
		
		
	}

}
