package Com.Day1;

public class BookDetails {

		private int bookId;
		private String bookName;
		private String bookCategory;
		BookDetails(){
			
		}
		BookDetails(int bookId,String bookName,String bookCategory){
			this.bookId=bookId;
			this.bookName=bookName;
			this.bookCategory=bookCategory;
			
			
		}
		void displayBookdetails() {
			System.out.println("Book Id is:" +bookId);
			System.out.println("Book Name is:" +bookName);
			System.out.println("Book Category is:" +bookCategory);
			

		}
		

		public static void main(String[] args) {
			BookDetails obj1=new BookDetails(1001,"Ikigai","Fantasy");
			obj1.displayBookdetails();

		}

	}


	