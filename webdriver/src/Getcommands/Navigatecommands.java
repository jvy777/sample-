package Getcommands;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Navigatecommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://Eclipse//chromedriver_win32//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.nopcommerce.com/");
        System.out.println(driver.getTitle());
        
		driver.navigate().to("https://www.guru99.com/first-webdriver-script.html");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		
		driver.close();
	}
}




		
		
