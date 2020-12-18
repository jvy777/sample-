package Handlings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLinks {

	public static void main(String[] args) {
		
		String browser="chrome";
		WebDriver driver= null;
		
		if (browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E://Eclipse//chromedriver_win32//chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else
		{
			System.setProperty("webdriver.msedge.driver", "E://Eclipse//edgedriver_win32value//msedgedriver.exe");
		}
		
		String url="https://www.wix.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//p[@id='comp-jx8pobhu0label']")).click();
		
		driver.findElement(By.linkText("Start Creating")).click();
		driver.findElement(By.xpath("//*[@id=\"input_0\"]")).sendKeys("yash");
		driver.findElement(By.xpath("//*[@id=\"input_1\"]")).sendKeys("yash");
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		String y= driver.findElement(By.xpath("//button[@name='submit']")).getText();
		System.out.println(y);
		
		
		
		
	}

}
