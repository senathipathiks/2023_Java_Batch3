package com.hospital.main;

import java.util.Scanner;

import com.hospital.bean.Hospital;
import com.hospital.dao.HospDAO;

public class Hospmain {
	static Scanner sc=new Scanner(System.in);
	
	public static int menu() {	//method for entering choice to perform option
		
		System.out.println("1.Insert\n2.Delete\n3.Update\n4.Find\n5.FindAll\n6.Exit");
		System.out.println("Enter your option");
		int opt=sc.nextInt();
		return opt;
	}
	
	public static Hospital insertDetails() {
		
		System.out.println("Enter Patient id, Patient name, Doctor id, Doctor name");
		return new Hospital(sc.nextInt(),sc.next(),sc.nextInt(),sc.next()) ;
		
	}
	
	public static int findDetails() {
		
		System.out.println("Enter Patient id to get details");
		return (sc.nextInt());
	}
	
	public static Hospital updateDetails() {
		System.out.println("Enter Patient id, Patient name, Doctor id, Doctor name to Update");
		return new Hospital(sc.nextInt(),sc.next(),sc.nextInt(),sc.next());
	}
	
	public static int deleteDetails() {
		
		System.out.println("Enter Patient id to Delete");
		return (sc.nextInt());
	}
	
	
	public static void main(String[] args) {
		int msg=0;
		int n=0;
		
		HospDAO dao=new HospDAO();
		
		do {
			switch (menu()) {
			case 1:
				Hospital h1=insertDetails();
				n=dao.insert(h1);
				if(n==1) {
					System.out.println("Added successfully");
				}
				else
					System.out.println("Adding failed");
				break;
				
			case 2:
				int h2=deleteDetails();
				n=dao.delete(h2);
				if(n==1) {
					System.out.println("Deleted successfully");
				}
				else 
					System.out.println("Deletion failed");
				
				break;
				
			case 3:
				Hospital h3=updateDetails();
				n=dao.update(h3);
				
				if(n==1) {
					System.out.println("Updated successfully");
				}
				else
					System.out.println("Updation failed");
				break;
				
			case 4:
				int h4=findDetails();
				n=dao.find(h4);
				
				if(n==1) {
					System.out.println("Record founded");
				}
				else {
					System.out.println("Record not found");
				}
				break;
				
			case 5:
				n=dao.findAll();
				
				if(n>0) {
					System.out.println("Record founded");
				}
				else
					System.out.println("Record founding failed");
				break;
				
			case 6:
				System.out.println("Thank You !");
				System.exit(0);
				
			default:
				break;
			}
			System.out.println("You want to continue \n1.Yes\n2.No");
			msg=sc.nextInt();
		} while (msg==1);
		System.out.println("Thank You !");
	}

}
