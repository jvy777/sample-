package Tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\YASHWANTH\\Videos\\Captures//Test.xlsx");
		
		FileInputStream f1=new FileInputStream(f);
		
		XSSFWorkbook mywb=new XSSFWorkbook(f1);
		XSSFSheet sheet1=mywb.getSheetAt(0);
		
		//String x0=sheet1.getRow(0).getCell(0).getStringCellValue();
	//	System.out.println(x0);
		
		//String x1=sheet1.getRow(0).getCell(1).getStringCellValue();
	//	System.out.println(x1);
		
		int rowcount=sheet1.getLastRowNum();
		System.out.println(rowcount);
		for (int i=0;i<=rowcount;i++)
		{
			String x0=sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println(x0);
		}
		
		
	}
	

}
