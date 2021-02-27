package com.CapG.day_7;

	public class Employee implements Comparable<Employee> {
		// Fields
			private int id;
			private String name;
//			private double salary ;
			private Double salary ;
//			use wrapper make double an object
			
//		double s = (int) salary; wrong way to type cast
		// default/no-arg constructor	
		public Employee() {
				
		}
			
		// constructor to initialize id, name, salary
		public Employee(int id, String name, double salary) {
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
		
		// Methods
		double incrementSalary() {
			this.salary += 5000;

			return salary;
		}
		
		
//		public boolean equals(Object obj) {
//			Employee e = (Employee) obj;
//	        return (e.id == this.id);
	//   }
	//	

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Double getSalary() {
			return salary;
		}

		public void setSalary(Double salary) {
			this.salary = salary;
		}

		// String representation of an object
		@Override
		public String toString() {
			return "Employee [id=" + this.id + ", name=" + name + ", salary=" + salary + "]";
		}

		@Override
		public int compareTo(Employee e) {
//			type casting
//			return (int) e.salary - (int) this.salary;
//			wrapper
//			return e.salary.compareTo(this.salary);
//			return  (e.name.compareTo(this.name));
			return  this.id - e.id;
//			if(this.id < e.id) {
//				return -1;
//			}
//			else if(this.id == e.id){
//				return 0;
//			}
//			else {
//				return 1;
//			}
		}


		

}
