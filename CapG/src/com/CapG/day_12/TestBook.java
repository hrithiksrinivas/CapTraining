package com.CapG.day_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TestBook {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		books.addAll(DataExtractor.getFromAmazon("java"));
		books.addAll(DataExtractor.getFromBarnesAndNoble("java"));
		
		System.out.println("Count of books with rating greater than 4.7: " +
				books.stream().filter((b) -> b.getRating() > 4.7).count() +"\n");
		 
		System.out.println("Check if all books match the criteria: " +
				books.stream().allMatch((b) -> b.getRating()>= 1.1) +"\n");
		
		System.out.println("Print titles of the books: " );
				books.stream().map(b -> {
					return b.getTitle();
				})
				.forEach((b) -> System.out.print(b +" "));
				
		System.out.println("\n\n" +"Print all books conatining title \'Java 11\': " );
		books.stream().filter((b) -> b.getTitle().contains("Java 11")).forEach((b) -> System.out.print(b +" "));
		
		System.out.println("\n\n" +"Sort books by rating: ");
		books.stream().sorted((book1, book2) -> book1.getRating().compareTo(book2.getRating())).forEach((b) -> System.out.println(b));
		
		System.out.println("\n\n" +"Find book with minimum rating: ");
		Optional<Book> bookFound = books.stream().min((book1, book2) -> book1.getRating().compareTo(book2.getRating()));
		if(bookFound.isPresent()) {
			System.out.println(bookFound);	
		} else {
			System.out.println("No books found");
		}
		
		System.out.println("\n\n" +"Find the maximum rating value: "
				+ books.stream().max((book1, book2) -> book1.getRating().compareTo(book2.getRating()))
					.map(b -> {
						return b.getRating();
						}).get());
		

	}

}
		

	
		
//		Optional<Book> bookFound = books.stream()
//		.skip(10)
//		.distinct()
//		.filter((b) -> b.getRating()> 4.8)
//		.findAny();
//		.forEach((b)->System.out.println(b)));
		
//		if(bookFound.isPresent()) {
//			System.out.println(bookFound.get());
//		}
//		else {
//			System.out.println("No matching book Found!!");
//		}

	


	