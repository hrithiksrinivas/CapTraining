package com.CapG.day_5;

public class ContractEmployee extends Employee {

	 int salary;
		public ContractEmployee(int id, String name, int salary) {
		super(id, name);
		this.salary = salary;
	}


		public void calculateSalary() {
				if(totalLeavesformonth>=0 && totalLeavesformonth<=2) {
					salary = salary -(totalLeavesformonth*salary/30);
		 		}
			}
			
		
		

		public ContractEmployee() {
			super();
			// TODO Auto-generated constructor stub
		}


		public ContractEmployee(int id, String name) {
			super(id, name);
			// TODO Auto-generated constructor stub
		}


		@Override
		public String toString() {
			return "ContractEmployee [id=" + id + ", name=" + name + ", totalLeavesformonth=" + totalLeavesformonth
					+ ", salary=" + salary + "]";
		}
			
	}


