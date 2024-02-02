package com.day1oops;

public class Book {
private int bookNo;
private String bookName;
private int bookpublished;
private String bookAuthor;
private int bookPrice;
Book(int bookNo,String bookName,int bookpublished,String bookAuthor,int bookPrice){
	this.bookNo=bookNo;
	this.bookName=bookName;
	this.bookpublished=bookpublished;
	this.bookAuthor=bookAuthor;
	this.bookPrice=bookPrice;
}
void displayBook() {
	System.out.println("Book Number:"+"  "+bookNo);
	System.out.println("Book Name:"+"  "+bookName);
	System.out.println("Book Published in the year:"+"  "+bookpublished);
	System.out.println("Book Author:"+"  "+bookAuthor);
	System.out.println("Book price:"+"  "+bookPrice);
}
	public static void main(String[] args) {
		Book b1= new Book(47,"Lifeline",1999,"xyz",499);
		b1.displayBook();

	}

}