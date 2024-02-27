package com.ms.main;

import java.util.*;

import com.ms.bean.VehicleClass;
import com.ms.dao.VehicleDAO;

public class VehicleMain {

	static Scanner s = new Scanner(System.in);
	
	
	public static int displaymenu() {
		System.out.println("1.Insert 2.Delete 3.Update 4.Find 5.View All 6.Exit");
		System.out.println("Enter your Choice");
		int choice = s.nextInt();
		return choice;
	}
	
	public static VehicleClass insertVehicleClass() {
		
		System.out.println("Enter Vehicle no, Vehicle BrandName, Vehicle Price and  Vehicle Type ..!");
		return new VehicleClass(s.nextInt(), s.next(), s.nextFloat(), s.next());
		
	}
	
	 public static int deleteVehicle()
	    {
	        System.out.println("Enter the Vehicle id to delete");
	        return (s.nextInt());
	    }
	    public static VehicleClass  updateVehicleClass()
	    {
	        System.out.println("Enter Vehicle no, Vehicle BrandName and Vehicle Type ..!");
	        return new VehicleClass(s.nextInt(), s.next(), s.nextFloat(), s.next());
	    }
	    public static int findVehicle()
	    {
	        System.out.println("Enter Vehicle No to find");
	        return (s.nextInt());
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String msg="";
		int n;
		VehicleDAO dao = new VehicleDAO();
		
		do {
            switch(displaymenu()) {
            case 1:
                 VehicleClass vt1=insertVehicleClass();
                n=dao.insertVehicle(vt1);
                if(n==1)
                    System.out.println("Record Inserted Successfully");
                else
                    System.out.println("Record Insertion Failure");
                break;
                
            case 2:
                int id=deleteVehicle();
                 n=dao.deleteVehicle(id);
                    if(n==1)
                        System.out.println("Record deleted successfully :)");
                    else
                        System.out.println("Record Deletion failure");
                    break;
            
            case 3:
                VehicleClass st2=updateVehicleClass();
                n=dao.updateVehicle(st2);
                if(n==1)
                    System.out.println("Record updated successfully");
                else
                    System.out.println("record updation failure");
                break;
            case 4:
                int id1 = findVehicle();
                n = dao.findVehicles(id1);
                if (n == 1)
                    System.out.println("Record found successfully");
                else
                    System.out.println("Record not found");
                break;

            case 5:
                n = dao.viewAllDetails();
                if (n == 1)
                    System.out.println("All Record found successfully");
                else
                    System.out.println("Record not found");
                break;
            case 6:
                System.out.println("You are exit Successfully");
                System.exit(0);
            }
                
                
            
        
            System.out.println("Do you wish to continue(Yes/No)");
            msg=s.next();
    

    } while (msg.equals("Yes"));
		

	}

}
