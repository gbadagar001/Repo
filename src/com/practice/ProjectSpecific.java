package com.practice;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectSpecific 
{

	public static void createFolder() 
	{
		String currentDir = new File(".").getAbsolutePath();
		//System.out.println(currentDir);
		String folderNameWithTimeStamp=getDateTime();
		//System.out.println(folderNameWithTimeStamp);
		String finalPath=currentDir+"//Results_"+ folderNameWithTimeStamp;
		File f1=new File(finalPath);
		f1.mkdir();
	}

	private  final static String getDateTime()  
	{  
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss");  
		//  df.setTimeZone(TimeZone.getTimeZone("PST"));  
		return df.format(new Date());  
	}
	

}
