package com.vms.main;

import java.util.Scanner;

import com.vms.bean.Vehicle;
import com.vms.dao.VehicleDao;

public class VehicleMain {
	
	 static Scanner sc = new Scanner(System.in);
		
		public static int display() {
			System.out.println("Enter the Choice \n1.Insert \n2.Update \n3.Find \n4.delete \n5.Exit");
			System.out.println("Enter the Choice: ");
			int c = sc.nextInt();
			return c;
		
		}
		
		public static Vehicle insertVehicle() {
			System.out.println("Enter the Vehicle information : Vehicle number \nVehicle name \nVehicle Brand \nVechile price \nBuyer Id \nSeller ID");
			return new Vehicle(sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		}
		
		public static int updateVehicle() {
			System.out.println("Enter the Vechile price");
			return sc.nextInt();
		}
		
		public static int findVehicle() {
			System.out.println("Enter the Vechile number: ");
			return sc.nextInt();
		}
		
		public static int deleteVehicle() {
			System.out.println("Enter the Vehicle ID: ");
			return sc.nextInt();
		}
		
		public static void main(String[] args) {
			String msg;
			int b;
			VehicleDao d = new VehicleDao();
		
		do {
			switch (display()) {
			case 1: {
				Vehicle v1 = insertVehicle();
				b = d.insertVehicle(v1);
				if(b==1)
					System.out.println("Record entered Successfully");
				else 
					System.out.println("Entry failed");
			}				
				break;
			case 2: {
				int price = updateVehicle();
				int v_id = updateVehicle();
				b = d.updateVehicle(price, v_id);
				if(b==1)
					System.out.println("Updated Successlly");
				else
					System.out.println("Update failed");
			}
			break;
			
			case 3: {
				int v_id = findVehicle();
				b = d.findVehicle(v_id);
				if(b==1)
					System.out.println("Record Found");
				else
					System.out.println("Record Not found");
			}
			break;
			case 4:{
				int v_id = deleteVehicle();
				b = d.deleteVehicle(v_id);
				if (b==1)
					System.out.println("Record Deleted successfully");
				else
					System.out.println("Record cannot be deleted");
			}
			break;
			
			case 5: {
				System.out.println("Thank you.");
				System.exit(0);
			}

			}
			System.out.println("Do you want to continue : (Yes/No)");
			msg = sc.next();			
		} while (msg.equals("yes"));
		
	}

}
