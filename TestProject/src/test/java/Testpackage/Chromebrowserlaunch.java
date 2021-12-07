package Testpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


public class Chromebrowserlaunch {
 
  
  WebDriver driver = null;
  
  @Test
  public void browserlaunch() throws InterruptedException {
	  
	 driver.get("https://www.indeed.com/");
	 driver.navigate().back();
	 Thread.sleep(5000);
	 driver.navigate().forward();
	 Thread.sleep(5000);
	 driver.get("https://www.dice.com/");
	 Thread.sleep(5000);
	 driver.navigate().refresh();
	 Thread.sleep(5000);
  }
  @BeforeTest
  public void beforeTest() {
	
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	 // driver.navigate().to("https://www.google.com/");
	  System.out.println("Lauch the chromebrowser");
	 // driver.navigate().to("https://www.google.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  driver.quit();
  }

}
