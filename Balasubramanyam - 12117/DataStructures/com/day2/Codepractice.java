package com.day2;
import java.util.*;
public class Codepractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc =new Scanner(System.in);
    ArrayList<Object> list = new ArrayList<Object>();
    while(true) {
    	System.out.println("1.Add the element");
    	System.out.println("2.Search the element");
    	System.out.println("3.Update the element");
    	System.out.println("4.Remove the element");
    	System.out.println("5.Find the element");
    	System.out.println("6.View ");
    	System.out.println("7.Exist");
    	System.out.println("Enter the CHOICE: ");
    	int choice =sc.nextInt();
    	switch(choice){
    	case 1:
    		System.out.println("enter the no of elements:");
    		int n = sc.nextInt();
    		System.out.println("enter the "+ n +"elements:");
    		for(int i=0;i<n;i++) {
    			int t=sc.nextInt();
  	    	  list.add(t);
  	    	
    			
    		}
    		System.out.println(list);
    	break;
    	case 2:
    		
  	      System.out.println("enter the searching element");
  	      int k=sc.nextInt();
  	      for(int i=0;i<list.size();i++) {
  	    	  if(k==(int)list.get(i)) {
  	    		 
  	    		 System.out.println("the searching element is found at:"+i);
  	    	  }}
    		break;
    	case 3:
    		System.out.println("enter the index:");
    		int index=sc.nextInt();
    		System.out.println("eneter the updated element:");
    		int updatedElement=sc.nextInt();
    		list.set(index,updatedElement);
    		break;
    	case 4:
    		
    		System.out.println("enter the removing element:");
    		int a=sc.nextInt();
    		for(int i=0;i<list.size();i++) {
    			if(a==(int)list.get(i)) {
    				list.remove(i);
    				
    				System.out.println("the removing elemenet is:"+i);}
    		}
    			
    	break;
    	case 5:
    		
    		System.out.println("enter the element to find:");
    		int element=sc.nextInt();
    		for(int i=0;i<list.size();i++) {
    			if(i==element) {
    				
    				System.out.println("the finding elemenet is:"+i);}
    				
    			}
    		
    		break;
    	case 6:
    		System.out.println(list);
    		break;
    	case 7:
    		System.exit(0);
    		break;
    	default:
    	}
    	
    }
    	
    }
	

}
