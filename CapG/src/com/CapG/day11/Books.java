package com.CapG.day11;

public class Books implements Comparable<Books> {

	private int id;
	private String name;
    private int cost;
	
public Books() {
		
}

public Books(int id, String name, int cost) {
	this.id = id;
	this.name = name;
	this.cost = cost;

}


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getCost() {
	return cost;
}

public void setCost(int cost) {
	this.cost = cost;
}



@Override
public String toString() {
	return "Books [id=" + id + ", name=" + name + ", cost=" + cost + "]";
}

@Override
public int compareTo(Books e) {
	return this.cost - e.cost;

}




}