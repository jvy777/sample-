package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest6 {
  @Test(dataProvider="searchprovider")
 // @Parameters({"location","product"})
  public void verifyolx(String location,String product) {
	  
	  System.setProperty("webdriver.chrome.driver", "E://Eclipse//chromedriver_win32//chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.olx.in/");
	  driver.manage().window().maximize();
	// String location= "Visakhapatnam";
	// String product= "Cars";
	  driver.findElement(By.xpath("//input[@placeholder='Search city, area o suburb']")).click();
	  driver.findElement(By.xpath("//input[@placeholder='Search city, area o suburb']")).sendKeys(location);
	  driver.findElement(By.xpath("//input[@data-aut-id='searchBox']")).click();
	  driver.findElement(By.xpath("//input[@data-aut-id='searchBox']")).sendKeys(product);
	  driver.findElement(By.xpath("//div[@data-aut-id='btnSearch']")).click();
	  
	 // driver.close();
  }
  
  @DataProvider(name="searchprovider")
  public Object[][] getDataFromDataProvider()
  {
	  Object[][] data=new Object[3][2];
	  data [0][0]= "Kolkata";
	  data [0][1]= "Bikes";
	  data [1][0]= "Chennai";
	  data [1][1]= "fans";
	  data [2][0]= "Bangalore";
	  data [2][1]= "mobile";
	  return data;
	  
  }
  
	  
  }
