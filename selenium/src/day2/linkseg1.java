package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkseg1 {

	public static void main(String[] args) 
	{
		int count=0;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) 
		{
			String linkText=links.get(i).getText();
			if (!linkText.equalsIgnoreCase(""))
			{
				System.out.println(linkText);
				count++;
			}
			
		}

		System.out.println("The Visible links count is "+count);
		System.out.println("The Invisible links count is "+(links.size()-count));
	}

}
