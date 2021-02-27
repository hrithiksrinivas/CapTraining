package com.CapG.day_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(20, "Ravi", 34343.34);
		Employee e2 = new Employee(2, "Priya", 44343.34);
		Employee e3 = new Employee(12, "Arijit", 24343.34);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(e1); 
		employees.add(e2);
		employees.add(e3);
		
		System.out.println(e1.compareTo(e2));
		System.out.println("b".compareTo("a"));
		
		System.out.println(employees);
		
		Collections.sort(employees, new NameComparator());
		
		System.out.println(employees);
	}

}	
