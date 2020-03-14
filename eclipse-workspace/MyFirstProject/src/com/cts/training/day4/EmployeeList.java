package com.cts.training.day4;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList  {

	public static void main(String[] args) {
		
	ArrayList<Employee> list = new ArrayList<>();
    addEmployees(list);
	//System.out.println(list);
    System.out.println("---------Sort by Id--------------------");
    Collections.sort(list, new SortById());
    for(Employee emp: list) {
    	System.out.println(emp);
    }
    System.out.println("---------Sort by Age--------------------");
    Collections.sort(list, new SortByAge());
    for(Employee emp: list) {
    	System.out.println(emp);
    }
    System.out.println("---------Sort by Name--------------------");
    Collections.sort(list , new SortByName());
    for(Employee emp: list) {
    	System.out.println(emp);
    }
    System.out.println("---------Sort by Address--------------------");
    Collections.sort(list , new SortByAddress());
    for(Employee emp: list) {
    	System.out.println(emp);
    }
    System.out.println("---------Sort by Designation--------------------");
    Collections.sort(list , new SortByDesignation());
    for(Employee emp: list) {
    	System.out.println(emp);
    }

	}

	private static void addEmployees(ArrayList<Employee> list) {
		Employee emp1= new Employee (4234, "mayu1","pune1", "leveloper1",20,41241.89,526485245L);
	    Employee emp2= new Employee (8235, "hayu2","aune2", "geveloper2",21,41241.89,536485245L);
	    Employee emp3= new Employee (4236, "qayu3","gune3", "beveloper3",22,41241.89,546485245L);
	    Employee emp4= new Employee (7237, "aayu4","qune4", "keveloper4",23,41241.89,556485245L);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
	}

}
