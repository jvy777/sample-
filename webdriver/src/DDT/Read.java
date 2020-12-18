package DDT;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {

	public static void main(String[] args) {
		
		FileInputStream file = new FileInputStream("C://Users//YASHWANTH//Documents//Desktop//dc.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		
		
		int rowcount= sheet.getLastRowNum();
		int colcount= sheet.getRow(0).getLastCellNum();
		
		for (int i = 0; i < rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < colcount; j++) {
			String value = row.getCell(j).toString(); // reading the data from cell
			System.out.print(value + " ");
			}
			System.out.println();
			}
	}

	}

}

