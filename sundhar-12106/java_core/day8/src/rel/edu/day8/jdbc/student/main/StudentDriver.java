package rel.edu.day8.jdbc.student.main;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import rel.edu.day8.jdbc.student.bean.Student;
import rel.edu.day8.jdbc.student.dao.StudentDAO;

public class StudentDriver {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {

		boolean b = true;

		System.out.println("\t\t\tWelcome to Student management System");

		do {
			switch (display()) {
			case 1: {
				Student s1 = insertStudent();
				int n = StudentDAO.insertStudent(s1);
				if (n == 1)
					System.out.println("data inserted successfully...!");
				else
					System.out.println("Technical or query error");
				break;
			}
			case 2: {
				int n = StudentDAO.deleteStudent(deleteStudent());
				if (n == 1)
					System.out.println("data deleted successfully...!");
				else
					System.out.println("Technical or query error");
				break;
			}
			case 3: {
				boolean res = StudentDAO.deleteAll();
				if(res)
					System.out.println("\t\tTechnical error");
				else
					System.out.println("All the records are deleted from the table");
				break;
			}
			case 4: {
				ResultSet rs = StudentDAO.fetchById(getByID());
				while (rs.next()) 
					System.out.println(
							"ID : " + rs.getInt(1) + "\nName : " + rs.getString(2) + "\nCity : " + rs.getString(3));
				
				break;
			}
			case 5: {
				ResultSet rs = StudentDAO.fetchAll();
				while (rs.next()) {
					System.out.println(
							"ID : " + rs.getInt(1) + "\nName : " + rs.getString(2) + "\nCity : " + rs.getString(3));
					System.out.println("---------------------------");
				}
				break;
			}
			case 6: {
				int n = StudentDAO.updateStudent(updateStudnet());
				if (n == 1)
					System.out.println("data updated successfully...!");
				else
					System.out.println("Technical or query error");
				break;
			}
			case 7: {
				b = false;
				break;
			}

			default:
				System.err.println("\t\tInvalid Input");
				break;
			}
		} while (b);

	}

	public static int display() {
		System.out.println("\t\t\tSelect the Options");
		System.out.println("1.Insert\n2.delete by Id \n3.delete All\n4.fetch By ID\n5.fetch All\n6.update\n7.exit");
		return sc.nextInt();
	}

	public static Student insertStudent() {
		System.out.println("Enter Student id, Student name, Student city");
		int id = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		String city = sc.nextLine();
		return new Student(id, name, city);
	}

	public static int deleteStudent() {
		System.out.println("Enter the student ID");
		return sc.nextInt();
	}

	public static Student updateStudnet() {
		System.out.println("Enter Student id, Student name, Student city");
		int id = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		String city = sc.nextLine();
		return new Student(id, name, city);
	}
	
	public static int getByID() {
		System.out.println("enter the id of the student");
		return sc.nextInt();
	}

}
