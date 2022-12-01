import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
//	@Before method
//	@ After method
//	@Before suite
//	@ After suite
//	@Before Class
//	@After Class
	
	
	@BeforeClass
	public void method() {
		System.out.println("Before Clad=ss");
	}
	@AfterClass
	public void method1() {
		System.out.println("After Clad=ss");
	}
	
	@Test
	
	public void tc_1() {
		System.out.println("First Test case");
		
	}
	
	
	@Test
	public void tc_2() {
		System.out.println("Second Test case");
		
	}


}
