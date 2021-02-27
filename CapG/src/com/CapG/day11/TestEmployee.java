//package com.CapG.day11;
//import java.util.ArrayList;
//import java.util.List;
//
//import com.CapG.day_7.Employee;
//
//@FunctionalInterface
//interface Condition{
//	boolean test(Employee e);
//}
//
//
//public class TestEmployee {
//	
//	public static void printConditionally(List<Employee> employees, Condition c) {
//		for (Employee e : employees) {
//			if(c.test(e)) {
//				System.out.println(e);
//			}
//		}
//	}
//
//	public static void main(String[] args) {
//		Employee e1 = new Employee(1, "Ravi", 34343.34);
//		Employee e2 = new Employee(2, "Priya", 44343.34);
//		Employee e3 = new Employee(12, "Arijit", 24343.34);
//
//		List<Employee> employees = new ArrayList<>();
//		employees.add(e1);
//		employees.add(e2);
//		employees.add(e3);
//
//		// print conditionally .. name starting with A
//		System.out.println("-- Printing employees with name starting with P -- --");
////		for (Employee e : employees) {
////			if (e.getName().startsWith("A")) {
////				System.out.println(e);
////			}
////		}
//		
////		Condition nameStartsWithA = (Employee e)-> {return e.getName().startsWith("A");};
//		Condition nameStartsWithA = (e)-> e.getName().startsWith("P");
//		printConditionally(employees, nameStartsWithA);
////		printConditionally(employees, new NameStartsWithACondition());
//
//		// print conditionally .. salary > 30000
//		System.out.println("-- Printing employees with salary greater than 30000-- --");
////		for (Employee e : employees) {
////			if (e.getSalary() > 30000) {
////				System.out.println(e);
////			}
////		}
////		printConditionally(employees, new Condition() {
////			@Override
////			public boolean test(Employee e) {
////				return e.getSalary() > 30000;
////			}	
////		});
//		printConditionally(employees, (e)-> e.getSalary()>30000 );
//
//		System.out.println("-- Printing all employees-- --");
////		for (Employee e : employees) {
////			System.out.println(e);
////		}
//		printConditionally(employees, (e)-> true );
////		printConditionally(employees, new Condition() {
////			@Override
////			public boolean test(Employee e) {
////				return true;
////			}	
////		});
//	}
//
//}