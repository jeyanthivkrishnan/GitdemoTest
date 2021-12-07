/* Alert Example  */
package Testpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class AlertDemoHyr {
	WebDriver driver = null;
	
  //@Test
  public void alertHandling() throws Exception {
	  
	  Reporter.log("Simple Alert");
	  WebElement alert1 = driver.findElement(By.id("alertBox"));
	  alert1.click();
	  Thread.sleep(3000);
	  Alert simplealert = driver.switchTo().alert();
	  Reporter.log("Alert Message"+simplealert.getText());
	  Thread.sleep(3000);
	  simplealert.accept();
	  Thread.sleep(3000);
	  Reporter.log("Simple Alert handled.");
	  
	  
  }
  
//  @Test
  public void confirmationalert() throws Exception
  {
	  
	//  WebElement confirmalert =
	  driver.findElement(By.id("confirmBox")).click();
	  Alert cnfalert = driver.switchTo().alert();
	  Thread.sleep(3000);
	  Reporter.log("Confirmation Alert message is"+cnfalert.getText());
	  cnfalert.accept();
	  Thread.sleep(3000);
	  Reporter.log("Action for confirmation alert"+driver.findElement(By.id("output")).getText());
	  
  }
  
  @Test
  public void promptalertHandle() throws Exception
  {
	  
	  driver.findElement(By.id("promptBox")).click();
	  Reporter.log("Prompt alert clicked");
	  Thread.sleep(3000);
	  Alert promptalert = driver.switchTo().alert();
	//  promptalert.
	  promptalert.sendKeys("Hello");
	  promptalert.accept();
	  Reporter.log("Prompt alert message"+promptalert.getText());
	  Reporter.log("Prompt alert action"+driver.findElement(By.id("output")).getText());
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception
  {
	  

	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");	
		 driver.manage().window().maximize();
	     Thread.sleep(3000);
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  driver.quit();
  }

}
