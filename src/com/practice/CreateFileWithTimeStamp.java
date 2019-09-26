package com.practice;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateFileWithTimeStamp extends ProjectSpecific
{

	public static void main(String[] args)
	{
		CreateFileWithTimeStamp(".\\Results\\ConsoleOutput\\results");
	}

	//Create a new file
	public static void CreateFileWithTimeStamp(String filename) {
		//get current project path
		String filePath = System.getProperty("user.dir");
		//create a new file with Time Stamp
		File file = new File(filePath + "\\" + filename+GetCurrentTimeStamp().replace(":","_").replace(".","_")+".txt");

		try {
			if (!file.exists()) {
				file.createNewFile();
				System.out.println("File is created; file name is " + file.getName());
			} else {
				System.out.println("File already exist");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// Get current system time
	public static String GetCurrentTimeStamp() {
		SimpleDateFormat sdfDate = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss.SSS");// dd/MM/yyyy
		Date now = new Date();
		String strDate = sdfDate.format(now);
		return strDate;
	}
	// Get Current Host Name
	public static String GetCurrentTestHostName() throws UnknownHostException {
		InetAddress localMachine = InetAddress.getLocalHost();
		String hostName = localMachine.getHostName();
		return hostName;
	}

	// Get Current User Name
	public static String GetCurrentTestUserName() {
		return System.getProperty("user.name");
	}


}
