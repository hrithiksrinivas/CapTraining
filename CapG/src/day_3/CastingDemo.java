package day_3;

public class CastingDemo {

	public static void main(String[] args) {
		// Upcasting
		//primitives -  Smaller value into a larger space
		byte b = 54;
		int i = b;
		// reference - parent reference child
		Employee emp1 = new Employee(12, "Ravi", 33333.33);
		Object obj = emp1;
		
		
		// Downcasting
		// Larger value into a smaller space
		int age = 29;
		byte x = (byte)age;
		
		
		Object obj1 = emp1;
		Employee emp = (Employee)obj1;
		
		System.out.println(emp);
		
		float b1 = (int)343.34;
		System.out.println(b1);

	}

}