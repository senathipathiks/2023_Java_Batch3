package com.Day10;
import java.util.*;
class Student{
	int id;
	String name;
	String city;
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
}
public class CollectionsDemo {
	public static void main(String[] args) {
		int id=0;
		String name=" ";
		String city=" ";
		int choice;
		boolean flag = false,b=true;
		Scanner sc = new Scanner(System.in);
		LinkedList<Student> list=new LinkedList<Student>();
        String msg=" ";
        do {
        	System.out.println("1. Add Student 2. Find Student 3. Upadate Student 4. Delete Student 5. View All 6. Exist");
        	choice=sc.nextInt();
        	switch(choice) {
        	case 1:
        		System.err.println("Enter Student ID, Student Name, Student City");
        		id=sc.nextInt();
        		name=sc.next();
        		sc.nextLine();
        		city=sc.nextLine();
        		Student st1 = new Student(id,name,city);
        		list.add(st1);
        		System.out.println("Student Details Inserted Succussfully");
        		break;
        	case 2:
        		System.out.println("Enter Student ID to Find");
        		id=sc.nextInt();
        		flag = false;
        		for(Student s:list) {
        			if(s.id==id) {
        				System.out.println(s.toString());
        				flag=true;
        				break;
        			}
        		}
        		if(flag==false) {
        			System.out.println("Record NOT Found");
        		}
        		break;
        	case 3:
        		System.out.println("Enter Student ID to Update");
        		int id1 = sc.nextInt();
        		for (int i = 0; i < list.size(); i++) {
        		    if (list.get(i).id == id1) {
        		        System.out.println("Enter the updating details");
        		        Student st2 = new Student(sc.nextInt(), sc.next(), sc.next());
        		        list.set(i, st2);
        		        flag = true;
        		        System.out.println("Succussfully Updated");
        		        break;
        		    }
        		}
        		if (flag == false) {
        		    System.out.println("Record NOT Found");
        		}
                 break;
        	case 4:
        		System.out.println("Enter Student ID to Delete");
        		id1=sc.nextInt();
        		int index1=0;
        		flag = false;
        		for(Student s:list) {
        			if(s.id==id1) {
        				list.remove(index1);
        				flag=true;
        				System.out.println("Succussfully Deleted");
        				break;
        			}index1++;
        		}
        		if(flag==false) {
        			System.out.println("Record NOT Found");
        		}
        		break;
        	case 5:
        		for(Student l:list) {
        			System.out.println(l);
        		}
        		break;
        	case 6:
        		b=false;
        		System.exit(0);break;
        		}
        }while(b);
	}

}
