package com.CapG.day_6;

public class Engine extends Vehicle {
	
	int horsePower;

	
	public Engine() {
		
	}
	public Engine(int horsePower) {
		super();
		this.horsePower = horsePower;
	}
	@Override
	public String toString() {
		return "Engine [horsePower=" + horsePower + "]";
	}
	
	

}
