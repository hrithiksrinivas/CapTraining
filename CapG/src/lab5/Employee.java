package lab5;

public class Employee {
	int id;
	String name;
	int salary;
	double total_salary;
	
	
	public Employee() {
		
	}

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	

	public Employee(int salary) {
		super();
		
		this.salary = salary;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Employee [salary=" + salary + "]";
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee (1, "Ravi", 2500);
		 try{  
		      validate(e1.salary);  
		      }
		      catch(Exception m){System.out.println("Exception occured: "+m);}  
		  
		      System.out.println("Alls well....that ends well!");  
		
	}
			 static void validate(int salary) throws EmployeeException{  
		     if( salary < 3000)  
		      throw new EmployeeException("Salary not valid");  
		     else  
		      System.out.println("Your Salary is validated!!!");  
		   
			    
			     
			  }  
		

	}

	


