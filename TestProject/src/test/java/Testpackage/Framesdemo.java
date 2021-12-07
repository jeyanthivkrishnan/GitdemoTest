package Testpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Framesdemo {
	
	WebDriver driver = null;
  @Test
  public void f() throws InterruptedException
  {
	  
 WebElement name = driver.findElement(By.id("name"));
 name.sendKeys("Hello");
 Thread.sleep(3000);
 
 JavascriptExecutor js = (JavascriptExecutor)driver;
 js.executeScript("window.scrollBy(0,300)");
 driver.switchTo().frame(driver.findElement(By.id("frm1")));
 Reporter.log("Sitching to frame 1");

 Select dropdown = new Select(driver.findElement(By.id("selectnav1")));
dropdown.selectByVisibleText("Tech News");
	  
driver.switchTo().defaultContent();
name.sendKeys("World");
Thread.sleep(3000);
Reporter.log("Sitching to frame 2");
driver.switchTo().frame(driver.findElement(By.id("frm2")));
driver.findElement(By.id("firstName")).sendKeys("Henry");
Thread.sleep(3000);
driver.switchTo().defaultContent();


  }
  @BeforeTest
  public void beforeTest() {

	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium/chromedriver.exe");
	  driver  = new ChromeDriver();
	  driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	  driver.manage().window().maximize();
		  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  driver.quit();
	  
  }

}
