package day1;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class ieLaunch {

	public static void main(String[] args)
	{
		String expval="Google";
		System.setProperty("webdriver.ie.driver", "F:\\Cdownloads\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://google.com");
		
		String actval=driver.getTitle();
		if (expval.equalsIgnoreCase(actval))
		{
			System.out.println("pASS");
			
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
