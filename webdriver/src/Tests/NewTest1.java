package Tests;


//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest1 {
  //@BeforeMethod
//	@BeforeClass
	@BeforeTest
  public void Launch() {
	  System.out.println("Launch the application");
	 
  }
  @Test(priority=1)
  public void Search() {
	  System.out.println("Search the application");
	 
  }
  @Test(priority=8)
  public void Help() {
	  System.out.println("Help the application");
	 
  }
  //@AfterMethod
 // @AfterClass
  @AfterTest
  public void Close() {
	  System.out.println("Close the application");
	 
  }
  
}