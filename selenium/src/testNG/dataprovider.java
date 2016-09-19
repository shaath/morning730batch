package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import selenium.object;

public class dataprovider
{
	@Test(dataProvider="data")
	public void test(String u, String p)
	{
		System.out.println(u+"-----"+p);
	}
	
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] d=new Object[3][2];
		
		d[0][0]="Admin";
		d[0][1]="admin";
		
		d[1][0]="username";
		d[1][1]="Password";
		
		d[2][0]="username12";
		d[2][1]="Password12";
		return d;
	}

}
