package com.coreday1;

public class Book {
	private String bookName;
	private int bookNumber;
	private int noOfPages;
	Book(String bookName,int bookNumber,int noOfPages){
		this.bookName=bookName;
		this.bookNumber=bookNumber;
		this.noOfPages=noOfPages;
	}
	void displayBook(){
		System.out.println("name of book:"+bookName);
		System.out.println("Number of the book:"+bookNumber);
		System.out.println("Number of pages of book"+noOfPages);
	}
	public static void main(String args[]) {
		Book b1 = new Book("harry potter",3378,497);
		b1.displayBook();
	}
}
