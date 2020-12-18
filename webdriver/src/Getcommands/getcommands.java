package Getcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E://Eclipse//chromedriver_win32//chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         //driver.get("https://www.nopcommerce.com/");
         driver.get("http://www.popuptest.com/popuptest3.html");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
         //String text= driver.findElement(By.xpath("/html[@id='index-page']/body/div[@class='master-wrapper-page']/section/div[@class='master-wrapper-content']/div[@class='container']/div[@class='master-column-wrapper']/div[@class='center-1']/div[@class='page home-page']/div[@class='page-body']/div[@class='banner-wrapper']/div[@class='home-page-banner']/div[@class='home-banner-text-section']/h1")).getText();
        // System.out.println(text);
         driver.close();
	}

}
