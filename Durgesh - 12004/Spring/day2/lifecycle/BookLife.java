package com.day2.lifecycle;

public class BookLife {
	
	private int bookId;
	private String name;
	private String author;
	private int price;
	
	public BookLife() {
		System.out.println("Book Bean Created");
	}
	
	public void init() {
		System.out.println("Start");
	}
	
	public void destroy() {
		System.out.println("Destroy");
	}
	
}
