package Testpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Testclass {
  @Test
  public void firstfunction() {
	  System.out.println("Inside first Function");
  }
  @Test
  public void secondfunction() {
	
	  System.out.println("Inside second Function");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Inside beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Inside AfterTest");
  }

}
