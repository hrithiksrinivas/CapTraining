package day_3;


public class Product {
	
	// Fields
	int id;
	String name;
	double price;

	// Constructors
	Product(int id, String name, double amount){
		//int price = 34;
		
		this.id= id;
		this.name = name;
		this.price = amount;
	}
	
	// Methods
	double incrementprice() {
		this.price = price + 0.1 * price;

		return price;
	}
	
	
	// String representation

	public String toString() {
		
		return "Product [id=" + this.id + ", name=" + this.name + ", price=" + price + "]";
	}
	
	
	public static void main(String[] args) {
		
		Product p1 = new Product(1, "iPhone", 33000.99);
		System.out.println(p1.id);
		System.out.println(p1.name);
		System.out.println(p1.price);
		
		System.out.println(p1);
		
		Product p2 = new Product(2, "iwatch", 18000.00);
		System.out.println(p2.price);
		
	}

	

}
