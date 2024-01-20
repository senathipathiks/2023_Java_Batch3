package CoreTopic;

public class Book {
	private String bookName;
	private int bookNo; 
	private String bookType;
	private String authorName;
	public Book(String bookName, int bookNo, String bookType, String authorName) {
		super();
		this.bookName = bookName;
		this.bookNo = bookNo;
		this.bookType = bookType;
		this.authorName = authorName;
	}
	void displayBook()
    {
        System.out.println("book name is - " + bookName);
        System.out.println("book number is - " + bookNo );
        System.out.println("bookType is - "+ bookType  );
        System.out.println("authorName is - " + authorName);
    }
	
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Book obj = new Book("Poniyan selvan", 100, "novel", "kalkii");
        obj.displayBook();
    }
	

}
