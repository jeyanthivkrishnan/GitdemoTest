package Testpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class QAregisterexmple {
	
	 WebDriver driver = null;
	
  @Test
  public void registerautomate() throws InterruptedException{
	  System.out.println("Inside automate function");
		driver.navigate().to("https://demoqa.com/automation-practice-form");	
		 driver.manage().window().maximize();
	  WebElement firtsname = driver.findElement(By.id("firstName"));
	  firtsname.sendKeys("Jeyanthi");
      WebElement lastname = driver.findElement(By.id("lastName"));
	  lastname.sendKeys("Venkadakrishnan");
	  WebElement emailid = driver.findElement(By.id("userEmail"));
	  emailid.sendKeys("jeya@gmail.com");
	 // Thread.sleep(3000);
		 WebElement phno = driver.findElement(By.id("userNumber"));
		 phno.sendKeys("7716727272");
		// Thread.sleep(3000);
	//	WebElement hobby = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
	//	hobby.click();
	//	 Thread.sleep(3000);
	// WebElement gender = driver.findElement(By.id("gender-radio-1"));
       // Thread.sleep(3000);
	//driver.findElement(By.id("gender-radio-1")).click();
	WebElement maleselected = driver.findElement(By.cssSelector("input[id='gender-radio-1']"));//.click();
	 Boolean g = maleselected.isSelected();
	// System.out.println(g);
	// maleselected.click();
	 if (g == false)
	 {
		 System.out.println("Inside if");
		 maleselected.click();
		// Thread.sleep(3000);
	 }

	  
	
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException
  {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\FirefoxDriver/geckodriver.exe");
	  driver = new FirefoxDriver();
	  //System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium/chromedriver.exe");
	  // driver = new ChromeDriver();
	   driver.navigate().to("https://www.google.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	 driver.quit();
  }

}
