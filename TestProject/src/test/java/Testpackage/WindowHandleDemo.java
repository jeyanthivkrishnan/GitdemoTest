package Testpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class WindowHandleDemo {
	WebDriver driver = null;
	
  @Test
  public void f() throws InterruptedException 
  {
	  
	  WebElement onewindowbutton = driver.findElement(By.id("newWindowBtn"));
	  String parentwindowhandle = driver.getWindowHandle();
	  System.out.println("ParentHandle:"+parentwindowhandle);
	  
	  onewindowbutton.click();
	  Thread.sleep(3000);
	 
	  Set<String> allhandles = driver.getWindowHandles();
	  for (String handles:allhandles)
	  {
		  System.out.println("window handle:"+handles);
		  
		  		if(!handles.equals(parentwindowhandle))
				 {
			  
		  			driver.switchTo().window(handles);
		  			driver.findElement(By.id("firstName")).sendKeys("John");
		  			Thread.sleep(3000);
		  			driver.close();
		  			
				  }
		  		driver.switchTo().window(parentwindowhandle);
		  		driver.findElement(By.id("name")).sendKeys("says Hi");
		  		Thread.sleep(3000);
	  }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  

	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium/chromedriver.exe");
	  driver  = new ChromeDriver();
	  driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	  driver.manage().window().maximize();
		  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  driver.quit();
  }

}
