package Day1;

public class Book {

	private String Name;
	private String Author;
	private double price;  //instance variable
	
    Book(String Name,String Author,double price){ //local variable
	this.Name=Name;
	this.Author=Author;
	this.price=price;
	
	}
	void displayBook(){
		System.out.println("Book name:"+Name);
		System.out.println("Book Author:"+Author);
		System.out.println("Book Prize:"+price);
		
		}
	public static void main (String s[]) {
		Book s1=new Book("motivation","varsh",200);
		s1.displayBook();
		System.out.println(".................");
		
	}

}
