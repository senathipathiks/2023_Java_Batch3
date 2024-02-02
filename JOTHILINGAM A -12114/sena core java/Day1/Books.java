package Day1;

public class Books {
	
	private int bookID;
	private String bookName;
	private String author;
	private int bookPrice;
	private String genre;
	
public Books(int bookID, String bookName, String author, int bookPrice, String genre) {
		
		this.bookID = bookID;
		this.bookName = bookName;
		this.author = author;
		this.bookPrice = bookPrice;
		this.genre = genre;
	}
  void dispalayBook() {
	  System.out.println("Book Details");
	  System.out.println("---------------------");
	  System.out.println("Book ID    :" + bookID);
	  System.out.println("Book Name  :" + bookName);
	  System.out.println(" Author    :" + author);
	  System.out.println("Book Price :" + bookPrice);
	  System.out.println("Book Genre :" + genre);
  }

public static void main(String[] args) {
		
		Books b1=new Books(101, "money", "Anand srinivasan",1500 , "economy");
		b1.dispalayBook();

	}

}
