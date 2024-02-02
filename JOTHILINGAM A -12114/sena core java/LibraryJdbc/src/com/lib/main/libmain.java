package com.lib.main;

import java.util.Scanner;

import com.lib.bean.library;
import com.lib.dao.LibraryDao;

public class libmain {
		 static Scanner sc=new Scanner(System.in);
		
		public static int displaymenu() {
			System.out.println("1. Insert 2.Update 3.Delete 4.Find 5.FindAll ");
			System.out.println("Enter Your CHoice: ");
			int choice=sc.nextInt();
			return choice;			
		}
		
		public static library insert() {
			
			System.out.println("Enter the details:\nBookId,BookName,AuthorName,Price,PublisherName,Genre,PublishedDate");
			return new library(sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.next());
			
		}
		public static library update() {
			
			System.out.println("Enter the details:\nBookId,BookName,AuthorName,Price,PublisherName,Genre,PublishedDate");
			return new library(sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.next());
			
		}
		public static int delete() {
			
			System.out.println("Enter the Book ID to Delete");
			return (sc.nextInt());
			
		}
			public static int Find() {
			
			System.out.println("Enter the Book ID ");
			return (sc.nextInt());
			
		}
		
		
		
	public static void main(String[] args) {		
		String msg=" ";
		int n;
		LibraryDao dao=new LibraryDao();
		do {
			switch(displaymenu())
			{
			case 1:
				library l1= insert();
				n=dao.insert(l1);
				if(n==1) {
					System.out.println("\nRecord insertion succesfully");
				}else {
					System.out.println("Record insertion Failure");
				}
				break;
			case 2:
				library l2= update();
				n=dao.update(l2);
				if(n==1) {
					System.out.println("Record Updated succesfully");
				}else {
					System.out.println("Record Updation Failure");
				}
				break;			
			case 3:
				int id=delete();
				n=dao.delete(id);
				if(n==1) {
					System.out.println("Record Deleted succesfully");
				}else {
					System.out.println("Record Deletion Failure!!!!");
				}
				break;
			case 4:
				int id1=Find();
				n=dao.Find(id1);
				if(n==1)
					System.out.println("Record Found");
				else {
					System.out.println("Record Not Found");
				}
				break;
			case 5:
				n=dao.fingAll();
				break;				
			}			
			System.out.println("\n\nDo you want to continue(y/n)? ");
			msg=sc.next();
		}while(msg.equals("y"));
	}
}