package com.day2.controller;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.day2.bean.Student;

/**
 * Hello world!
 *
 */
public class App {
	static Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
	static SessionFactory factory = con.buildSessionFactory();
	static Session session = factory.openSession();
	static Transaction t = session.getTransaction();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("\t\t\tWelcome to School Management System");
		boolean b = true;

		do {
			System.out.println("1.Insert\n2.update\n3.delete\n4.fetch all\n5.find\n6.exit");
			switch (sc.nextInt()) {
			case 1:
				Student s = new Student();
				sc.nextLine();
				System.out.println("enter student name");
				s.setName(sc.nextLine());
				System.out.println("eneter the student gender");
				s.setGender(sc.next());
				sc.nextLine();
				System.out.println("enter the student dept");
				s.setDept(sc.nextLine());
				System.out.println("enter the student subject");
				s.setSubject(sc.nextLine());
				insert(s);
				break;
			case 2:
				update();
				break;
			case 3:
				delete();
				break;
			case 4:
				fetchAll();
				break;
			case 5:
				System.out.println(find());
				break;
			case 6:
				System.out.println("*********Thank You********");
				b = false;
				break;

			default:
				System.err.println("enter the correct input");
				break;
			}
		} while (b);

	}
	
	public static void insert(Student s) {
		t.begin();
		session.persist(s);
		t.commit();
		System.out.println("\tdata inserted successfully...!");
	}
	
	public static void update() {
		System.out.println("enter student id");
		Student s = session.find(Student.class, sc.nextInt());
		t.begin();
		if(s != null) {
			sc.nextLine();
			System.out.println("enter the correct dept");
			s.setDept(sc.nextLine());
			session.merge(s);
			t.commit();
		}else
			System.err.println("\tRecord not found...!");
	}
	public static void delete() {
		System.out.println("enter student id");
		Student s = session.find(Student.class, sc.nextInt());
		t.begin();
		if(s != null) {
			session.remove(s);
			t.commit();
		}else
			System.err.println("\tRecord not found...!");
	}
	
	public static Student find() {
		System.out.println("enter student id ");
		t.begin();
		Student s = session.find(Student.class, sc.nextInt());
		t.commit();
		return s;
		
	}
	public static void fetchAll() {
		List<Student> ls = session.createQuery("from Student").list();
		ls.forEach(s->System.out.println(s+"\n"));
	}
}
