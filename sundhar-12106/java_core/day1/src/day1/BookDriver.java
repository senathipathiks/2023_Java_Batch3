package day1;

class Book{
	
	private int bId;
	private String bName;
	private String bAurthor;
	private String bGenere;
	private double bPrice;
	
	public Book() {
		
	}
	
	public Book(int bId, String bName, String bAurthor, String bGenere, double bPrice) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.bAurthor = bAurthor;
		this.bGenere = bGenere;
		this.bPrice = bPrice;
	}
	
	public void displayBook() {
		System.out.println("Book ID"+bId);
		System.out.println("Book name"+bName);
		System.out.println("Book genere"+bGenere);
		System.out.println("Book Aurthor"+bAurthor);
		System.out.println("Book Price"+bPrice);
	}
	
	
}

public class BookDriver {
	
	public static void main(String[] args) {
		
		Book b1 = new Book(301, "Mystory House", "carter hendry", "horror", 499.99);
		
		b1.displayBook();
	}

}
