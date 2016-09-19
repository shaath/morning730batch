package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calanderops 
{
	public static void main(String[] args) 
	{
		String date="7/August/2017";
		String[] split=date.split("/");
		String day=split[0];
		String month=split[1];
		String year=split[2];
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("DepartDate")).click();
		
		String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while (!calyear.equalsIgnoreCase(year)) 
		{
			driver.findElement(By.className("nextMonth ")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		
		String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		
		while (!calmonth.equalsIgnoreCase(month))
		{
			driver.findElement(By.className("nextMonth ")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		List<WebElement> cells=driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td"));
		for (int i = 0; i < cells.size(); i++)
		{
			String calday=cells.get(i).getText();
			if (calday.equalsIgnoreCase(day))
			{
				cells.get(i).click();
				break;
			}
		}
	}

}
