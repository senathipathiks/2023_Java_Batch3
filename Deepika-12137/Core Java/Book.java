package oops;

public class Book {
	private int bookId;
	private String bookName;
	private String bookType;
	private String publisher;


Book(int bookId,String bookName,String bookType,String publisher){
	this.bookId=bookId;
	this.bookName=bookName;
	this.bookType=bookType;
	this.publisher=publisher;
}
void displayBook() {
	System.out.println("Book id is "+bookId);
	System.out.println("Book Name is "+bookName);
	System.out.println("Book type is "+bookType);
	System.out.println("Published by "+publisher);
	
}

public static void main(String book[]) {
	Book b1=new Book(1001,"Ellie and Emma","Fiction","Disney");
	b1.displayBook();
}

}