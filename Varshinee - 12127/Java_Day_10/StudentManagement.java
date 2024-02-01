package Java_Day_10;

import java.util.LinkedList;
import java.util.Scanner;

class Student
{
	int id;
	String name;
	String city;
	
	public Student(int id, String name, String city) {
		this.id=id;
		this.name=name;
		this.city=city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
}

public class StudentManagement {

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
			System.out.println("1.Add Student 2.Find Student 3.Update Student 4.Delete Student 5.FindAll 6.Exit");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter Student id, Student Name and Student City");
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
				for(Student s:list) {
					if(s.id==id)
					{
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
				System.out.println("Enter the student id to update");
                id = sc.nextInt();
                flag = false;
                int index = 0;
                for (Student s : list) {
                    if (s.id == id) {
                        System.out.println("Enter Student name and city");
                        Student s1 = new Student(id, sc.next(), sc.next());
                        list.set(index, s1);
                        System.out.println("Student details updated successfully");
                        flag = true;
                        break;
                    }
                    index++;
                    if (flag == false)
                        System.out.println("Record not found");
                }
				break;
				
			case 4:
				System.out.println("Enter Student id to delete");
				id=sc.nextInt();
				int index1=0;
				flag=false;
				for(Student s:list) {
					if(s.id==id)
					{
						list.remove(index1);
						flag=true;
						break;
					}
					index1++;
				}
				if(flag=false)
				{
					System.out.println("Record Not Found");
				}
				break;
			
			case 5:
				System.out.println("Students Data");
				for(Student i:list) {
					System.out.println(i +" ");
				}
				break;
			case 6:
				System.out.println("Exited Successfully");
				System.exit(0);
				
			}
			System.out.println("Do you wish to continue (yes/no)");
			msg=sc.next();
		} 
		while(msg.equals("yes"));
		

	}
	

}
