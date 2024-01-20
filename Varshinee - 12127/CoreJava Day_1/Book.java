package Day_1;

public class Book {
	private String BookName;
	private String AuthorName ;
	private int PublishedYear;
	
	Book(String BookName,String AuthorName,int PublishedYear){
		this.BookName=BookName;
		this.AuthorName=AuthorName;
		this.PublishedYear=PublishedYear;
		}
	
	void DisplayBook() {
		System.out.println("Name of the Book : "+BookName);
		System.out.println("Name of the Author : "+AuthorName);
		System.out.println("Book published Year: "+PublishedYear);
	}

	public static void main(String[] args) {
		Book B1=new Book("Harry Potter","J.K.Rowling",1997);
		B1.DisplayBook();

	}

}
