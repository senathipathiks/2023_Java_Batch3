package com.lib.main;

import java.util.Scanner;

import com.lib.bean.Library;
import com.lib.dao.LibraryDAO;

public class LMSMain {
	
	static Scanner sc=new Scanner(System.in);
	
	public static int displaymenu() {
		System.out.println("1.Insert 2.Delete 3.Update 4.Find 5.FineALl 6.Exit");
		System.out.println("Enter your Choice");
		int choice=sc.nextInt();
		return choice;
		
	}
	
	public static Library insert() {
		System.out.println("Enter the BookId,BookName,AuthorName,Price,PublishedBy,Gener,PublishedDate");
		
		return new Library(sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.next());
		
	}
	
	public static int delete() {
		System.out.println("Enter the BookId to delete:");
		return (sc.nextInt());
		
	}
	
	public static Library update() {
		System.out.println("Enter BookId,BookName,AuthorName,Price,PublishedBy,Gener,PublishedDate");
		return new Library(sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.next());
	}	
	
	public static int find() {
		System.out.println("Enter BookId to find the details");
		return(sc.nextInt());
	
	}
	
	public static String findAll() {
		System.out.println("Enter the table name to find all the records");
		return (sc.next());
		

		
	}

	

	public static void main(String[] args) {
		String msg=" ";
		int n;
		
		LibraryDAO dao=new LibraryDAO();
		
		do {
			switch(displaymenu()) {
			
			
			case 1:
				
				Library lib=insert();
				n=dao.insertBooks(lib);
				if(n==1)
					System.out.println("Record Inserted Successfully");
				else
					System.out.println("Record Insertion Failed");
				break;
				
				
				
			case 2:
				int id=delete();
				n=dao.delete(id);
				if(n==1)
					System.out.println("Record Deleted Successfully");
				else
					System.out.println("Record Deletion failed");
				break;
				
			case 3:
				Library lib1=update();
				n=dao.updateBooks(lib1);
				if(n==1)
					System.out.println("Record Updated Successfully");
				else
					System.out.println("Record updated Failed");
				break;
				
				
			case 4:
				int id2=find();
				n=dao.find(id2);
				if(n==1)
					System.out.println("Record Find Successfully");
				else
					System.out.println("Failed to find the record");
				break;
				
			case 5:
				n=dao.findAll();
				if(n==1)
					System.out.println("Record Find Successfully");
				else
					System.out.println("Failed to find the record");
				break;
				
			case 6:
				
				
				System.out.println("Terminated");
				System.exit(0);
						
				
				
				
		}
			System.out.println("Do you want to continue(YES/NO)");
			msg=sc.next();

	}
		while(msg.equals("yes"));
			if(msg.equals("no"));
			System.out.println("Thank You.....");
	}

}
