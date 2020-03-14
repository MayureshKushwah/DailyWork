package com.cts.training.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JdbcDynamic {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    //System.out.println("Enter employee id:");
	   // int id = Integer.parseInt(br.readLine());
	    //System.out.println("Enter employee name:");
	    //String name  = br.readLine();
	   // System.out.println("Enter employee address:");
	    //String address = br.readLine();
	    //System.out.println("Enter employee age");
	    //int age = Integer.parseInt(br.readLine());
	    //System.out.println("Enter employee phone:");
	    //long phone = Integer.parseInt(br.readLine());
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/ctspune";
		Connection conn = DriverManager.getConnection(url, "root", "root");
		//String query = "insert into employee values(?,?,?,?,?)";
		//String query = "update employee set name =? where id=?";
		//String query = "delete from employee where id=?";
		
		//PreparedStatement ps = conn.prepareStatement(query);
		//ps.setInt(1, id);
		//ps.setString(1, name);
		//ps.setString(3, address);
		//ps.setInt(4, age);
		//ps.setLong(5, phone);
		//int result= ps.executeUpdate();
		//if (result>0)
		//	System.out.println("data inseted");
		//else
		 //   System.out.println("try again");
		Statement stmt = conn.createStatement();
		String query = "select * from employee";
		ResultSet rs = stmt.executeQuery(query);
        
		int count=1;
		while (rs.next())
        {    
        	 int id = rs.getInt(1);//=rs.getInt("id"); ie we can give attribute name
        	String name= rs.getString(2);
        	String address = rs.getString(3);
        	int age = rs.getInt(4);
        	long phone= rs.getInt(5);
        	System.out.println("--------Employee--"+ count+ "---Record--------"+"\n Employee id:"+id+" \n Employee Name : "+name+" \n Emplyee Address:"+address+": \n Employee Age:"+age+": \n Employee ContactNo:"+phone);
        count++;
        }

	}

}
