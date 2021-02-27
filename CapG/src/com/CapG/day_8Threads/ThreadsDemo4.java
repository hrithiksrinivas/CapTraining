package com.CapG.day_8Threads;

class RoomBookTask implements Runnable{

	int roomsBooked = 0;
	
	
	public synchronized void bookRooms() {
		for(int i=0; i<1000; i++) {
			roomsBooked = roomsBooked + 1;
		}
	}
	@Override
	public void run() {
		this.bookRooms();
//		System.out.println("Room booked by :" + Thread.currentThread().getName());	
	}
}

public class ThreadsDemo4 {
	

	public static void main(String[] args) throws InterruptedException {
		RoomBookTask runnable = new RoomBookTask();
		
		for(int i=0;i<100000;i++) {
			
			Thread t = new Thread(runnable);
			t.start();	
		}
		System.out.println(Thread.currentThread().getName());
		Thread.sleep(2000);
		System.out.println(runnable.roomsBooked);

	}

}