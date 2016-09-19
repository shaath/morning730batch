package Keyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.formula.functions.Replace;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.orgHRM.Master.orgMaster;

public class driverscript 
{
	@Test
	public void driver() throws IOException
	{
		DateFormat dformate=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date=new Date();
		String cDate=dformate.format(date);
		System.out.println(cDate);
		String c=cDate.replace("/", "");
		String c1=c.replace(" ", "");
		String c2=c1.replace(":", "");
		System.out.println(c2);
		
		orgMaster om=new orgMaster();
		String res=null;
		String xlpath="F:\\morning730am\\selenium\\src\\com\\orgHRM\\Testdata\\Keyword.xlsx";
		String xlout="F:\\morning730am\\selenium\\src\\com\\orgHRM\\Results\\keyres"+c2+".xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Testcase");
		XSSFSheet ws1=wb.getSheet("Teststeps");
		
		int tcRc=ws.getLastRowNum();
		int tsRc=ws1.getLastRowNum();
		
		for (int i = 1; i <= tcRc; i++) 
		{
			ws.getRow(i).createCell(3);
			String exe=ws.getRow(i).getCell(2).getStringCellValue();
			
			if (exe.equalsIgnoreCase("Y")) 
			{
				String tcId=ws.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= tsRc; j++)
				{
					String tstcId=ws1.getRow(j).getCell(0).getStringCellValue();
					
					if (tcId.equalsIgnoreCase(tstcId))
					{
						String key=ws1.getRow(j).getCell(3).getStringCellValue();
						
//						System.out.println(key);
						
						switch (key) 
						{
						case "Launch":
							res=om.org_Launch("http://orangehrm.qedgetech.com/");
							break;
						case "login":
							res=om.org_Login("Admin", "admin");
							break;
						case "logout":	
							res=om.org_Logout();
							om.org_Close();
							break;
						case "Empreg":
							res=om.org_EmpReg("Vasavi123", "Vasavi123");
							break;
						case "Usereg":
							res=om.org_Userreg("Vasavi123 Vasavi123", "Vasavi12344444", "Vasavi12344444", "Vasavi12344444");
							break;
						case "Ulogin":
							res=om.org_Login("Vasavi12344444", "Vasavi12344444");
							break;
						default:
							System.out.println("Select a Proper option");
							break;
						}
						
						ws1.getRow(j).createCell(4).setCellValue(res);
						
						if (!ws.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							ws.getRow(i).getCell(3).setCellValue(res);
						}
						else
						{
							ws.getRow(i).getCell(3).setCellValue("Fail");
						}
						
					}
					
				}
			}
			else
			{
				ws.getRow(i).createCell(3).setCellValue("BLOCKED");
			}
			
		}
		
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
	}

}
