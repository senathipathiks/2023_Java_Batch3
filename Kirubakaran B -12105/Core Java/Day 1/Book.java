package classIntro;

public class Book {
	private int bookId;
	private String bookName;
	private String author;
	private String awards;
	
	Book(){
		
	}
	

	public Book(int bookId, String bookName, String author, String awards) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.awards = awards;
	}
	void display() {
		System.out.println("BookId   : "+bookId);
		System.out.println("BookName : "+bookName);
		System.out.println("Author   : "+author);
		System.out.println("Awards   : "+awards);
		}


	public static void main(String[] args) {
		Book b1=new Book(12,"Legend kiruba","Mr.prem","Nobel");
		
		Book b2=new Book(13,"Legend Loki","Mr.jothi","Arjuna");
		b1.display();
		System.out.println("-----------------------------");
		b2.display();

	}

}
