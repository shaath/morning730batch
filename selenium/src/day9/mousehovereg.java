package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehovereg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement cat=driver.findElement(By.id("nav-link-shopall"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(cat).build().perform();
		
		WebElement books=driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[3]/span"));
		act.moveToElement(books).build().perform();
		
		driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[3]/div[3]/div[2]/div/a[4]/span")).click();
		
	}
	
}	
		