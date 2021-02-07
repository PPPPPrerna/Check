package Rest.Action;

import org.testng.annotations.Test;

public class Act1 {
	
	@Test(groups={"Smoke"})
	
	public void d() {
		
		System.out.println("yes");
		
	}
	
	@Test( groups="Smoke")
	public void a() {
		
		System.out.println("no");
		
	}
	
	@Test
	public void b() {
		
		System.out.println("no comments");
	}

}
