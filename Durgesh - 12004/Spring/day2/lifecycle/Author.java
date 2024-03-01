package com.day2.lifecycle;

import java.util.List;

public class Author {
	
	private int authorId;
	private String author;
	private List<String> book;
	
	
	
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Author(int authorId, String author, List<String> book) {
		super();
		this.authorId = authorId;
		this.author = author;
		this.book = book;
	}




	public int getAuthorId() {
		return authorId;
	}




	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}




	public String getAuthor() {
		return author;
	}




	public void setAuthor(String author) {
		this.author = author;
	}




	public List<String> getBook() {
		return book;
	}




	public void setBook(List<String> book) {
		this.book = book;
	}

	
	



	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", author=" + author + ", book=" + book + "]";
	}




	void display() {
		System.out.println("ID : " +authorId);
		System.out.println("Name : "+author);
		for (String string : book) {
			System.out.println("Book Written : "+string);
		}
	}

}
