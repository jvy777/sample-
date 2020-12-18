package Tests;

import java.util.Set;

//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest4 {
	
	public WebDriver driver;
	public String url="https://www.wix.com/";
	
  @BeforeTest
  public void launch() {
	System.setProperty("webdriver.chrome.driver", "E://Eclipse//chromedriver_win32//chromedriver.exe");
	 driver= new ChromeDriver(); 
	 driver.get(url);
  }
  @Test(priority=1)
  public void verifylink1() {
	  driver.findElement(By.xpath("(//a[@href='https://www.wix.com/website/templates'][contains(.,'Templates')])[3]")).click();
	  Set<String> windows=driver.getWindowHandles();
	  System.out.println(windows.size());
	  Assert.assertEquals(2,windows.size());
	  
	  
	  
  }
  @Test(priority=2)
  public void verifylink2() {
	  driver.findElement(By.xpath("(//a[@href='https://www.wix.com/explore/websites'][contains(.,'Explore')])[2]")).click();
	  Set<String> windows=driver.getWindowHandles();
	  System.out.println(windows.size());
	  Assert.assertEquals(3,windows.size());
	  
	  
	  
  }
  @Test(priority=3)
  public void verifylink3() {
	  driver.findElement(By.xpath("(//a[@href='https://www.wix.com/features/main'][contains(.,'Features')])[2]")).click();
	  Set<String> windows=driver.getWindowHandles();
	  System.out.println(windows.size());
	  Assert.assertEquals(4,windows.size());
	  
	  
	  
  }
 @AfterTest
  public void close() {
	  driver.close();
	  
	  
	  
  }
}
