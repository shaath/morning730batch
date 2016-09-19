package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radiobuttons1 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
	
		List<WebElement> group1=block.findElements(By.name("group1"));
		for (int i = 0; i < group1.size(); i++)
		{
			String rText=group1.get(i).getAttribute("value");
			if (rText.equalsIgnoreCase("milk"))
			{
				group1.get(i).click();
				break;
			}
			
		}
		
		
		List<WebElement> group2=block.findElements(By.name("group2"));
		for (int j = 0; j < group2.size(); j++)
		{
			String rText1=group2.get(j).getAttribute("value");
			if (rText1.equalsIgnoreCase("beer"))
			{
				group2.get(j).click();
				break;
			}
			
		}
		
		
	}

}
