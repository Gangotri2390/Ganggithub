package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
	@BeforeClass
	public void pre() {
		System.out.println("Presanity");
	}
	@Test(dependsOnMethods = "tc_7",alwaysRun = true)
	
	public void tc_1() {
		
		
		System.out.println("First Test Case");
	}
@AfterSuite

	
	public void tc_7() {
		
		
		System.out.println("After suite Test Case");
		Assert.assertEquals(false, true);
	}
	@Test(enabled=false)
	public void tc_2() {
		System.out.println("Second Test Case");
	}
	@Test
	public void tc_3() {
		System.out.println("Third Test Case");
	}@AfterClass
	public void afterclass() {
		System.out.println("After class");
	}
}
