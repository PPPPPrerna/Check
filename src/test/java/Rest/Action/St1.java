package Rest.Action;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class St1 {
	
	
	@Test
	
	public void fgh() {
		
	List<String> l1 = new ArrayList<String>();
	
	l1.add("aaaaa");
	
	l1.add("bbbbbbbb");
	
	l1.add("wwwwww");
	
	l1.add("qqqqq");
	
	Long ab=l1.stream().filter(a->a.startsWith("a")).count();
	
	System.out.println(ab);
	
	l1.stream().filter(a->a.startsWith("a"));
		
	}

}
