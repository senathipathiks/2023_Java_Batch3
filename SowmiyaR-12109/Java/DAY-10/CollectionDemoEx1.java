package Day10;

import java.util.LinkedList;
import java.util.Scanner;

class Student{
	int id;
	String name;
	
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
public class CollectionDemoEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int id=0;
      String name=" ";
      int choice;
      boolean flag=false;
      Scanner sc=new Scanner(System.in);
      LinkedList<Student> list=new LinkedList<Student>();
      String mgs=" ";
      
      do {
    	  System.out.println("1.Add Student 2.Find Student 3.Update Student 4.Delete Student 5.Findall Student 6.exit");
    	  choice=sc.nextInt();
    	  
    	  switch(choice)
    	  {
    	  case 1:
    		  System.out.println("Enter Student id,Student Name");
    		  id=sc.nextInt();
    		  name=sc.next();
    		  Student st1=new Student(id,name);
    		  list.add(st1);
    		  
    		  System.out.println("Student Details Inserted Successfully");
    		  break;
    	  case 2:
    		  System.out.println("Enter Student id to find");
    		  id=sc.nextInt();
    		  flag=false;
    		  for(Student s:list) {
    			  if(s.id==id)
    			  {
    				  System.out.println(s.toString());
    				  flag=true;
    				  break;
    			  }
    		  }
    		  if(flag==false) {
    			  System.out.println("Record Not Found");
    		  }
    		  break;
    		  
    	  case 3:
    		  System.out.println("Enter the Student id to update:");
    		  id=sc.nextInt();
    		  flag=false;
    		  
  			  for(Student s:list)
  			
    		  if(s.id==id)
    		  {
    			 s.name=sc.next(); 
    			 System.out.println("Student id: "+id+ "Student Name: "+s.name);
    			System.out.println("Successfull"); } 
    			else
    				System.out.println("fail");
    		  
    		  break;
    	  case 4:
    		  System.out.println("Enter Student id to delete");
    		  id=sc.nextInt();
    		  int index=0;
    		  flag=false;
    		  for(Student s:list) {
    			  if(s.id==id)
    			  {
    				  list.remove(index);
    				  flag=false;
    				  break;
    			  }
    			  index++;
    		  }
    		  if(flag=false)
    		  {
    			  System.out.println("Record Not Found");
    		  }
    		 break;
    	  case 5:
    		  System.out.println("Find all the Student");
    		  for(Student s:list) {
    			  System.out.println(s+" ");
    		  }
    		  break;
    	  case 6:
    		  System.out.println("Exited successfully");
    		  System.out.println();
    	  }
    	  System.out.println("Do you wish to continue(yes/no");
    	  mgs=sc.next();
      }while(mgs.equals("yes"));
	}

	private static Object getId() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void setString(int i, Object name) {
		// TODO Auto-generated method stub
		
	}

	private static Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
}


