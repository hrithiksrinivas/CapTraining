package com.CapG.day_4;

//public class RoadBicycle extends Bicycle{
//	
//	public RoadBicycle(int speed, int gear) {
//		super(speed, gear);
//		
//	}
//
//	@Override
//	public String toString() {
//		return "RoadBicycle [speed=" + speed + ", gear=" + gear + "]";
//	}
//	
//	
//
//}


public class RoadBicycle extends Bicycle{

	
	public RoadBicycle() {
		super();
	}

	public RoadBicycle(int speed, int gear) {
		super(speed, gear);
	}

	@Override
	public String toString() {
		return "RoadBicycle [speed=" + speed + ", gear=" + gear + "]";
	}

	@Override
	public void speedUp(int speed) {
		this.speed += speed; 
		
	}
	
	
	
	
	
	
}