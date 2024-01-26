package com.newclass;

public class Book {
	private int bookId;
	private String bookName;
	private String bookAuthorName;
	private String bookPublication;
	private String bookRel;
	
	Book(int bookId,String bookName,String bookAuthorName,String bookPublication,String bookRel){
		
		this.bookId=bookId;
		this.bookName=bookName;
		this.bookAuthorName=bookAuthorName;
		this.bookPublication=bookPublication;
		this.bookRel=bookRel;
	}
	
	void displayBook() {
		System.out.println("Book ID :"+bookId);
		System.out.println("Book Name :"+bookName);
		System.out.println("Book Author Name :"+bookAuthorName);
		System.out.println("Book Publication"+bookPublication);
		System.out.println("Book Relesed :"+bookRel);
	}

	public static void main(String[] args) {
		
		Book b = new Book(123,"Harry Pottor","John Victor","Wizarding World","2001");
		
		b.displayBook();
		
	}

}
