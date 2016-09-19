package com.orgHRM.Tests;

import java.io.IOException;

import com.orgHRM.Master.orgMaster;

public class userregTest 
{
	public static void main(String[] args) throws IOException 
	{
		orgMaster om=new orgMaster();
		
		String res=om.org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("App Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("App Login "+res);
		
		res=om.org_Userreg("Vasavi Vemula", "VasaviVemula", "VasaviVemula", "VasaviVemula");
		System.out.println("App User registration "+res);
		
		res=om.org_Logout();
		System.out.println("App Logout "+res);
		
		om.org_Close();
		System.out.println("App Close Successfull");
	}

}
