package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class gmailLogin {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("Email")).sendKeys("gandesharath");
//		Sleeper.sleepTightInSeconds(5);
//		driver.findElement(By.id("Email")).clear();
		
		driver.findElement(By.name("signIn")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("1234567");
		
		driver.findElement(By.cssSelector("#signIn")).click();
	}

}
