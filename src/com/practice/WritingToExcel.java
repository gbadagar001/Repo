package com.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WritingToExcel 
{
	@Test
	public void testWritingToExcel() throws InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream("D:\\Raddi's documents\\Girish1\\Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("Sheet1");
		//Write to existing cell
		s.getRow(0).getCell(0).setCellValue("Giri");
		//Write to new cell and existing row
		s.getRow(0).createCell(1).setCellValue("Badagar");
		//Write to new row and new cell
		s.createRow(1).createCell(0).setCellValue("Yallappa");
		FileOutputStream fos = new FileOutputStream("D:\\Raddi's documents\\Girish1\\Data.xlsx");
		wb.write(fos);
	}
}
