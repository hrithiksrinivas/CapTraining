package com.CapG.day_5;

public abstract class Employee {
	
	int id;
	String name;
	int totalLeavesformonth = 2;
	int salary;
	
	public Employee(){
	}
	

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public abstract void calculateSalary();
	
	public void deductLeave(int totalLeavesformonth) {
		this.totalLeavesformonth-=1;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", totalLeavesformonth=" + totalLeavesformonth + ", salary="
				+ salary + "]";
	}


	

}
