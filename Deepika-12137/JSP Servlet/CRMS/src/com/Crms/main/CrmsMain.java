package com.Crms.main;
    import java.util.*;

import com.Crms.bean.Crms;
import com.Crms.dao.*;;
	public class CrmsMain {

		static Scanner sc=new Scanner(System.in);
		
		public static int displaymenu()
		{
			System.out.println("1.Insert 2.Delete 3.Update 4.Find 5.FindAll");
			System.out.println("Enter the choice");
			int ch=sc.nextInt();
			return ch;
		}
		
		public static Crms insertCar() 
		    {
			System.out.println("Add CarID, CarType, CarModel, RatePerKM & SeatCapacity  :");
			return new Crms(sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),sc.next());
			}	
		
		public static int deleteCar() {
			System.out.println("Enter the CarId you want to delete");
			return (sc.nextInt());
		}
		
		public static Crms updateCar() {
			System.out.println("Enter CarId, CarType,CarModel, RatePerKM & SeatCapacity to update :");
			return new Crms(sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),sc.next());
		}
		
		public static int findCar() {
			System.out.println("Enter the CarId to view");
			return (sc.nextInt());
		}
		
		public static void findAll() {
			System.out.println("Car Listing");
		}
		
		 public static void main(String[] args) {
		        boolean decision=true;
		        String msg=" ";
		        int n;
		        CrmsDao dao=new CrmsDao();
		        do {
		            switch(displaymenu()) {
		            case 1:
		                Crms car1=insertCar();
		                n=dao.insertCar(car1);
		                if (n==1) 
		                    System.out.println("Record Inserted Successfully");
		                else 
		                    System.out.println("Record Insertion Failed");
//	                decision=false;
		                break;
		                
		            case 2: 
		                int id=deleteCar();
		                n=dao.deleteCar(id);
		                if (n==1) 
		                    System.out.println("Record Deletion Successfully");
		                else 
		                    System.out.println("Record Deletion Failed");
//		                decision=false;
		                break;
		                
		            case 3: 
		                Crms car2=(Crms) updateCar();
		                n=dao.updateCar(car2);
		                if (n==1) 
		                    System.out.println("Record Updation Successfully");
		                else 
		                    System.out.println("Record Updation Failed");
//		                decision=false;
		                break;
		                
		            case 4: 
		                int car3=findCar();
		                n=dao.findCar(car3);
		                if (n==1) 
		                    System.out.println("Record Found Successfully");
		                else 
		                    System.out.println("Record Finding Failed");
//		                decision=false;
		                break;
		                
		            case 5:
		            	findAll();
		            	dao.findAll();
		            	break;
		            	
		            		
		            
		            case 6:
		                System.out.println("Thank you...");
		                decision=false;
		                
		            }
		        }while(decision);
		    }

		}



