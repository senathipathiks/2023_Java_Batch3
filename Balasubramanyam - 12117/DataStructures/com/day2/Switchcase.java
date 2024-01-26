package com.day2;
import java.util.*;
public class Switchcase {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
        
		ArrayList<Integer> list = new ArrayList<Integer>();
		        
		        while(true) {    
		        System.out.println("1. Add the Element");
		        System.out.println("2. Remove the Element");
		        System.out.println("3. view the Element");
		        System.out.println("4. Find the Element");
		        System.out.println("5. Update the Element");
		        System.out.println("6. Quit");
		        System.out.println("enter the choice:");
		        int choice = sc.nextInt();
		       
		        switch(choice)
		        {
		        case 1:
		            System.out.println("Enter the total n.o of elements");
		            int n = sc.nextInt();
		            System.out.println("enter "+n+ " elements");
		            for(int i=0;i<n; i++)
		            {  
		                list.add(sc.nextInt());
		            }
		            System.out.println(list);
		        break;
		        
		        case 2 :
		            System.out.println("Enter the element to Remove");
		            int k = sc.nextInt();
		            boolean flag = false;
		            for(int i=0; i<list.size(); i++)
		            {
		                if(k==list.get(i))
		                {
		                    flag = true;
		                    list.remove(i);
		                    System.out.println("The element is removed");
		                    break;
		            }}
		            
		            if(flag == false)
		            {
		                System.out.println("element not found");
		            }
		            System.out.println(list);
		            break;
		        case 3:
		            System.out.println(list);
		            break;
		        case 4:
		            System.out.println("Enter the Element to Find");
		            boolean flag1 = false;
		            int element=sc.nextInt();
		            for (int i = 0; i < list.size(); i++) {
		                
		                if(element==i) {
		                    System.out.println("element found int the index "+list.get(i));
		                    flag1 = true;
		                    break;
		                
		            }
		            }if(flag1==false) {
		                System.out.println("element not found");
		            }
		                break;
		          case 5: 
		                System.out.println("Enter the index to Update:");
		                int index=sc.nextInt();
		                System.out.println("Enter the Element to Update:");
		                int updateElement=sc.nextInt();        
		                list.set(index, updateElement);
		                break;
		           case 6:
		                    System.exit(0);
		                    break;
		                    default:
		                    	
		                  
		        }} 
		        
	}}
        	 
                	 