package com.grouping;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bike {
	@Test
	(dependsOnMethods = "tc_3" ,alwaysRun = true)
	  public void tc_1() {
		System.out.println("First");
		
	}

	@Test(groups = "sanity")
	public void tc_3() {
		System.out.println("Second Test");
		Assert.assertTrue(false);
		
	}
	

}
