package com.CapG.day_4;

public abstract class Bicycle {

	//Fields 
	int speed;
	int gear;
	
	public Bicycle() {
		
	}
	//constructor
	public Bicycle(int speed, int gear) {
		super();
		this.speed = speed;
		this.gear = gear;
	}
	// methods
		public void speedUp(int speed) {
			this.speed++;
		}
		
		public void speedDown(int speed) {
			this.speed--;
		}
		
		public void gearUp(int gear) {
			this.gear++;
		}
		@Override
		public String toString() {
			return "Bicycle [speed=" + speed + ", gear=" + gear + "]";
		}
		
		
	

}
