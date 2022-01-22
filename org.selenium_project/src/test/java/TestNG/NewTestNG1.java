package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestNG1 {
  @Test (priority=1, enabled=true)
  public void f() {
	  System.out.println("Test Method");
  }
  @BeforeMethod (enabled=true)
  public void beforeMethod() {
	  System.out.println("Beforemethod");
  }

  @AfterMethod 
  public void afterMethod() {
	  System.out.println("aftermethod");
  }

  @BeforeClass 
  public void beforeClass() {
	  System.out.println("Beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Beforetes");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("aftertest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforesuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("aftersuite");
  }
}
