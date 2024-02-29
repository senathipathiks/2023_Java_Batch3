package com.spring.SpringDemo;

public class Book {
	
	private int bookId;
	private String bookName;
	private float bookPrice;
	
	
	public Book() {
		super();
	}

	public Book(int bookId, String bookName, float bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}



	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public float getBookPrice() {
		return bookPrice;
	}


	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}


	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
	
	
	
}
