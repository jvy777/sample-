package selenium.webdriver.test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By.*;

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E://Eclipse//chromedriver_win32//chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");
	    
	    driver.findElement(By.name("user-name")).sendKeys("standard_user");
	    driver.findElement(By.name("password")).sendKeys("secret_sauce");
	    driver.findElement(By.name("LOGIN")).click();
	    
	    
	    String exptitle="Swag Labs";
	    String acttitle=driver.getTitle();
	    
	    if(exptitle.equals(acttitle))
	    {
	    	System.out.println("Test Passed");
	    }
	    else
	    {
	    	System.out.println("Test failed");
	    }
	    }

	}

	

