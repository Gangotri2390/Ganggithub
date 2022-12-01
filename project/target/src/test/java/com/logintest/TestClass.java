package com.logintest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.loginpage.Pageclass;

public class TestClass {
	WebDriver driver;
	@BeforeMethod
	public  void Before() {
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}

	@Test
	public void Login() throws InterruptedException {
		Pageclass pr=new Pageclass(driver);
		pr.email();
		pr.pass();
		Thread.sleep(3000);	
	}
	@AfterMethod
	public void After() {
		driver.close();
	}
	}


	


