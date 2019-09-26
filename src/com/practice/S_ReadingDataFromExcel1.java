package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class S_ReadingDataFromExcel1 
{
	@Test
	public void testReadingDataFromExcel1() throws InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Girish\\Desktop\\giri.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
//		Sheet s = wb.getSheet("Sheet1");
//		Row r = s.getRow(0);
//		Cell c = r.getCell(0);
//		String v = c.getStringCellValue();
//		System.out.println(v);
		String v = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println("Cell Value is:->"+v);
	}

}
