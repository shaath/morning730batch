package com.orgHRM.TestSuite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.orgHRM.Master.orgMaster;

public class empregDatadriven 
{
	public static void main(String[] args) throws IOException 
	{
		DateFormat dateformate=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		Date date=new Date();
		
		System.out.println(dateformate.format(date));
		String d=dateformate.format(date);
		String d1=d.replace("/", "");
		String d2=d1.replace(" ", "");
		String d3=d2.replace(":", "");
		System.out.println(d3);
		orgMaster om=new orgMaster();
		String xlpath="F:\\morning730am\\selenium\\src\\com\\orgHRM\\Testdata\\Testdata.xlsx";
		String xlout="F:\\morning730am\\selenium\\src\\com\\orgHRM\\Results\\resTest"+d3+".xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Empreg");
		
		int rc=ws.getLastRowNum();
		om.org_Launch("http://orangehrm.qedgetech.com");
		om.org_Login("Admin", "admin");
		for (int i =1; i <= rc; i++) 
		{
			XSSFRow r=ws.getRow(i);
			
			XSSFCell c=r.getCell(0);
			XSSFCell c1=r.getCell(1);
			XSSFCell c2=r.createCell(2);
			
			String f=c.getStringCellValue();
			String l=c1.getStringCellValue();
			System.out.println(f+"-----"+l );
			String res=om.org_EmpReg(f, l);
						
			c2.setCellValue(res);
		}
		
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
		om.org_Logout();
		om.org_Close();
	}

}
