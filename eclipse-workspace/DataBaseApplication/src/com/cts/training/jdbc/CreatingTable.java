package com.cts.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatingTable {
	int result1=0,result2=0;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/ctspune";
		Connection conn = DriverManager.getConnection(url, "root", "root");
		Statement stmt = conn.createStatement();
		//String query = "create Table Student (RollNo int, name varchar(30), subject varchar(20),busno int)";
		//String query1 = "insert into Student values(2,'nikhil', 'Maths',55)";
		//int result1 = stmt.executeUpdate(query);
		/*
		int result2 = stmt.executeUpdate(query1);
		
		if( result2>0)
			  System.out.println("Record Inserted successfully"); 
		
		else
			  System.out.println("Some thing went wrong...");
	*/
		
		String query = "update Student set name='NewName' where busno = 51";
	int result= stmt.executeUpdate(query);
	if( result>0)
		  System.out.println("Record Inserted successfully"); 
	
	else
		  System.out.println("Some thing went wrong...");
	}

}
