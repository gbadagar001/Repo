package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataFrom1stCellOfExcel 
{
	@Test
	public void testReadDataFrom1stCellOfExcel() throws InvalidFormatException, IOException
	{
		//D:\Raddi's documents\Girish\Data.xlsx
		FileInputStream fis=new FileInputStream("D:\\Raddi's documents\\Girish\\Data.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("Sheet1");
//		Row r = s.getRow(0);
//		Cell c = r.getCell(0);
//		String v = c.getStringCellValue();
		String v = s.getRow(0).getCell(0).getStringCellValue();		
		System.out.println(v);
		
	}

}
