package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Goibibo {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
//		Actions act = new Actions(driver);
	driver.get("https://www.goibibo.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
//		act.click();

		WebElement We = driver.findElement(By.xpath("//span[text()='From'][1]"));
				
				
//
//		Thread.sleep(1000);
	We.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Pune");
		Thread.sleep(2000);
	

	}
}
