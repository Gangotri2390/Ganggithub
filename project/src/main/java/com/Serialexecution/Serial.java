package com.Serialexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Serial {
	@Test
	public static void  tc_1() {
		System.out.println( Thread.currentThread().getId());
		System.out.println("First Test Case");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.close();
	}
	@Test
	public static void  tc_2() {
		System.out.println( Thread.currentThread().getId());
		System.out.println(" Second Test Case");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.close();
	}
	}

