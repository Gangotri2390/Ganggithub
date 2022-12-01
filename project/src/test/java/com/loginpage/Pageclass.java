package com.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pageclass {
	WebDriver driver;
	By emailid = By.id("email");
	By pass = By.id("pass");

	public Pageclass(WebDriver driver) {
		this.driver =driver  ;

	}
	public void email() {
		driver.findElement(emailid).sendKeys("Jobbers");
		
	}
	public void pass() {
		driver.findElement(pass).sendKeys("12334");
		
	}

//	driver.findElement(By.id("email")).sendKeys("Jobbers");
//	driver.findElement(By.id("pass")).sendKeys("1234");
//	Thread.sleep(3000);

}
