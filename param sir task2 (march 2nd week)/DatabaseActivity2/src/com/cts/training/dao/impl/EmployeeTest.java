package com.cts.training.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.cts.training.day10.Employee;

public class EmployeeTest {

	
	private static EmployeeDAO employeeDAO;
	private static Employee employee;
	
	@BeforeClass
	public static void init() {
		employee = new Employee();
		employeeDAO = new EmployeeDAOImpl();
	}
	@Ignore
	@Test
	public void test_add_employee_succes() {
		Employee emp = new Employee(134, "Mayu", "pune", "PAT", 22, 24415, 123456789);
		assertEquals(true, employeeDAO.saveEmployee(emp));
	}
	@Ignore
	@Test
	public void test_get_employee_byId_succes() {
		Employee emp= employeeDAO.getEmployeeById(101);
		assertEquals("mayu" ,emp.getName());
		System.out.println("employee name is:"+emp.getName());
		}
	@Ignore
	@Test
	public void test_all_success() {
		List<Employee> list = employeeDAO.getAllEmployee();
		assertEquals("mayu", list.get(0).getName());
	}
	
	
	
	@Ignore
	@Test
	public void test_Delete_employee_byId_succes() {
		Employee emp= employeeDAO.getEmployeeById(104);
		
		
		assertEquals(true,employeeDAO.deleteEmployee(emp) );
		
		}
	
	@Test
	public void test_update_Employee_success() {
		
		Employee employee1 = employeeDAO.getEmployeeById(134);
		employee1.setAge(108);
		
		assertEquals(true, employeeDAO.updateEmployee(employee1));
		}
	

}
