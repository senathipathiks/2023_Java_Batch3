package Day1;

public class Book {

	private int bookID;
	private String bookName;
	private String bookAuthor;
	private String bookGenre;
	private int price;

	Book(int bookID, String bookName, String bookAuthor, String bookGenre, int price) {
		this.bookID = bookID;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookGenre = bookGenre;
		this.price = price;
	}

	void displayBook() {
		System.out.println("Book ID: " + bookID);
		System.out.println("Book Name: " + bookName);
		System.out.println("Author: " + bookAuthor);
		System.out.println("Genre: " + bookGenre);
		System.out.println("Book Price: " + price);
	}

	public static void main(String[] args) {
		Book b1 = new Book(16579, "Harry Potter and the Philosopher Stone", "J.K.Rowling", "Fantascy", 350);
		b1.displayBook();

	}

}
