package Tests;


import org.testng.annotations.Test;

public class NewTest2 {
 
  @Test(priority=1)
  public void Buy() {
	  System.out.println("BUy the application");
	 
  }
  @Test(priority=10)
  public void Delete() {
	  System.out.println("Delete the application");
}
}