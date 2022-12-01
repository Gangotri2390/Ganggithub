package com.logintest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.loginpage.Pageclass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	WebDriver driver;
	@BeforeMethod
	public  void Before() {
		WebDriverManager.chromedriver().setup();
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
	public void close() {

		driver.close();
	
	}
}




	


