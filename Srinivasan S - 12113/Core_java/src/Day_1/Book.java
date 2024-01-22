package Day_1;

public class Book {
	int bookId;
	String bookName,genre;
	
	public Book(int bookId, String bookName, String genre) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.genre = genre;
	}
	
	void displaybook() {
		System.out.println("Book id is: "+bookId);
		System.out.println("Book name is: "+bookName);
		System.out.println("Book genere is: "+genre);
		System.out.println("**************");
	}
	
	public static void main(String[] args) {
		Book b1=new Book(1,"Java","Programming");
		Book b2=new Book(2,"C","Programming");
		Book b3=new Book(3,"Python","Programming");
		
		b1.displaybook();
		b2.displaybook();
		b3.displaybook();

	}

}
