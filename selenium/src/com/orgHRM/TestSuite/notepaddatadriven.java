package com.orgHRM.TestSuite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.orgHRM.Master.orgMaster;

public class notepaddatadriven 
{
	public static void main(String[] args) throws IOException 
	{
		orgMaster om=new orgMaster();
		String x="";
		String path="F:\\morning730am\\selenium\\src\\com\\orgHRM\\Testdata\\empdata.txt";
		String res="F:\\morning730am\\selenium\\src\\com\\orgHRM\\Results\\res.txt";
		FileReader fr=new FileReader(path);
		BufferedReader br=new BufferedReader(fr);
//		System.out.println(br.readLine());
		br.readLine();
		
		FileWriter fw=new FileWriter(res);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("FirstName$Lastname$Result");
		bw.newLine();
		om.org_Launch("http://orangehrm.qedgetech.com");
		om.org_Login("Admin", "admin");
		
		while ((x=br.readLine())!=null) 
		{
			System.out.println(x);
			String[] split=x.split("#");
			String f=split[0];
			String l=split[1];
			System.out.println(f+"----"+l);
			String result=om.org_EmpReg(f, l);
			bw.write(f+"$"+l+"$"+result);
			bw.newLine();
		}
		br.close();
		bw.close();
		
		om.org_Logout();
		om.org_Close();
	}

}
