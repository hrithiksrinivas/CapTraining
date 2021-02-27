package com.CapG.day_5;

public class RegularEmployee extends Employee{
	int payperDay = 500;
	
	public void calculateSalary() {
		
		salary = payperDay*30;
			if(totalLeavesformonth>=0 && totalLeavesformonth<=2) {
				salary = salary -(totalLeavesformonth*salary/30);
	 		}
		}
		
	
	
	public RegularEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public RegularEmployee(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "RegularEmployee [payperDay=" + payperDay + ", id=" + id + ", name=" + name + ", totalLeavesformonth="
				+ totalLeavesformonth + ", salary=" + salary + "]";
	}
		
}

