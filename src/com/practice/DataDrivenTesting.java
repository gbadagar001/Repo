package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class DataDrivenTesting 
{
	@Test
	public void testDataDrivenTesting() throws InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Anand girish\\Desktop\\Data1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("Sheet1");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		long vCell00 = (long) c.getNumericCellValue();
		System.out.println(vCell00);
		long vCell01 = (long)wb.getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
		System.out.println(vCell01);
		wb.getSheet("Sheet1").getRow(0).getCell(2).setCellValue(667666606);
		wb.getSheet("Sheet1").getRow(1).getCell(2).setCellValue(667666606);
		wb.getSheet("Sheet1").getRow(0).createCell(3).setCellValue("Giriyappa");
		wb.getSheet("Sheet1").createRow(3).createCell(3).setCellValue(65444465);
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Anand girish\\Desktop\\Data1.xlsx");
		wb.write(fos);
		
	
	}

}