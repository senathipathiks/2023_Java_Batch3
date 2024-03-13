package com.Day1Oops;

public class Book {
    private String bookName;
    private String bookAuthor;
    private double price;
    private int year;
    Book(String bookName,String bookAuthor,double price, int year){
    	this.bookName=bookName;
    	this.bookAuthor=bookAuthor;
    	this.price=price;
    	this.year=year;
    }
    void displayBook() {
         System.out.println("book name: "+bookName);
         System.out.println("book Author: "+bookAuthor);
         System.out.println("book price: "+price);
         System.out.println("book year: "+year);
    }
    public static void main(String[] args) {
		Book b1 = new Book("Java","Bala",200.0,2024);
		b1.displayBook();
	}
}
