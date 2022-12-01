package com.parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel2 {
	@Test
	public void tc_2() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println("Current thread1" +Thread.currentThread().getId());
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
}
}
