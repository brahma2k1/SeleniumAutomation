package org.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebooklocators {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		/*
		 * driver.get("https://www.facebook.com"); String x=driver.getTitle();
		 * System.out.println(x);
		 * driver.findElement(By.id("email")).sendKeys("prudvi@gmail.com");
		 * driver.findElement(By.id("pass")).sendKeys("prudvi"); //
		 * driver.findElement(By.name("login")).submit(); // Thread.sleep(5000);
		 * //driver.navigate().back();
		 * driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		 * Thread.sleep(5000);
		 */
		
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,3000)");  
		driver.findElement(By.xpath("(//a[text()='About Selenium'])[2]")).click();
		
		
		

		
		

	}

}
