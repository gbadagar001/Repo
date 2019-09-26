package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.testng.annotations.Test;
public class connectToDatabaseJDBC 
{
	@Test
	public static void testconnectToDatabaseJDBC() throws SQLException
  {
		Connection c = DriverManager.getConnection("jdbc:odbc:actitimedb");
		ResultSet r = c.createStatement().executeQuery("select * from customer");
		
		int cc=r.getMetaData().getColumnCount();
		System.out.println("column count:"+cc);
		
		for (int i =1; i <=cc; i++)
		{
			String columnName = r.getMetaData().getColumnName(i);
			System.out.println(columnName);
		}
		c.close();
	
  }

}
