package com.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WritingDataToACell 
{
	@Test
	public static void testWritingDataToACell() throws InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream("D:/Selenium.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("Sheet1");
		//Writing to existing cell
		s.getRow(0).getCell(0).setCellValue("Girish");
		//Writing to new cell and existing row
		s.getRow(0).createCell(1).setCellValue("Badagar");
		//Writing to new cell and new row
		s.createRow(1).createCell(0).setCellValue("Sharan");
		
		FileOutputStream fos=new FileOutputStream("D:/Selenium.xlsx");
		wb.write(fos);
		
	}

}
