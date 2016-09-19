package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class validation 
{
	public static void main(String[] args) 
	{
		String expval="google";
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		String actval=driver.getTitle();
		System.out.println(actval);
		
		String dr=driver.findElement(By.id("sb_ifc0")).getAttribute("dir");
		System.out.println(dr);
		
		System.out.println(driver.getCurrentUrl());
		
//		System.out.println(driver.getPageSource());
		
		if (expval.equalsIgnoreCase(actval)) 
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
