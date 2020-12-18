package HeadLess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E://Eclipse//chromedriver_win32//chromedriver.exe");
		//ChromeOptions options=new ChromeOptions();
		//options.setHeadless(true);
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/");
		
		System.out.println("The title of the page:"+driver.getTitle());
	}

}
