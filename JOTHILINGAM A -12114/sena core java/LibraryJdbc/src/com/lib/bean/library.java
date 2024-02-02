package com.lib.bean;

public class library {
	private int bookID;
	private String bookName;
	private String authorName;
	private int price;
	private String publisherName;
	private String genre;
	private String publisheddate;
	
	public library() {
		// TODO Auto-generated constructor stub
	}
	
	

	public library(int bookID, String bookName, String authorName, int price, String publisherName, String genre,
			String publisheddate) {
		super();
		this.bookID = bookID;
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
		this.publisherName = publisherName;
		this.genre = genre;
		this.publisheddate = publisheddate;
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
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPublisheddate() {
		return publisheddate;
	}
	public void setPublisheddate(String publisheddate) {
		this.publisheddate = publisheddate;
	}

	

}
