package com.day2.collection;

import java.util.List;

public class Author {
		
		private int authorId;
		private String author;
		private List<Book> book;
		
		public Author() {
			super();
			// TODO Auto-generated constructor stub
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


		public List<Book> getBook() {
			return book;
		}


		public void setBook(List<Book> book) {
			this.book = book;
		}


		@Override
		public String toString() {
			return "Author [authorId=" + authorId + ", author=" + author + ", book=" + book + "]";
		}


		void display() {
			System.out.println("ID : " +authorId);
			System.out.println("Name : "+author);
			for (Book string : book) {
				System.out.println("Book Written : "+string);
			}
		}

	}

