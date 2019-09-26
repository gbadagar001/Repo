package com.practice;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;


public class ReadingDataFrom1stCell 
{
	@Test
	public static void test() throws InvalidFormatException, IOException
	{
	FileInputStream fis=new FileInputStream("D:\\Selenium.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet s = wb.getSheet("Sheet1");
	//Row r = s.getRow(1);
	//Cell c = r.getCell(3);
	//String v = c.getStringCellValue();
	//Combining above lines and making in single line
	String v = s.getRow(1).getCell(3).getStringCellValue();
	System.out.println(v);
	
	//WorkbookFactory <----Read---FileInputStream
	//       |
	//   Workbook-------Write---->FileOutPutStream
	//       |
	//     Sheet
	//       |
	//      Row
	//       |
	//      Cell
	
	}

}
