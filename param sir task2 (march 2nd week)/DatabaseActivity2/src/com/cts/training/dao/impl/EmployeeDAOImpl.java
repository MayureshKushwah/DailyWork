package com.cts.training.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cts.training.day10.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	Connection conn = getConnection();
	PreparedStatement ps = null;

	private Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/ctspune";
			conn = DriverManager.getConnection(url, "root", "root");
			return conn;
		} catch (Exception e) {
			return null;
		}

	}

	@Override
	public boolean saveEmployee(Employee employee) {
		String sql = "insert into employee values(?,?,?,?,?,?,?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, employee.getId());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getAddress());
			ps.setString(4, employee.getDesignation());
			ps.setInt(5, employee.getAge());
			ps.setDouble(6, employee.getSalary());
			ps.setLong(7, employee.getPhone());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {

			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean updateEmployee(Employee emp) {
		String sql = "update employee set age=? where id= ?";
		try {
			ps = conn.prepareStatement(sql);

			ps.setInt(2, emp.getId());
			ps.setInt(1, emp.getAge());

			ps.executeUpdate();
			return true;
		}

		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean deleteEmployee(Employee emp) {

		String sql = "delete from employee where id= ?";
		try {
			ps = conn.prepareStatement(sql);

			ps.setInt(1, emp.getId());

			ps.executeUpdate();
			return true;
		}

		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return false;
		}

	}

	@Override
	public Employee getEmployeeById(int id1) {
		String sql = "select * from employee where id= ?";
		try {
			ps = conn.prepareStatement(sql);

			ps.setInt(1, id1);
			ResultSet rs = ps.executeQuery();
			Employee emp = null;
			while (rs.next()) {

				emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setAddress(rs.getString("address"));
				emp.setPhone(rs.getLong("phone"));
			}
			return emp;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> employees = new ArrayList<Employee>();
		String sql = "select * from employee";
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setAddress(rs.getString("address"));
				emp.setPhone(rs.getLong("phone"));
				employees.add(emp);
			}
			return employees;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
