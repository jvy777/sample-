package Getcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalcommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://Eclipse//chromedriver_win32//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
     WebElement firstname= driver.findElement(By.xpath("/html[@id='facebook']/body[@class='fbIndex UIPage_LoggedOut _-kb _605a b_c3pyn-ahh chrome webkit win x1 Locale_en_US cores-gte4 _19_u hasAXNavMenubar']/div[@id='u_0_e']/div[@id='globalContainer']/div[@id='content']/div/div[@class='_8esj']/div[@class='_8esk']/div[@class='_8esm']/div[@id='registration_container']/div/div[@class='_58mf']/div[@id='reg_box']/div[@class='_8fgl']/form[@id='reg']/div[@id='reg_form_box']/div[@id='fullname_field']/div[@class='clearfix _58mh']/div[@class='mbm _1iy_ _a4y _3-90 lfloat _ohe']/div[@id='u_0_l']/div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input[@id='u_0_m']"));
     WebElement lastname= driver.findElement(By.xpath("/html[@id='facebook']/body[@class='fbIndex UIPage_LoggedOut _-kb _605a b_c3pyn-ahh chrome webkit win x1 Locale_en_US cores-gte4 _19_u hasAXNavMenubar']/div[@id='u_0_e']/div[@id='globalContainer']/div[@id='content']/div/div[@class='_8esj']/div[@class='_8esk']/div[@class='_8esm']/div[@id='registration_container']/div/div[@class='_58mf']/div[@id='reg_box']/div[@class='_8fgl']/form[@id='reg']/div[@id='reg_form_box']/div[@id='fullname_field']/div[@class='clearfix _58mh']/div[@class='mbm _1iy_ _a4y _3-90 lfloat _ohe']/div[@id='u_0_l']/div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input[@id='u_0_m']"));
	
	if (firstname.isDisplayed() && firstname.isEnabled())
	{
		firstname.sendKeys("Devil");
	}
	if (lastname.isDisplayed() && lastname.isEnabled())
	{
		lastname.sendKeys("Devilone");
	}
	}

}
