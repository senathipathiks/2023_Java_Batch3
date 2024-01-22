package Day1;
public class Book {
                  private int bookID;
                  private String bookName;
                  private int noPages;
                  private String authorName;
                  
                Book(int bookID,String bookName, int noPages,String authorName){
                	 this.bookID=bookID;
                	 this.bookName=bookName;
                	 this.noPages=noPages;
                	 this.authorName=authorName;
                }
                void displayBook() {
        			System.out.println("Book ID: "+ bookID);
        			System.out.println("Book Name:"+ bookName);
        			System.out.println("Total no of Pages:"+ noPages);
        			System.out.println("The Author is :"+ authorName);
        		}
 public static void main(String[] args) {
	 
	 Book b1=new Book(1123,"The moka Surya",0,"Prem");
	  b1.displayBook();
	 
	 
	}

}
