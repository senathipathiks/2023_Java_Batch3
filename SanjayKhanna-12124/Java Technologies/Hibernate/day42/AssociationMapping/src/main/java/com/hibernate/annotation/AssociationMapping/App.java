package com.hibernate.annotation.AssociationMapping;

import java.util.ArrayList;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import com.sample.bean.Author;
//import com.sample.bean.Book;
import com.sample.bean.Customer;
import com.sample.bean.Product;


//import com.sample.bean.Department;
//import com.sample.bean.Student;


public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction trans = session.getTransaction();
        
//        trans.begin();
//        Laptop l = new Laptop(1, "Dell");
//        session.persist(l);
//        Employee emp = new Employee(1, "Sanjay",l);   
//        session.persist(emp);
//        trans.commit();
        
//        Department d1 = new Department(1, "CSE");
//        Department d2 = new Department(2, "IT");
//        Student s1 = new Student(1, "Sanjay", d1);
//        Student s2 = new Student(2, "Sam", d1);
//        Student s3 = new Student(3, "Praveen", d2);
//        
//        trans.begin();
//        session.persist(s1);
//        session.persist(s2);
//        session.persist(s3);
//        trans.commit();
        
//        Book b1 = new Book(1, "Harry Potter part 1");
//        Book b2 = new Book(2,"Harray Potter part 2");
//        Book b3 = new Book(3,"Ponniyan Selvan");
//        List<Book> list = new ArrayList<Book>();
//        list.add(b1);
//        list.add(b2);
//        List<Book> l2 = new ArrayList<Book>();
//        l2.add(b3);
//        Author a1 = new Author(1, "Kalki", l2);
//        Author a2 = new Author(2, "J.K Rowling", list);
//        trans.begin();
//        session.persist(a1);
//        session.persist(a2);
//        trans.commit();
//        session.close();
        
        Product p1 = new Product(1, "Smart Phone");
        Product p2 = new Product(2, "Laptop");
        Product p3 = new Product(3, "Television");
        Product p4 = new Product(4, "Air Conditioner");
        
        List<Product> l1 = new ArrayList<Product>();
        l1.add(p1);
        l1.add(p2);
        l1.add(p3);
        
        List<Product> l2 = new ArrayList<Product>();
        l2.addAll(l2);
        l2.add(p4);
        
        Customer c1 = new Customer(1, "SanjayKhanna", l2);
        Customer c2 = new Customer(3, "Dharshsun", l1);
        Customer c3 = new Customer(2, "Vignesh", l1);
        
        trans.begin();
        session.persist(c1);
        session.persist(c2);
        session.persist(c3);
        trans.commit();
        session.close();
    }
}
