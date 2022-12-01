package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.close();
//		Actions act=new Actions(driver);
//		Thread.sleep(1000);
////		WebElement user=driver.findElement(By.name("email"));
////		
////		act.click();
////		user.sendKeys("9284877467");
//		WebElement user2=driver.findElement(By.xpath("//a[text()='Careers]"));
//		Thread.sleep(1000);
//		act.scrollToElement(user2).perform();
//		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement user=driver.findElement(By.name("email"));
//		user.sendKeys("9284877467");
//		WebElement user1=driver.findElement(By.name("pass"));
//		user1.sendKeys("Akshay");
//		Thread.sleep(2000);
//		WebElement user2=driver.findElement(By.name("login"));
//		user2.click();
////		driver.close();
		
	}
	


		
		
		
		
		

	}


