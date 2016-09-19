package Grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class grideg1 
{
	boolean flag=false;
	String fCityText = null,tText = null;
	@Parameters("browser")
	@Test
	public void grid(String br) throws MalformedURLException
	{
		DesiredCapabilities cap=null;
		
		if (br.equalsIgnoreCase("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
			
		}
		else if (br.equalsIgnoreCase("chrome")) 
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
		}
		
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.24:4444/wd/hub"), cap);
		driver.get("http://www.khuranatravel.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
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
