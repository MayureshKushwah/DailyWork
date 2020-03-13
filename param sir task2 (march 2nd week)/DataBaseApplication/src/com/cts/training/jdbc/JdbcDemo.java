package com.cts.training.jdbc;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. Load Database driver
		// 1.A By using forName() method which is in Class

		Class.forName("com.mysql.jdbc.Driver"); // this will check the path at run time so it will give error if path is
												// not set at run time

		// 1.B (second method for loadin driver)
		// Driver driver = new com.mysql.jdbc.Driver();

		// 2. Establish the connection
		String url = "jdbc:mysql://localhost:3306/ctspune";
		Connection conn = DriverManager.getConnection(url, "root", "root"); // DariverManager provide connection object
		System.out.println(conn.getClass().getName());

		Statement stmt = conn.createStatement();// This is responsible to execute sql queries
		// String query = "insert into employee
		// values(5,'Disha','Gwalior',22,98983454)";
		// String query = "update employee set address='Thane' where id = 1";
		// String query= "delete from employee where id =1";
		/*
		 * int result = stmt.executeUpdate(query);//executeUpdate returns int ie 1 or 2
		 * so we result will change from 0 to either 1 or 2 if(result>0)
		 * System.out.println("Record Inserted successfully"); else
		 * System.out.println("Some thing went wrong...");
		 */
		String query = "select * from employee";
		ResultSet rs = stmt.executeQuery(query);
        while (rs.next())
        {
        	int id = rs.getInt(1);//=rs.getInt("id"); ie we can give attribute name
        	String name= rs.getString(2);
        	String address = rs.getString(3);
        	int age = rs.getInt(4);
        	long phone= rs.getInt(5);
        	System.out.println(id+":"+name+":"+address+":"+age+":"+phone);
        }
	}

}
