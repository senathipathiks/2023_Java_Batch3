package com.veh.main;

import java.util.List;
import java.util.Scanner;
import com.veh.bean.Vehichle;
import com.veh.dao.VehichleDao;

public class VehicleMain {

private static Scanner sc = new Scanner(System.in);
	
	public static int displayMenu() {
		System.out.println("1)Add Record\n2)Delete Record\n3)Delete ALL \n4)Update Record\n5)Search Record\n6)View All Record\n7)Quit\nEnter your option from the above :");
		int op = sc.nextInt();
		return op;
	}
	
	//Inserting a new record
	public static Vehichle insertVehichle() {
		System.out.println("Enter Vehichle Details\n1)Vehichle ID\n2)Vehichle Name\n3)Vehichle Brand\n4)Vehichle Color");
		return new Vehichle(sc.nextInt(),sc.next(),sc.next(),sc.next());
	}
	
	//deleting a Record;
	public static int deleVehichle() {
		System.out.println("Enter the Vehichle Id :");
		return(sc.nextInt());
	}
	
	//Delete All the Record
	public static String deleteAllVehichle() {
		System.out.println("Are you Confirm ? \nPlease Enter Password to Continue :  ");
		return(sc.next());
	}
	
	//Update a Record
	public static Vehichle updateVehichle() {
		
		System.out.println("Enter the Id to update and Details\n1)Vehichle Name\n2)Vehichle Brand\n3)Vehichle Color");
		return new Vehichle(sc.nextInt(),sc.next(),sc.next(),sc.next());
		
	}
	
	//Retrieve a Record
	public static int searchVehichle() {
		System.out.println("Enter the Vehichle Id :");
		return(sc.nextInt());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean decision = true;
		VehichleDao dao = new VehichleDao();
		int n;
		
		System.out.println("Welcome to Vehichle Management System \n");
		do {
			
			switch (displayMenu()) {
			
			case 1:{
				Vehichle s1 = insertVehichle();
				 n = dao.insertVehichleDB(s1);
				if(n==1)
					System.out.println("Record Inserted Successfully");
				else
					System.out.println("Insertion Process Failure");
				break;
			}
			
			case 2 : {
				int id = deleVehichle();
				 n = dao.deleteVehichleDB(id);
				if(n==1)
					System.out.println("Record Deleted SuccessFully");
				else
					System.out.println("No Record Found!");
				break;
			}
			
			case 3:{ 
				
				String pass = deleteAllVehichle();
				boolean flag = dao.deleteAllVehichleDB(pass);
				if(!flag)
					System.out.println("All Records was Deleted ");
				else
					System.out.println("Deletion was Interrupt.");
				break;
				
			}
			
			case 4:{
				Vehichle s1 = updateVehichle();
				 n = dao.updateVehichleDB(s1);
				if(n==1)
					System.out.println("Record Updated SuccessFully");
				else
					System.out.println("No Record Found!");
				break;
			}
			
			case 5:{
				int id = searchVehichle();
				Vehichle s1 = dao.searchVehichleDB(id);
				if(s1==null)
					System.out.println("No Record Found");
				else
					System.out.println("Record Found \n"+s1.getId()+" "+s1.getName()+" "+s1.getBrand()+" "+s1.getColor());
				break;
			}
			
			case 6: {
				List<Vehichle> list = dao.searchAllVehichleDB();
				if(list.isEmpty())
					System.out.println("No Record found!");
				else {
					System.out.println("Total no of Record : "+list.size());
					for(Vehichle s1 : list) {
						System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getBrand()+" "+s1.getColor());
					}
				}
				break;
			}
			
			case 7:{
				System.out.println("Confirm are you quiting?[y/n]");
				String s = sc.next();
				if(s.equals("y")) 
					decision = false;
				else
					System.out.println("Quiting Cancelled");
				break;
			}

			default:
				System.out.println("Invalid Option!\nPlease Enter 1-7 only ");
			}
			
			System.out.println("\n-------------------------------------------------\n");
			
		}while(decision);
		
		System.out.println("Thank you for using This Application");
		
	}
		
	}


