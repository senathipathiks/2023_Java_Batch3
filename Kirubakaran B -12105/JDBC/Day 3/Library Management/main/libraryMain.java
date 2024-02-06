package com.lib.main;

import java.util.List;
import java.util.Scanner;

import com.lib.bean.library;
import com.lib.dao.libraryDao;

public class libraryMain {

private static Scanner sc = new Scanner(System.in);
	
	public static int displayMenu() {
		System.out.println("1)Add Record\n2)Delete Record\n3)Delete ALL \n4)Update Record\n5)Search Record\n6)View All Record\n7)Quit\nEnter your option from the above :");
		int op = sc.nextInt();
		return op;
	}
	
	//Inserting a new record
	public static library insertlibrary() {
		System.out.println("Enter library Details\n1)Book ID\n2)Book Name\n3)Author Name\n4)Book Price\n5)Publisher Name \n6)Book Genre \n7)Published Year");
		return new library(sc.nextInt(),sc.next(),sc.next(),sc.nextInt(), sc.next(), sc.next(),  sc.next());
		
	}
	
	//deleting a Record;
	public static int delelibrary() {
		System.out.println("Enter the library Id :");
		return(sc.nextInt());
	}
	
	//Delete All the Record
	public static String deleteAlllibrary() {
		System.out.println("Are you Confirm ? \nPlease Enter Password to Continue :  ");
		return(sc.next());
	}
	
	//Update a Record
	public static library updatelibrary() {
		
		System.out.println("Enter library Details\n1)Book ID\n2)Book Name\n3)Author Name\n4)Book Price\n5)Publisher Name \n6)Book Genre \n7)Published Year");
		return new library(sc.nextInt(),sc.next(),sc.next(),sc.nextInt(), sc.next(), sc.next(),  sc.next());
		
	}
	
	//Retrieve a Record
	public static int searchlibrary() {
		System.out.println("Enter the library Id :");
		return(sc.nextInt());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		boolean decision = true;
		libraryDao dao = new libraryDao();
		int n;
		String msg=" ";
		
		System.out.println("Welcome to library Management System \n");
		do {
			
			switch (displayMenu()) {
			
			case 1:{
				library s1 = insertlibrary();
				 n = dao.insertLibraryDB(s1);
				if(n==1)
					System.out.println("Record Inserted Successfully");
				else
					System.out.println("Insertion  Failure");
				break;
			}
			
			case 2 : {
				int id = delelibrary();
				 n = dao.deleteLibraryDB(id);
				if(n==1)
					System.out.println("Record Deleted SuccessFully");
				else
					System.out.println("No Record Found!");
				break;
			}
			
			case 3:{ 
				
				String pass = deleteAlllibrary();
				boolean flag = dao.deleteAllLibraryDB(pass);
				if(!flag)
					System.out.println("All Records was Deleted ");
				else
					System.out.println("Deletion unsuccessfull");
				break;
				
			}
			
			case 4:{
				library s1 = updatelibrary();
				 n = dao.updateLibraryDB(s1);
				if(n==1)
					System.out.println("Record Updated SuccessFully");
				else
					System.out.println("No Record Found!");
				break;
			}
			
			case 5:{
				int id = searchlibrary();
				library s1 = dao.searchLibraryDB(id);
				if(s1==null)
					System.out.println("No Record Found");
				else
					System.out.println("Record Found \n"+s1.getBookID()+" "+s1.getBookName()+" "+s1.getAuthorName()+" "+s1.getPrice()+" "+s1.getPublisherName()+" "+s1.getBookGenre()+" "+s1.getPublishedYear());
				break;
			}
			
			case 6: {
				List<library> list = dao.searchAllLibraryDB();
				if(list.isEmpty())
					System.out.println("No Record found!");
				else {
					System.out.println("Total no of Record : "+list.size());
					for(library s1 : list) {
						System.out.println("Record Found \n"+s1.getBookID()+" "+s1.getBookName()+" "+s1.getAuthorName()+" "+s1.getPrice()+" "+s1.getPublisherName()+" "+s1.getBookGenre()+" "+s1.getPublishedYear());
						}
				}
				break;
			}
			
			case 7:{
				System.out.println("Thank you for using this library Application");
				System.out.println("Visit again");
				System.exit(0);
				
			}

			default:
				System.out.println("Invalid Option!\nPlease Enter 1-7 only ");
			}
			
			System.out.println("\n-------------------------------------------------\n");
			System.out.println("Do you want to continue (y/n)");
			msg=sc.next();
		}while(msg.equals("y"));
		
		
		
	}

	}


