package com.sample.bean;

import java.util.*;
import javax.persistence.*;

@Entity
@Table
public class Author {
	
	@Id
	private int authorId;
	private String authorName;

	@OneToMany(targetEntity = Book.class,cascade = CascadeType.ALL)
	private List<Book> books;

	public Author() {
		
	}

	public Author(int authorId, String authorName, List<Book> books) {
		this.authorId = authorId;
		this.authorName = authorName;
		this.books = books;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
}
