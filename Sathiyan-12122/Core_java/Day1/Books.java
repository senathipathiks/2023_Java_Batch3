package com.day1.core;

public class Books {
	private int bookId;
	private String bookName;
	private String gener;
	private double price;
	
	
	
	public Books(int bookId, String bookName, String gener, double price) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.gener = gener;
		this.price = price;
	}
	
	void displayBook() {
		System.err.println("Welcome to the Book shop");
		System.out.println("Book id is : "+bookId);
		System.out.println("Boon name is : "+bookName);
		System.out.println("Gener of te book is : "+gener);
		System.out.println("Priceof the book is : "+price);
	}

	public static void main(String[] args) {
		Books ref=new Books(123,"Harry potter","Adventure",1200.00);
		ref.displayBook();
	}

}
