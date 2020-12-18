package Tests;

import org.testng.annotations.AfterGroups;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class NewTest3 {
	
	@BeforeGroups
	public void Open() {
		  System.out.println("Launch the application");
		 
	  }
	  @Test(groups="email")
	  public void Composemail() {
		  System.out.println("Search the application");
		 
	  }
	  @Test(groups="email")
	  public void Draftmail() {
		  System.out.println("Help the application");
		 
	  }
	  @Test(groups="email")
	  public void Sendmail() {
		  System.out.println("BUy the application");
		 
	  }
	  @Test(groups="email")
	  public void Deletemail() {
		  System.out.println("Delete the application");
	}
	  //@AfterMethod
	 // @AfterClass
	  //@AfterTest
	  @AfterGroups
	  public void Close() {
		  System.out.println("Close the application");
		 
	  }
  }
