package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class constants 
{
	public static String url="http://orangehrm.qedgetech.com";
	public static String u="Admin",p="admin";
	WebDriver driver=new FirefoxDriver();
	
	loginPage lp=PageFactory.initElements(driver, loginPage.class);
	adminHomepage ap=PageFactory.initElements(driver, adminHomepage.class);
}
