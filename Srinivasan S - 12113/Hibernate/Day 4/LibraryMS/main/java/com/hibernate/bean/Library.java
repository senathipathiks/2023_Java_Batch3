package com.hibernate.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="Library")

public class Library {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int bookId;
	@Column(name="bookName")
	private String bookName;
	@Column(name="bookGenere")
	private String bookGenere;
	
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Library(int bookId, String bookName, String bookGenere) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookGenere = bookGenere;
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

	public String getBookGenere() {
		return bookGenere;
	}

	public void setBookGenere(String bookGenere) {
		this.bookGenere = bookGenere;
	}

	@Override
	public String toString() {
		return "Library [bookId=" + bookId + ", bookName=" + bookName + ", bookGenere=" + bookGenere + "]";
	}
	
	
	


}
