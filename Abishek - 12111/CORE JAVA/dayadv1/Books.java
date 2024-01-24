package com.dayadv1;

public class Books {
private int bookID;
private String bookName;
private String dept;
private int sectionNo;
//constructor
	public Books(int bookID, String bookName, String dept, int sectionNo) {

	this.bookID = bookID;
	this.bookName = bookName;
	this.dept = dept;
	this.sectionNo = sectionNo;
}
void displayBook()
{
	System.out.println("Book Id is " +bookID);
	System.out.println("the name of the book is " +bookName);
	System.out.println("The dept of the " +bookID+ " is " +dept);
	System.out.println("The section number is " +sectionNo);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books obj = new Books(1, "Prince of Persia", "Novel",35);
		obj.displayBook();
	}

}
