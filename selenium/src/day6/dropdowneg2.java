package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowneg2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.eenadu.net/");
		driver.manage().window().maximize();
		WebElement drop=driver.findElement(By.id("dist-option"));
		Select s=new Select(drop);
		
		List<WebElement> list=s.getOptions();
		for (int i = 0; i < list.size(); i++)
		{
			s.selectByIndex(i);
			
		}

	}

}
