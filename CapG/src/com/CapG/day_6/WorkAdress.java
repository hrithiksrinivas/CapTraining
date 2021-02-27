package com.CapG.day_6;

public class WorkAdress extends Address{
	String organizationName;

	public WorkAdress() {
		
		
	}

	public WorkAdress(int houseNumber, String locality, String city, String organizationName) {
		super(houseNumber, locality, city);
		this.organizationName = organizationName;
	}
	

	@Override
	public String toString() {
		return "WorkAdress [organizationName=" + organizationName + ", houseNumber=" + houseNumber + ", locality="
				+ locality + ", city=" + city + ", id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
