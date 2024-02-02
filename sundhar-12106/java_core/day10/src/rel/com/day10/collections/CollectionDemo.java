package rel.com.day10.collections;

import java.util.LinkedList;
import java.util.Scanner;

class Student {
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

public class CollectionDemo {

	public static void main(String[] args) {

		boolean b = true,flag =false;
		Scanner sc = new Scanner(System.in);

		LinkedList<Student> ls = new LinkedList<Student>();

		do {
			System.out.println("Student management");
			System.out.println("1. add  2. find  3. update 4.delete  5.deleteAll 6.fetchAll 7.Exit");
			int inp = sc.nextInt();

			switch (inp) {
			case 1: {
				System.out.println("Enter id name city");
				ls.add(new Student(sc.nextInt(), sc.next(), sc.next()));
				System.out.println("record added successfully");
				break;
			}
			case 2: {
				System.out.println("enter id of the student");
				int usId = sc.nextInt();
				for (Student s : ls) {
//					System.out.println(s.id);
					if(s.id == usId) {
						System.out.println(s);
						flag = true;
						break;
					}
				}
				if(flag == false)
					System.out.println("Record not found");
				break;
			}
			case 3: {
				System.out.println("enter id of the student");
				int usId = sc.nextInt();
				int index = 0;
				for (Student s : ls) {
					if(s.id == usId) {
						System.out.println("enter student name city");
						Student s1 = new Student(s.id, sc.next(), sc.next());
						System.out.println(index);
						ls.set(index, s1);
						flag = true;
						System.out.println("Updated successfully...!");
						break;
					}
					index ++;
				}
				if(flag == false)
					System.out.println("Record not found");
				break;
			}
			case 4: {
				System.out.println("enter id of the student");
				int usId = sc.nextInt();
				int index = 0;
				for (Student s : ls) {
					if(s.id == usId) {
						ls.remove(index);
						flag = true;
						System.out.println("data removed successfully...!");
						break;
					}
					index ++;
				}
				if(flag == false)
					System.out.println("Record not found");
				break;
			}
			case 5: {
				ls.clear();
				System.out.println("All the records deleted successfully...!");
				break;
			}
			case 6: {
				for (Student s : ls) {
					System.out.println(s);
				}
				break;
			}
			case 7: {
				b = false;
				System.out.println("\t\t\tThank You");
				break;
			}

			default:
				System.out.println("enter valid input");
				break;
			}
		} while (b);
	}

}
