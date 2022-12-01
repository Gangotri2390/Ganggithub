package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Passward {
	@Test(alwaysRun=true)
		
	
	public void tc_4() {
		System.out.println("Fourth Test Case");
	}
	@Test
	public void tc_5() {
		System.out.println("Fifth Test Case");
	}
	@Test()
	public void tc_6() {
		System.out.println("Sixth Test Case");
//		Assert.assertEquals(false, true);
	}


}
