package com.cts.training.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cts.training.bean.Employee;

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
	public boolean updateEmployee(Employee employee) {
		// String query = "update employee set address='Thane' where id = 1";
		// int result = stmt.executeUpdate(query);
		return false;
	}

	@Override
	public boolean deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return false;
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

/*
 * static ArrayList<Employee> employees = null;
 * 
 * static { employees = new ArrayList<>(); Employee emp1 = new Employee(105,
 * "Vijay", "Bangalore", "Developer", 20, 41241.89, 79879798L); Employee emp2 =
 * new Employee(101, "Neeraj", "Mumbai", "Software Engineer", 21, 23434.89,
 * 121313L); Employee emp3 = new Employee(501, "Sakshi", "Indore",
 * "Test Engineer", 19, 19889.80, 979879798L); Employee emp4 = new Employee(301,
 * "Neha", "Pune", "DevOps Engineer", 23, 68908.12, 43432222L);
 * employees.add(emp1); employees.add(emp2); employees.add(emp3);
 * employees.add(emp4);
 * 
 * }
 * 
 * public void addEmployee(Employee employee) { employees.add(employee); }
 * 
 * public void deleteEmployee(Employee employee) { employees.remove(employee); }
 * 
 * 
 * 
 * public void updateEmployee(Employee employee) {
 * employee.setName("mayuuuuuuu"); }
 * 
 * public Employee getEmployeeById(int id) { for (Employee em : employees) {
 * if(em.getId()==id) { return em; } } return null ; }
 * 
 * public List<Employee> getAllEmployees() { return employees; }
 * 
 * }
 */
