package seleniumpack2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prog2 {

		int a,b,c;
		
		public void m3(int a,int b)
		{
			c=a+b;
			System.out.println("The addition of c is:"+c);
		}
		public void m4(int a, int b)
		{
			c=a-b;
			System.out.println("The subtraction of c is:"+c);
		}
		public static void main(String[] args) {
			
			prog2 obj1=new prog2();
			obj1.m3(30,40);
			obj1.m4(30,20);
	//		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
		//	WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
		//	driver.quit();
			 
	}

}

