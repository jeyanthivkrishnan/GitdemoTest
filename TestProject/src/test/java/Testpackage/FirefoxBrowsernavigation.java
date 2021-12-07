package Testpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class FirefoxBrowsernavigation {
	WebDriver driver = null;
  
  
  @Test
	public void browser_test1() throws InterruptedException
	
	
  { 
	  System.out.println("INside browser test 1");
	  System.out.println("Launch Facebook");
	  driver.navigate().to("https://www.facebook.com/");
     Thread.sleep(3000);
     WebElement emailinput = driver.findElement(By.id("email"));
     emailinput.sendKeys("abcd@gmail.com");
     Thread.sleep(3000);
     driver.findElement(By.name("pass")).sendKeys("abcd");
     //Thread.sleep(3000);
     driver.findElement(By.id("u_0_d_qh")).click();
     
  }
  @Test
	public void browser_test2() throws InterruptedException
	
	  { 
		System.out.println("Inside browser test 2");
		System.out.println("Launch Indeed");
		driver.navigate().to("https://www.indeed.com/");
		Thread.sleep(3000);
	  }
	  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\FirefoxDriver/geckodriver.exe");
	  driver = new FirefoxDriver();
	  System.out.println("Inside the before Test");
	  System.out.println("Launch the google");
	  driver.get("https://www.google.com/");
	  Thread.sleep(3000);
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Indide After Test");
	  driver.quit();
	  driver.close();

  }

}
