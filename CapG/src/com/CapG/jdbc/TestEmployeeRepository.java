package com.CapG.jdbc;
import static org.junit.Assert.assertSame;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.CapG.day_9.Employee;

public class TestEmployeeRepository {
	
	static EmployeeRepository repository;
	
	@BeforeClass
	public static void setup() {
		repository = new EmployeeRepository();
	}

	@Test
	public void testFindAllEmployees() {
		List<Employee> employee = repository.findAllEmployees();
		System.out.println(employee);
		assertSame(4, employee.size());
	}
	
	@Test
	public void testAddEmployee() {
		Employee emp = new Employee(7, "Rashmi", 343430.34);
		int count = repository.addEmployee(emp);
		assertSame(1, count);
	}
	
	
	// Delete a employee by id
	
	// Find a employee be id;
	
	// Update the name of the employee

}