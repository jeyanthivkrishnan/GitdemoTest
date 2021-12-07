package Testpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LocatorsExample {
	
	WebDriver driver = null;
	
  @Test
  public void f() throws InterruptedException {
	  System.out.println("INdise the function f");
	 /* driver.navigate().to("https://www.indeed.com/");
	  WebElement element = driver.findElement(By.name("text-input-what"));
			  element.sendKeys("SDET");*/
	/*  driver.navigate().to("https://www.facebook.com/");
	     Thread.sleep(3000);
	     WebElement emailinput = driver.findElement(By.id("email"));
	     emailinput.sendKeys("abcd@gmail.com");*/
			  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException{
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  Thread.sleep(3000);
	  driver.navigate().to("https://www.facebook.com/");
	     //Thread.sleep(3000);
	     WebElement emailinput = driver.findElement(By.id("email"));
	     emailinput.sendKeys("abcd@gmail.com");
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
	  driver.close();
	  
  }

}
