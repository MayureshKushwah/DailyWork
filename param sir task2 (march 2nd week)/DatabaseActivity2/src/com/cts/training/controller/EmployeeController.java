package com.cts.training.controller;

import java.util.List;
import java.util.Scanner;

import com.cts.training.dao.impl.EmployeeDAO;
import com.cts.training.dao.impl.EmployeeDAOImpl;
import com.cts.training.day10.Employee;


public class EmployeeController {

	public static void main(String[] args) {
		
		
		

		
		EmployeeDAO empObj = new  EmployeeDAOImpl();
		//List<Employee> list = empObj.getAllEmployee();
		//list.forEach(System.out::println);
		//Employee employee = new Employee(105, "Mayu5", "bhopal","pa", 20, 80000, 6854646);
		//empObj.saveEmployee(employee);
	Employee obj=	 empObj.getEmployeeById(104);
           obj.setAge(500);	
		//empObj.deleteEmployee(obj);
		empObj.updateEmployee(obj);
	}	
	}