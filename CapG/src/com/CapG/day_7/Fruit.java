package com.CapG.day_7;

public abstract class Fruit {
	String name;
	
	public Fruit() {
		
	}
	public Fruit(String name, int quantity) {
		super();
		this.name = name;
		
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}
	
	

}
