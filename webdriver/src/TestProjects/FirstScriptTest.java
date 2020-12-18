package TestProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScriptTest {

		
		WebDriver driver;
		
		public void LaunchBrowser()
		{
			System.setProperty("webdriver.chrome.driver", "E://Eclipse//chromedriver_win32//chromedriver.exe");
			driver=new ChromeDriver();
			System.out.println("Browser has been launched");
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
		}
		
		public void Login()
		{
			driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
			driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
			driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		}
		
		public void Logout() throws InterruptedException
		{
			driver.findElement(By.xpath("//a[@href='#'][contains(.,'Welcome Admin')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(.,'Logout')]")).click();
		}
		
		//public void Close()
	//		driver.close();
		//}

 public static void main(String[] args) throws InterruptedException
 {

	 FirstScriptTest obj=new FirstScriptTest();
	 obj.LaunchBrowser();
	 obj.Login();
	 obj.Logout();
// obj.Close();
}
}

