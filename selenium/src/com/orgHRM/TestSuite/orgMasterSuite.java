package com.orgHRM.TestSuite;

import java.io.IOException;

import com.orgHRM.Master.orgMaster;

public class orgMasterSuite 
{
	public static void main(String[] args) throws IOException 
	{
		orgMaster om=new orgMaster();
		//Login
		String res=om.org_Launch("http://orangehrm.qedgetech.com/");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		//Emp reg
		
		res=om.org_Launch("http://orangehrm.qedgetech.com");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_EmpReg("Vasavi23", "Vemula123");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		
		//User reg
		
		res=om.org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("App Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("App Login "+res);
		
		res=om.org_Userreg("Vasavi23 Vemula123", "VasaviVemula123", "VasaviVemula123", "VasaviVemula123");
		System.out.println("App User registration "+res);
		
		res=om.org_Logout();
		System.out.println("App Logout "+res);
		
		om.org_Close();
		System.out.println("App Close Successfull");
		
		//User login
		
		res=om.org_Launch("http://orangehrm.qedgetech.com");
		System.out.println(res);
		
		res=om.org_Login("VasaviVemula123", "VasaviVemula123");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
	}
}
