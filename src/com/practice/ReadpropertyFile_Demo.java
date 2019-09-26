package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadpropertyFile_Demo 
{

	public static void main(String[] args) throws IOException 
	{
		File file = new File(".\\Data\\config.properties");
		FileInputStream fileInput = new FileInputStream(file);
		//FileInputStream fileInput=new FileInputStream(new File(".\\Data\\config.properties"));
		Properties prop = new Properties();
		prop.load(fileInput);
		String browserType = prop.getProperty("browserType");
		System.out.println("browserType:="+browserType);

	}

}
