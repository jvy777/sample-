package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	
 public WebDriver driver;
 public String url="https://www.guru99.com/find-element-selenium.html";
 		
  @Test(dependsOnMethods= {"gettingurl"},alwaysRun=true)
  public void gettingtitle() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "E://Eclipse//chromedriver_win32//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get(url);
	  String expectitle="Find Element and FindElements in Selenium WebDriver";
	  String actualtitle=driver.getTitle();
	  Assert.assertEquals(actualtitle, expectitle);
	  driver.close();
  }
  
  @Test(priority=1)
  public void gettingurl() {
	  
	  System.setProperty("webdriver.chrome.driver", "E://Eclipse//chromedriver_win32//chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get(url);
	  String expecturl="https://www.guru9.com/find-element-selenium.html";
	  String actualurl=driver.getCurrentUrl();
	  Assert.assertEquals(actualurl, expecturl);
	  driver.close();
}
}
