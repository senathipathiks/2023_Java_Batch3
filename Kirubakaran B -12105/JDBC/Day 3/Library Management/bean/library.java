package com.lib.bean;

public class library {

	private int bookID;
	private String bookName;
	private String authorName;
	private int price;
	private String publisherName;
	private String bookGenre;
	private String publishedYear;
	public library(int bookID, String bookName, String authorName, int price, String publisherName, String bookGenre,
			String publishedYear) {
		
		this.bookID = bookID;
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
		this.publisherName = publisherName;
		this.bookGenre = bookGenre;
		this.publishedYear = publishedYear;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public String getBookGenre() {
		return bookGenre;
	}
	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}
	public String getPublishedYear() {
		return publishedYear;
	}
	public void setPublishedYear(String publishedYear) {
		this.publishedYear = publishedYear;
	}
	
	
	
}
