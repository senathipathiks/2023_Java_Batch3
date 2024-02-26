package com.hibernate.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Register")
public class Library {
	@Id // to set primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookId;
	@Column(name="bookName")
	private String bookName;
	@Column(name="Author")
	private String Author;
	
	 public Library() {
	    super();
     }

	public Library(int bookId,String bookName, String author) {
		super();
		this.bookName = bookName;
		Author = author;
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

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	@Override
	public String toString() {
		return "Library [bookId=" + bookId + ", bookName=" + bookName + ", Author=" + Author + "]";
	}
	
	
	 
	

}
