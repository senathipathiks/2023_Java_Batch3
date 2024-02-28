package com.ims.main;

import java.util.Scanner;

import com.ims.dao.*;
import com.ims.bean.*;

public class InventoryMainClass {
	
static Scanner sc=new Scanner(System.in);
	
	public static int displayMenu() {
		System.out.println("1.Insert product. \n2.Delete Product \n3.Update Product \n4.Find Product \n5.Find All Product \n6.Exit \n\n<----Enter your Option---->");
		int choice=sc.nextInt();
		return choice;
	}
	
	public static Inventory insertProduct() {
		System.out.println("Enter the Item id, Item name, Quantity in Stock, Manufacturer, MFG Date and Price of the Product");
		return new Inventory(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextFloat());
	}
	
	public static int deleteProduct() {
		System.out.println("Enter the Item ID to Delete the Product");
		return (sc.nextInt());
	}
	
	public static Inventory updateProduct() {
		System.err.println("Enter the Item id, Item name, Quantity in Stock, Manufacturer, MFG Date and Price of the Product to Update");
		return new Inventory(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextFloat());
	}

	public static int findProduct() {
		System.err.println("Enter the Product ID to Find");
		return (sc.nextInt());
	}
	
	

	public static void main(String[] args) {
		
		boolean decision=true;
		String msg=" ";
		int n;
		
		InventoryDAO dao=new InventoryDAO();
		do {
			switch (displayMenu()) {
			case 1:
				Inventory inv1=insertProduct();
				n=dao.insertProduct(inv1);
				if (n==1) {
					System.err.println("\nProduct Inserted Successfully\n");
				} else {
					System.err.println("\nProduct Insertion Failed\n");
				}
				break;
				
			case 2: 
				int id=deleteProduct();
				n=dao.deleteProduct(id);
				if (n==1) 
					System.err.println("\nProduct Deletion Successfully\n");
				else 
					System.err.println("\nProduct Deletion Failed\n");
				break;
				
			case 3: 
				
				Inventory inv2=(Inventory) updateProduct();
				n=dao.updateProduct(inv2);
				if (n==1) 
					System.err.println("\nProduct Updation Successfully\n");
				else 
					System.err.println("\nProduct Updation Failed\n");
				break;
				
			case 4: 
				int emp3=findProduct();
				n=dao.findProduct(emp3);
				if (n==1) 
					System.err.println("\nProduct Found Successfully\n");
				else 
					System.err.println("\nProduct Finding Failed\n");
				break;
			
			case 5:	
				dao.findAllProduct();
				break;
				
			case 6:
				System.err.println("******************* Thank You *******************");
				decision=false;
				break;
			default:
				System.err.println("******************* Invalid Input *******************");
				break;
				
			

			}
		}while(decision);

	}
}
