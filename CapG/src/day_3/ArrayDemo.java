package day_3;

public class ArrayDemo {

	public static void main(String[] args) {
		

		//array for primitive types
//		int scores[] = new int[4];
		

		Product p1 = new Product(1, "iPhone", 33000.99);
		Product p2 = new Product(2, "iWatch", 18000.99);
		Product p3 = new Product(3, "iClock", 3000.99);
		//Employee emp1 = new Employee(11, "Ananya", 54343.33);
		//Employee emp2 = new Employee(34, "Priya", 34343.33);
		//Employee emp3 = new Employee(2, "Rajat", 44343.33);
		
		//Employee []employees = {emp1, emp2, emp3};
		 Product p[] = {p1, p2, p3};	
		// array of reference types / user defined type
		//Product p[] = new Product[3];
    	//p [0] = p1;
		//p [1] = p2;
		//p[2] = p3;
		
		//for(int i=0;i<employees.length ; i++) {	
		//System.out.println([i]);
	//}
		
		//for(int i=0;i<p.length ; i++) {	
		//	System.out.println(p[i]);
		//}
		
		//enhanced for loop
//		for(Employee e: employees) {
//			System.out.println(e);
//			e.incrementSalary();
//			System.out.println(e);
//		}
		
		for(Product prd: p) {
			System.out.println(prd);
			prd.incrementprice();
			System.out.println(prd);
		}
		

	}

}