package CorejavaDay10;


import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

class Student{
	int id;
	String name;
	String city;
	
	public Student(int id, String name,String city) {
		this.id=id;
		this.name=name;
		this.city=city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
}
	


public class CollectionEx7 {

	public static void main(String[] args) {
		
		int id=0;
		String name=" ";
		String city=" ";
		int choice;
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		LinkedList<Student> list=new LinkedList<Student>();
		
		String msg=" ";
		
		do {
			System.out.println("1.Add student 2.Find Student 3.Update Student 4.Delete Student 5.View All 6.Exit");
			choice=sc.nextInt();
	
		
		switch(choice) {
		
		case 1:
			System.out.println("Enter Student id, Student Name and Student city");
			id=sc.nextInt();
			name=sc.next();
			city=sc.next();
			Student st1=new Student(id, name,city);
			list.add(st1);
			
			
//			System.out.println("Do you wish to fill other Student details ?(yes/no)");
//			msg=sc.next();
//			
			
			System.out.println("Student Details Inserted Successfully");
			break;
			
		case 2:
			System.out.println("Enter Student id to find");
			id=sc.nextInt();
			flag=false;
			for (Student s : list) {
				if(s.id==id) {
					System.out.println(s.toString());
					flag=true;
					break;
					
				}
			}		
			
			if(flag=false) {
				
				System.out.println("Record Not Found");
			}
			break;
			
			
		case 3:
			System.out.println("Enter the Student Update");
			System.out.println("Enter the Student ID for update");
			id=sc.nextInt();
			if(id==id) {
				id=sc.nextInt();
				System.out.printf(" ");
			}
			name=sc.next();
			city=sc.next();
			
			
			break;
			
		case 4:
			System.out.println("Enter Student id to delete");
			id=sc.nextInt();
			int index=0;
			flag=false;
			for (Student s : list) {
				if(s.id==id) {
					list.remove(index);
					flag=true;
					break;
				}
				index++;
			}
			if(flag=false) {
				System.out.println("Record Not Found");
			}
			break;
			
		case 5:
			System.out.println("To view all studetns list");
			System.out.println(list);
		}
		
		System.out.println("Do you wish to continue(yes/no)");
		msg=sc.next();
		
}while(flag);
}
}