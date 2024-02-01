package Com.Day10;

import java.util.LinkedList;
import java.util.Scanner;

class Student{
	int id;
	String name;
	String city;
	public Student(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
}

public class CollectionEg {

	public static void main(String[] args) {
		
		int id=0;
		String name=" ";
		String city=" ";
		int choice;
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		LinkedList<Student> list=new LinkedList<Student>();
//		LinkedList<Student> list1=new LinkedList<Student>();

		String msg=" ";
		
		do {
			System.out.println("1.Add Student  2.Find Student  3.Update student  4.Delete student  5.DisplayAll student  6.Exit");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter Student id,Student Name and Stuednt City");
				id=sc.nextInt();
				name=sc.next();
				city=sc.next();
				Student st1=new Student(id,name,city);
				list.add(st1);
				
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
					System.out.println("Record not Found..");
				}
				break;
			case 3:
				System.out.println("Enter Student id to update name and city:");
				id=sc.nextInt();
				name=sc.next();
				city=sc.next();
				int index=0;
				Student st2=new Student(id,name,city);
				flag=false;
				for (Student s : list) {
					if(s.id==id) {
						list.set(index,st2);
						System.out.println("Student Data updated successfully");
						flag=true;
						break;
						}
					}
				if(flag=false) {
					System.out.println("Failure to update tha data");
				}
				break;
				
			case 4:
				System.out.println("Enter student id to delete:");
				id=sc.nextInt();
				 index=0;
				flag=false;
				for(Student s:list) {
					if(s.id==id) {
						list.remove(index);
						flag=true;
						System.out.println("Data Deleted Successfully.");
						break;
						
						}
					index++;
				}
				if(flag=false) {
					System.out.println("Record not Found");
				}
				break;
			case 5:
				System.out.println("Student Details are:");
				for (Student s : list) {
					System.out.println(s.toString());
				}
				break;
			case 6:
				System.exit(choice);
			}
			System.out.println("Do you want continue? (yes/no)");
			msg=sc.next();
		}
		while(msg.equals("yes"));
		
		
         
	}

}
