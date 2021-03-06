package com.CapG.day_8Threads;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.CapG.day_7.Employee;

public class ConcurrencyDemo3 {
	

	public static void main(String[] args) {
		class VaccinationTask implements Runnable{
			Employee employee;
			
			public VaccinationTask(Employee employee) {
				this.employee = employee;
			}
			@Override
			public void run() {
				// induce a 5 sec delay to simulate time lag in each vaccination
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(employee +  " Vaccinated... by: " + Thread.currentThread().getName());
			}	
		}
		Employee e1 = new Employee(12, "Ravi", 34343.34);
		Employee e2 = new Employee(2, "Priya", 44343.34);
		Employee e3 = new Employee(12, "Arijit", 24343.34);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(e1); 
		employees.add(e2);
		employees.add(e3);
		employees.add(e1); 
		employees.add(e2);
		employees.add(e3);
		
		employees.add(e2);
		employees.add(e3);
		
		// Pool of 2 threads
		ExecutorService service = new ThreadPoolExecutor(2, 4, 0,TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2));
				
				//Executors.newFixedThreadPool(2);
		
		for(Employee e : employees) {
			// No thread creation here
			Runnable r = new VaccinationTask(e);
			service.submit(r);
		}
		
		service.shutdown();

	}

}



