package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest5 {

	public WebDriver driver;
	public String url= "https://www.wix.com/";
	
	
	@Test
  public void calclate() {
		System.setProperty("webdriver.chrome.driver", "E://Eclipse//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//span[@class='style-k5c5djmmlabel'][contains(.,'Get Started')]")).click();
		boolean value=driver.findElement(By.xpath("//button[@name='submit']")).isDisplayed();
		System.out.println(value);
		Assert.assertTrue(value);
	
	}
}
