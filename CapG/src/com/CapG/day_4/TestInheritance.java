package com.CapG.day_4;

public class TestInheritance {
	

	public static void main(String[] args) {
		
		
//		Bicycle b1 = new Bicycle(8, 4);
//		System.out.println(b1);
		
		MountainBicycle mb1 = new MountainBicycle(10, 12, 4);
		
		RoadBicycle rb1 = new RoadBicycle(6, 6);
        
		Bicycle bicycles[] = {mb1, rb1};
		
		for(Bicycle b : bicycles) {
//			System.out.println(bicycle);
			b.speedUp(4);
//			System.out.println(bicycle);
			b.gearUp(4);
			System.out.println(b);
		}
		
		
		

	}

}
