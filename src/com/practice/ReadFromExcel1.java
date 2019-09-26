package com.practice;

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

public class ReadFromExcel1 
{
	@Test
	public void test() throws InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream("D:\\Raddi's documents\\Girish1\\Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("Sheet1");
//		Row r = s.getRow(0);
//		Cell c = r.getCell(0);
//		String CellValue = c.getStringCellValue();
		String CellValue = s.getRow(0).getCell(0).getStringCellValue();
		System.out.println(CellValue);
	}

}
