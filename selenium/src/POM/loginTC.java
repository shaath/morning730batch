package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import day7.webdriverwait;

public class loginTC extends constants
{
	@Test
	public void org_Login()
	{
		
		driver.get("http://orangehrm.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		lp.login("Admin", "admin");
	
		ap.welcomeclick();
		
		ap.logoutclick();
		
		driver.close();
		
		
	}

}
