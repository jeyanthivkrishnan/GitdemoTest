package Testpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class AlertsDemoautomation {
	
	WebDriver driver = null;
  //@Test
  public void Alertsone() throws InterruptedException
  {
	  
	  //Alert with ok button
	  driver.findElement(By.linkText("Alert with OK")).click();
	  Reporter.log("alert ok clicked");
	//  driver.findElement(By.cssSelector("button.btn.btn-danger")).click();
	  driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	  //Reporter.log("Button clicked");
	  Thread.sleep(2000);
	  Alert alertok = driver.switchTo().alert();
	  Reporter.log("Alert Message"+alertok.getText());
	  Thread.sleep(2000);
	  alertok.accept();
	  Thread.sleep(2000);
	  Reporter.log("Alert Message"+alertok.getText());
	  Reporter.log("Alert with ok worked fine");
	  driver.switchTo().defaultContent();
  }
  
 // @Test
  public void Alertokcancel() throws InterruptedException
  {
	  
	  driver.findElement(By.linkText("Alert with OK & Cancel")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	  Thread.sleep(5000);
	  Alert alertnew = driver.switchTo().alert();
	  Thread.sleep(2000);
	  Reporter.log("Alert Message"+alertnew.getText());
	 // alertnew.accept();
	  alertnew.dismiss();
	  Reporter.log("Alert with ok and cancel worked fine");
  }
  
  @Test
  public void alertwithtextbox() throws InterruptedException
  {
	  driver.findElement(By.linkText("Alert with Textbox")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	  Thread.sleep(5000);
	  Alert alertnew = driver.switchTo().alert();
	  Reporter.log("Alert Message"+alertnew.getText());
	  Thread.sleep(3000);
	 // alertnew.sendKeys("Hello");  
	  alertnew.accept();
	  Reporter.log("Alert Message"+alertnew.getText());
	  Reporter.log("Alert with ok and cancel worked fine");
	  
  }
  @BeforeTest
  public void beforeTest() {

	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		 driver.manage().window().maximize();
	  
	  
  }
  
  @AfterTest
  public void afterTest() 
  {
	 driver.close();
	 driver.quit();
	  
  }

}
