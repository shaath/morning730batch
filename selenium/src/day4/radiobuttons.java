package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radiobuttons 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath(".//*[@id='SearchForm']/nav/ul"));
		List<WebElement> radios=block.findElements(By.tagName("li"));
		
		for (int i = 0; i < radios.size(); i++) 
		{
			String radiotext=radios.get(i).getText();
			System.out.println(radiotext);
			if (radiotext.equalsIgnoreCase("Round trip"))
			{
				radios.get(i).click();
				break;
			}
		}

	}

}
