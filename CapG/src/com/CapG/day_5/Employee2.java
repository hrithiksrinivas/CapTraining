package com.CapG.day_5;

import java.util.Arrays;

public class Employee2 {
	int id;
	String name;
	double salary;
	double total_salary;
	
	public Employee2() {
		
	}

	public Employee2(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	

	public Employee2(double salary) {
		super();
		
		this.salary = salary;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Employee2 [salary=" + salary + "]";
	}

	public static void main(String[] args) {
		
		
		Employee2 e1 = new Employee2(121, "R", 33000.99);
		Employee2 e2 = new Employee2(122, "A", 33000.99);
		Employee2 e3 = new Employee2(123, "B", 43000.99);
		Employee2 e4 = new Employee2(124, "C", 53000.99);
		Employee2 e5 = new Employee2(125, "D", 23000.99);
		Employee2 e6 = new Employee2(126, "E", 13000.99);
		Employee2 e7 = new Employee2(127, "F", 3000.99);
		Employee2 e8 = new Employee2(128, "G", 3300.99);
		Employee2 e9 = new Employee2(129, "H", 34000.99);
		Employee2 e10 = new Employee2(130, "I", 93000.99);
		Employee2 e11 = new Employee2(131, "J", 330000.99);
		Employee2 e12 = new Employee2(132, "K", 33333.99);
		Employee2 e13 = new Employee2(133, "L", 33500.99);
		Employee2 e14 = new Employee2(134, "M", 35000.99);
		Employee2 e15 = new Employee2(135, "N", 36000.99);
		
		Employee2 []employees = {e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15};
		
		Employee2 e[] = new Employee2[15];
    	e[0] = e1;
		e[1] = e2;
		e[2] = e3;
		e[3] = e1;
		e[4] = e2;
		e[5] = e3;
		e[6] = e1;
		e[7] = e2;
		e[8] = e3;
		e[9] = e1;
		e[10] = e2;
		e[11] = e3;
		e[12] = e1;
		e[13] = e2;
		e[14] = e3;
		
		for(Employee2 en: employees) {
			System.out.println(en);
			 
//		Arrays.sort(en);
//		for (int number : (en) {
//	         System.out.println("Number = " + number);
//	      }
//			
	}
}
	}

