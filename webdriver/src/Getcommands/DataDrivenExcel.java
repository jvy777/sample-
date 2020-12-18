package Getcommands;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.xssf.usermodel.*;

public class DataDrivenExcel {

	public static void main(String[] args) throws IOException {
		File f=new File("C://Users//YASHWANTH//Videos//Captures//Test.xlsx");
		FileInputStream file=new FileInputStream(f);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheetAt(0);		

		int rowcount=sheet.getLastRowNum(); //returns the row count 
		int colcount=sheet.getRow(0).getLastCellNum(); // returns the column or cell count
		
		for (int i = 0;i<rowcount;i++)
		{
			XSSFRow currentrow=sheet.getRow(i);
		}
		
		for (int j = 0;j<colcount;j++)
		{
			XSSFRow currentrow = null;
			String value=currentrow.getCell(j).toString();
			System.out.println(value);
			
		}
	System.out.println();
	}
}
	

