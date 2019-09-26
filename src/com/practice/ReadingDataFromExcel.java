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

public class ReadingDataFromExcel 
{
	@Test
	public static void testReadingDataFromExcel() throws InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream("D:/Selenium.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("Sheet1");
		//Return row index-Number of active rows
		int rc = s.getLastRowNum();
		for (int i = 0; i <rc; i++)
		{
			Row r = s.getRow(i);
			//Get number of cell in a row
			short Cc = r.getLastCellNum();
			for (int j = 0; j <Cc; j++)
			{
				String v = r.getCell(j).getStringCellValue();
				System.out.print(v+" ");
				
			}
			System.out.println();
			
		}
	}

}
