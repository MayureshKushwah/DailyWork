package com.cts.training.day4;

import java.util.Comparator;

public class SortByDesignation implements Comparator<Employee> {
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getDesignation().compareTo(emp2.getDesignation());
	}


}
