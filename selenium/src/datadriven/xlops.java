package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlops 
{

	public static void main(String[] args) throws IOException 
	{
		String xlpath="F:\\morning730am\\selenium\\src\\com\\orgHRM\\Testdata\\Testdata.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Empreg");
//		XSSFRow r=ws.getRow(4);
//		XSSFCell c=r.getCell(0);
//		System.out.println(c.getStringCellValue());
		
		int rc=ws.getLastRowNum();
		System.out.println(rc);
		CellStyle style=wb.createCellStyle();
		Font font=wb.createFont();
		for (int i = 1; i <= rc; i++) 
		{
			XSSFRow r=ws.getRow(i);
			System.out.println(r.getLastCellNum());
			XSSFCell c1=r.getCell(0);
			XSSFCell c2=r.getCell(1);
			XSSFCell c3=r.createCell(2);
			
			String f=c1.getStringCellValue();
			String l=c2.getStringCellValue();
			System.out.println(f+"-------"+l);
			
			c3.setCellValue("Pass");
			String res=c3.getStringCellValue();
			if (res.equalsIgnoreCase("Pass")) 
			{
				style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
				style.setFillPattern(CellStyle.SOLID_FOREGROUND);
				font.setColor(IndexedColors.GREEN.getIndex());
			}
			else
			{
				style.setFillForegroundColor(IndexedColors.RED.getIndex());
				style.setFillPattern(CellStyle.SOLID_FOREGROUND);
				font.setColor(IndexedColors.RED.getIndex());
			}
			style.setFont(font);
			c3.setCellStyle(style);
			
		}
		
		FileOutputStream fo=new FileOutputStream("F:\\morning730am\\selenium\\src\\com\\orgHRM\\Results\\testres.xlsx");
		wb.write(fo);
		wb.close();
		
	}

}
