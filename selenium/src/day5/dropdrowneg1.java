package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdrowneg1 {

	public static void main(String[] args)
	{
		boolean flag=false;
		String fCityText = null,tText = null;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.khuranatravel.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("g-popup-close")).click();
		
		WebElement fdrop=driver.findElement(By.id("fromCity"));
		Select s=new Select(fdrop);
		
		List<WebElement> flist=s.getOptions();
		System.out.println(flist.size());
		
		WebElement tdrop=driver.findElement(By.id("toCity"));
		Select t=new Select(tdrop);
		
		for (int i = 0; i < flist.size(); i++)
		{
			s.selectByIndex(i);
			fCityText=flist.get(i).getText();
			System.out.println(fCityText);
			
			List<WebElement> tlist=t.getOptions();
			for (int j = 0; j < tlist.size(); j++)
			{
				t.selectByIndex(j);
				tText=tlist.get(j).getText();
				if (fCityText.equalsIgnoreCase(tText))
				{
					flag=true;
					break;
				}
			}
			if (flag)
			{
				break;
			}
			
			
		}
		if (flag) 
		{
			System.out.println(fCityText+" is available in to Drop down "+tText);
		}
		else
		{
			System.out.println("Pass");
		}
		
	}

}