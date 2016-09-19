package day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alerteg {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://projects.qedgetech.com/primusbank1/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("login")).click();
		
		Alert alt=driver.switchTo().alert();
		String text=alt.getText();
		System.out.println(text);
		Thread.sleep(5000);
		alt.accept();
		

	}

}
