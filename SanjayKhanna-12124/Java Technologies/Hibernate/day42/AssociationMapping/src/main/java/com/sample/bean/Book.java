package com.sample.bean;

import javax.persistence.*;


@Entity
@Table
public class Book {
	@Id
	private int bookId;
	private String bookName;
	
	public Book() {
		
	}

	public Book(int bookId, String bookName) {
		this.bookId = bookId;
		this.bookName = bookName;
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
	
	
}
