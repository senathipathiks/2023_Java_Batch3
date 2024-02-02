package com.day21;

public class Book {
	
	private int bookId;
	private String bookName;
	private String authorName;
	private int price;
	
	

	public Book(int bookId, String bookName, String authorName, int price) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
		
	}
	
	void display() {
		System.out.println("Book ID : "+bookId);
		System.out.println("Book Name : "+bookName);
		System.out.println("Author Name : "+authorName);
		System.out.println("Price : "+price);
	}



	public static void main(String[] args) {
		Book obj1 = new Book(123,"Harry potter","J.K.Rowling",150);
		obj1.display();

	}

}
