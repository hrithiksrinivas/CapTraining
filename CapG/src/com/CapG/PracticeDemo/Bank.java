package com.CapG.PracticeDemo;

public class Bank {
	//fields
	String name;
	String location;
	int id;
	
	//constructor
	public Bank(String name, String location, int id) {
		super();
		this.name = name;
		this.location = location;
		this.id = id;
	}
	
//	methods
//	public void FindBank() {
//		
//	}

	

	@Override
	public String toString() {
		return "Bank [name=" + name + ", location=" + location + ", id=" + id + "]";
	}





	public static void main(String[] args) {
		Bank bank1 = new Bank("CanaraBank", "Bangalore", 123);
		Bank bank2 = new Bank("StateBank", "Bangalore", 123);
		Bank bank3 = new Bank("AllahabadBank", "Delhi", 336);
		Bank bank4 = new Bank("SyndicateBank", "Delhi", 336);
		
		Bank bank[] = {bank1, bank2, bank3, bank4};
		for(Bank b: bank) {	
//		System.out.println(b);
		
		if(b.location.equals("Delhi"))
		{
			System.out.println(b.name);
		}
		

	}

	
}
}
