package com.ofdm.main;

import java.util.List;
import java.util.Scanner;

import com.ofdm.bean.Hotel;
import com.ofdm.dao.HotelDAO;

public class OFDMMainClass {
	
	private static Scanner sc = new Scanner(System.in);
	private static HotelDAO dao = new HotelDAO();
	
	public static int displayMenu() {
		System.out.println("1)Add Record\n2)Delete Record\n3)Search Record\n4)Update Record\n5)View All Record\n6)Delete All Record\n7)Quit\nEnter your Option");
		return sc.nextInt();
	}

	public static Hotel insertHotel() {
		System.out.println("Enter Hotel id, Hotel name, Address, Phone number, Email, Rating");
		return new Hotel(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextFloat());
	}
	
	public static int deleteHotel() {
		System.out.println("Enter Id :");
		return sc.nextInt();
	}
	
	public static int searchHotel() {
		System.out.println("Enter Id :");
		return sc.nextInt();
	}
	
	public static Hotel updateHotel() {
		System.out.println("Enter Hotel id :\nEnter Update details : Hotel name, Address, Phone number, Email, Rating");
		return new Hotel(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextFloat());
	}
	
	public static String deleteAllHotel() {
		System.out.println("Are you sure ? \nPlease Enter Database password to Continue : ");
		return sc.next();
	}
	public static void main(String[] args) {
		
		boolean decision = true;
		System.out.println("Welcome to Online Food Delivery Management System\n");
		do {
			
			switch(displayMenu()) {
			
			case 1 : {
				Hotel h = insertHotel();
				int n = dao.insertHotel(h);
				if(n==1)
					System.out.println("Record Inserted Successfully");
				else
					System.out.println("Insertion Process Failure");
				break;
			}
			case 2:{
				int id = deleteHotel();
				int n = dao.deleteHotel(id);
				if(n==1)
					System.out.println("Record Deleted Successfully");
				else
					System.out.println("Deletion Process Failure");
				break;
			}
			case 3:{
				int id = searchHotel();
				Hotel h = dao.searchHotel(id);
				if(h==null)
					System.out.println("Record Not Found!");
				else
					System.out.println("Record Found!\n"+h.getHotelId()+" "+h.getHotelName()+" "+h.getAddress()+" "+h.getPhoneNo()+" "+h.getEmail()+" "+h.getRating());
				break;
			}
			case 4:{
				Hotel h = updateHotel();
				int n = dao.updateHotel(h);
				if(n==1)
					System.out.println("Record Updated Successfully");
				else
					System.out.println("Updation Process Failure");
				break;
			}
			case 5:{
				List<Hotel> list = dao.viewAllHotel();
				if(list.isEmpty())
					System.out.println("No Record Found!");
				else {
					System.out.println("Total No of Record : "+list.size()+"\n");
					for(Hotel h : list)
						System.out.println(h.getHotelId()+" "+h.getHotelName()+" "+h.getAddress()+" "+h.getPhoneNo()+" "+h.getEmail()+" "+h.getRating());
				}
				break;
			}
			case 6:{
				String password = deleteAllHotel();
				boolean flag = dao.deleteAllHotel(password);
				if(!flag)
					System.out.println("All Record Deleted Successfully");
				else
					System.out.println("Deletion Process Failure");
				break;
			}
			case 7:{
				System.out.println("Are you confirm to quit ? [y/n]");
				char ch = sc.next().charAt(0);
				if(ch=='y')
					decision = false;
				else
					System.out.println("Quitting Canceled");
				break;
			}
			default:System.out.println("Invalid Option\nPlease Enter 1-7 only");
			}
			
			System.out.println("\n--------------------------------------------------------\n");
			
		}while(decision);
		System.out.println("Thank you for using this system");
	}

}
