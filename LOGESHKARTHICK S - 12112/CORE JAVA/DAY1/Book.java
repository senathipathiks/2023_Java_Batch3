package DAY1;

public class Book {
	private int BookID;
	private String dept;
	private String Name;
	private String author;
	

	public Book(int BookID,String dept,String Name,String author) {
		this.BookID = BookID;
		this.dept = dept;
		this.Name = Name;
		this.author = author;
	}
	void displayBk() 
	{
		System.out.println(" BookID "+ BookID);
		System.out.println("Book department"+ dept);
		System.out.println("Book Name"+ Name);
		System.out.println("Author  Name"+ author);
		
	}
	public static void main(String[] args)
	{
		Book b1 = new Book(234,"MCA","kuran","allah");
		b1.displayBk();

	}

}
