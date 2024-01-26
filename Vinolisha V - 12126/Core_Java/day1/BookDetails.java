package com.day1;

class BookDetails {

	private int bookId;
	private String bookName;
	private String bookCategory;
	private int bookRate;
	
	BookDetails(int bookId,String bookName,String bookCategory,int bookRate){
		this.bookId=bookId;
		this.bookName=bookName;
		this.bookCategory=bookCategory;
		this.bookRate=bookRate;
		
	}
	
	void displayBookDetails() {
		System.out.println("Book Id:" + bookId);
		System.out.println("Book Name:" + bookName);
		System.out.println("Book Category:" + bookCategory);
		System.out.println("Book Rate:" + bookRate);
		
	}
	
	public static void main(String arg[]) {
		BookDetails b1= new BookDetails(222,"The Beautyful Girl","Motivational",500);
		b1.displayBookDetails();
	
}
}

