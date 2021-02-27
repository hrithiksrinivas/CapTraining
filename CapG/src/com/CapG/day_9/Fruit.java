package com.CapG.day_9;

class Fruit{
	String name;


	public Fruit(String name) {
		super();
		this.name = name;
	}
	
	
	public boolean equals(Object obj) {
		Fruit f = (Fruit) obj;
		return this.name.equals(f.name);
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}
	
}
