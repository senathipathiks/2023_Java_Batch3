package com.ums.maven.User;

import java.util.ArrayList;
import java.util.Scanner;

import com.ums.bean.User;
import com.ums.dao.UserDAO;

public class App 
{
	private static Scanner sc = new Scanner(System.in);
	private static UserDAO dao = new UserDAO();
	
	public static void main( String[] args )
    {
    	boolean decision = true;
    	System.out.println("Welcome to User Management System\n-----------------------------------------------------");
        do {
        	System.out.println("1-Add Record\n2-Delete Record\n3-Update Record\n4-Search Record\n5-View All Records\n6-Quit\nEnter your option : ");
        	int op = sc.nextInt();
        	switch(op) {
        	case 1:{
        		User u = getUser();
        		boolean n= dao.insertUser(u);
        		if(n)
        			System.out.println("Record Inserted Successfully");
        		else
        			System.out.println("Insertion Failure");
        		break;
        	}
        	case 2:{
        		int id = getId();
        		boolean n = dao.deleteUser(id);
        		if(n)
        			System.out.println("Record Deleted Successfully");
        		else
        			System.out.println("Deletion Failure");
        		break;
        	}
        	case 3:{
        		User u = getUser();
        		boolean n = dao.updateUser(u);
        		if(n)
        			System.out.println("Record Update Successfully");
        		else
        			System.out.println("Updation Failure");
        		break;
        	}
        	case 4:{
        		int id = getId();
        		User u = dao.searchUser(id);
        		if(u != null) 
        			System.out.println("Record Found !\n"+u.toString());
        		else
        			System.out.println("Record not found");
        		break;
        	}
        	case 5:{
        		ArrayList<User> u = dao.viewall();
        		if(u==null) {
        			System.out.println("No record found");
        		}
        		else {
        			System.out.println("Total no of Record : "+u.size());
        			for(User us : u)
        				System.out.println(us.toString());
        		}
        		break;
        	}
        	case 6:{
        		System.out.println("Are you Confirm?[y/n]");
        		String ch = sc.next();
        		if(ch.charAt(0)=='y')
        			decision = false;
        		else
        			System.out.println("Quitting process failure");
        		break;
        	}
        	default: System.out.println("Invalid Option \nPlease enter only 1-6");
        	}
        	
        	System.out.println("-------------------------------------------------\n");
        	
        }while(decision);
        System.out.println("Thank you for using");
    }
	
	private static User getUser() {
		System.out.println("Enter User Id, Username, and Password");
		return new User(sc.nextInt(), sc.next(), sc.next());
	}
	
	private static int getId() {
		System.out.println("Enter User Id:");
		return sc.nextInt();
	}
}
