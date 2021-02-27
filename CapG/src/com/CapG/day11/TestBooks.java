package com.CapG.day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@FunctionalInterface
interface Condition{
	boolean test(Books b);
}


public class TestBooks {
	
	public static void printConditionally(List<Books> Books, Condition c) {
		for (Books b : Books) {
			if(c.test(b)) {
				System.out.println(b);
			}
		}
	}

	public static void main(String[] args) {
		Books b1 = new Books(1, "The Lord Of The Rings", 400);
		Books b2 = new Books(2, "The Hobbit", 300);
		Books b3 = new Books(3, "A 1001 Nights", 1000);

		List<Books> Books = new ArrayList<>();
		Books.add(b1);
		Books.add(b2);
		Books.add(b3);


		System.out.println("-- Books with name starts with A -- --");

		Condition nameStartsWithA = (b)-> b.getName().startsWith("A");
		printConditionally(Books, nameStartsWithA);
		
		
		System.out.println("Books costing greater than 400:-");
		
		Condition costGreaterThan = (b)-> b.getCost()>400;
		printConditionally(Books, costGreaterThan);
		
		
		System.out.println("-- Printing all Books- --");

		printConditionally(Books, (b)-> true );
		
		System.out.println("Sort Books: ");
		Collections.sort(Books, (book1, book2)-> book1.getName().compareTo(book2.getName()));
        for(Books b : Books) {
        System.out.println(b);
	}
}
	}
