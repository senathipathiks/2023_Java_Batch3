package com.inv.main;

import java.util.Scanner;

import com.inv.bean.Inventory;
import com.inv.dao.InventoryDao;




public class Invmain {
	
	static Scanner sc=new Scanner(System.in);
	
	public  static int displaymenu() {		
		System.out.println("1.Insert 2.Update 3.Delete 4.FInd 5.FindAll 6.exit");
		System.out.println("Enter Your CHoice");
		int choice=sc.nextInt();
		return choice;		
	}
	
	public static Inventory insert() {		
		System.out.println("Enter the details:\nItemID,itemName,Quantity_Available,Manufacturer,Mfg_date, Price,");
		return new Inventory(sc.nextInt(),sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.nextFloat());		
	}
	
	public static Inventory update() {		
		System.out.println("Enter the details:\nItemIDkId,itemName,Quantity_Available,Manufacturer,Mfg_date, Price,");
		return new Inventory(sc.nextInt(),sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.nextFloat());		
	}
	
	public static int delete() {		
		System.out.println("Enter the Item ID to Delete");
		return (sc.nextInt());		
	}
	
	public static int Find() {		
		System.out.println("Enter the Item ID ");
		return (sc.nextInt());		
	}
	public static void main(String[] args) {
		
		String msg="";
		int n;
		InventoryDao dao=new InventoryDao();
		do {
			switch(displaymenu()) {
			case 1:
				Inventory i1=insert();
				n=dao.insert(i1);
				if(n==1) {
					System.out.println("Record insertion Succesfull");
				}
				else {
					System.out.println("Record insertion Failure");
				}
				break;
			case 2:
				Inventory l2= update();
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
			
				break;
			case 5:
				n=dao.findAll();
				break;
			case 6:
				System.out.println("Thanks for using the application");
				System.exit(0);
			}
			System.out.println("\nDo you want to continue(y/n)? ");
			msg=sc.next();	
		}while(msg.equals("yes"));
		

	}

}
