package com.lib.bean;

//import java.sql.*;

public class Library {
	
	private int bookId;
	private String bookName;
	private String authorName;
	private int price;
	private String publishedBy;
	private String bookGener;
	private String publishedDate;
	
	public Library() {
		super();
	}

	public Library(int bookId, String bookName, String authorName, int price, String publishedBy, String bookGener,
			String publishedDate) {
		
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
		this.publishedBy = publishedBy;
		this.bookGener = bookGener;
		this.publishedDate = publishedDate;
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

	public String getPublishedBy() {
		return publishedBy;
	}

	public void setPublishedBy(String publishedBy) {
		this.publishedBy = publishedBy;
	}

	public String getBookGener() {
		return bookGener;
	}

	public void setBookGener(String bookGener) {
		this.bookGener = bookGener;
	}

	public String getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}
	
	
	

}
