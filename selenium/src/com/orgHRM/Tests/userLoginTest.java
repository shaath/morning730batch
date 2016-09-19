package com.orgHRM.Tests;

import java.io.IOException;

import com.orgHRM.Master.orgMaster;

public class userLoginTest 
{
	public static void main(String[] args) throws IOException 
	{
		orgMaster om=new orgMaster();
		
		String res=om.org_Launch("http://orangehrm.qedgetech.com");
		System.out.println(res);
		
		res=om.org_Login("VasaviVemula", "VasaviVemula");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
	}

}
