package com.hrs.main;

import java.util.Scanner;

import com.hrs.bean.HotelRoomReservationSystem;
import com.hrs.dao.HotelRoomReservationSystemDAO;

public class HRSMain {
static Scanner sc=new Scanner(System.in);
	
	public static int displaymenu()
	{
		System.out.println("1.Insert  2.Delete  3.Update   4.Find  5.FindAll  6.Exit");
		System.out.println("Enter your Choice");
		int choice=sc.nextInt();
		return choice;
	}
	
	public static HotelRoomReservationSystem insertHotelRoomReservationSystem()
	{
		int RoomID;
		System.out.println("Enter Room ID: ");
		RoomID=sc.nextInt();
		
		String RoomType;
		System.out.println("Enter Room Type: ");
		sc.nextLine();
		RoomType=sc.next();
		
		int RoomTariff ;
		System.out.println("Enter Room Tariff: ");
		sc.nextLine();
		RoomTariff=sc.nextInt();
		
		String RoomDesc;
		System.out.println("Enter Room Desc: ");
		sc.nextLine();
		RoomDesc=sc.next();
		
		String Occupancy;
		System.out.println("Enter Room Occupancy: ");
		sc.nextLine();
		Occupancy=sc.next();
		
				
		return new HotelRoomReservationSystem(RoomID,RoomType,RoomTariff,RoomDesc,Occupancy);
	}
	
	public static int deleteHotelRoomReservationSystem()
	{
		System.out.println("Enter the Room Id to delete ");
		return (sc.nextInt());
	}
	
	public static HotelRoomReservationSystem updateHotelRoomReservationSystem()
	{	
	int RoomID;
	System.out.println("Enter Room ID: ");
	RoomID=sc.nextInt();
	
	String RoomType;
	System.out.println("Enter Room Type: ");
	sc.nextLine();
	RoomType=sc.next();
	
	int RoomTariff ;
	System.out.println("Enter Room Tariff: ");
	sc.nextLine();
	RoomTariff=sc.nextInt();
	
	String RoomDesc;
	System.out.println("Enter Room Desc: ");
	sc.nextLine();
	RoomDesc=sc.next();
	
	String Occupancy;
	System.out.println("Enter Room Occupancy: ");
	sc.nextLine();
	Occupancy=sc.next();
			
	return new HotelRoomReservationSystem(RoomID,RoomType,RoomTariff,RoomDesc,Occupancy);
}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg=" ";
		int n;
		HotelRoomReservationSystemDAO dao=new HotelRoomReservationSystemDAO();
		do {
			switch(displaymenu())
			{
			case 1:
				HotelRoomReservationSystem obs1=insertHotelRoomReservationSystem();
				n=dao.insertHotelRoomReservationSystem(obs1);
				if(n==1)
					System.out.println("Record Inserted Successfully");
				else
					System.out.println("Record Insertion Failure");
				break;
				
			case 2:
				int RoomID=deleteHotelRoomReservationSystem();
				n=dao.deleteHotelRoomReservationSystem(RoomID);
				if(n==1)
					System.out.println("Record Deleted Successfully");
				else
					System.out.println("Record Deletion Failure");
				break;
			
		  
			case 3:
				HotelRoomReservationSystem obs2=updateHotelRoomReservationSystem();
				n=dao.updateHotelRoomReservationSystem(obs2);
				if(n==1)
					System.out.println("Record Updated Successfully");
				else
					System.out.println("Record Updation Failure");
				break;
				
			case 4:
				System.out.println("Enter the Room ID to find ");
				int RoomID1=sc.nextInt();
				HotelRoomReservationSystem obs3=dao.findHotelRoomReservationSystem(RoomID1);
				if(obs3!=null)
					System.out.println(obs3);
				else
					System.out.println("Record Not Found");
				break;
				
			case 5:
				HotelRoomReservationSystem[] obs4=dao.findAllHotelRoomReservationSystem();
				if(obs4!=null)
				{
					for(HotelRoomReservationSystem s:obs4)
						System.out.println(s);
				}
				else
					System.out.println("No Records Found");
				break;
			}
			
			System.out.println("Do you wish to continue(yes/no)");
		  msg=sc.next();
			
		} while(msg.equals("yes"));
	}

}




