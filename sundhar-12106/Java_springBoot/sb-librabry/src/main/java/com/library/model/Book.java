package com.library.model;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	@GenericGenerator(name = "custom-id", type = com.library.customIdGenerator.BookIdGenerator.class)
	@GeneratedValue(generator = "custom-id", strategy = GenerationType.IDENTITY)
	private String bookId;
	private String bookName;
	private String authorName;
	private String publisherName;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String bookId, String bookName, String authorName, String publisherName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.publisherName = publisherName;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
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

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", publisherName="
				+ publisherName + "]";
	}

}
