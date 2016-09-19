package com.orgHRM.Tests;

import java.io.IOException;

import com.orgHRM.Master.orgMaster;

public class EmpregTest 
{
	public static void main(String[] args) throws IOException 
	{
		orgMaster om=new orgMaster();
		
		String res=om.org_Launch("http://orangehrm.qedgetech.com");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_EmpReg("Vasavi", "Vemula");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		
	}
}
