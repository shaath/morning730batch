package day9;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiplewindow {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
//		String wId=driver.getWindowHandle();
//		System.out.println(wId);
		driver.findElement(By.linkText("Privacy")).click();
		
		Set<String> s=driver.getWindowHandles();
		Iterator<String> it=s.iterator();
		
		while (it.hasNext())
		{
			String wId=it.next();
			System.out.println(wId);
			driver.switchTo().window(wId);
			System.out.println(driver.getTitle());
			
			try 
			{
				driver.findElement(By.linkText("Terms of Service")).click();
				System.out.println(driver.getTitle());
				break;
			} 
			catch (Exception e)
			{
				System.out.println("The expected link not available in this page");
			}
			
				
		}
//		driver.quit();
		driver.close();
//		driver.findElement(By.linkText("Terms of Service")).click();
	}

}
