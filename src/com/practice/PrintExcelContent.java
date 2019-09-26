package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class PrintExcelContent 
{
	@Test
	public void testPrintExcelContent() throws InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream("D:\\Raddi's documents\\Girish1\\Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("Sheet1");
		int rc = s.getLastRowNum();
		for (int i = 0; i <rc; i++) 
		{
			Row r = s.getRow(i);
			int cc = r.getLastCellNum();
			for (int j = 0; j <cc; j++) 
			{
				String v = r.getCell(j).getStringCellValue();
				System.out.print(v+" ");
			}
			
			System.out.println();
		}
	}

}
