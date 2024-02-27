//package com.day4.controller;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//import com.day4.bean.Employee;
//import com.day4.bean.Laptop;
//
///**
// * Hello world!
// *
// */
//public class App 
//{
//    public static void main( String[] args )
//    {
//        Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Laptop.class);
//        
//        SessionFactory factory = con.buildSessionFactory();
//        
//        Session session = factory.openSession();
//        
//        Transaction t = session.getTransaction();
//        
//        Laptop l = new Laptop();
//        l.setLname("dell");
//        l.setProcessor("intel i7");
//        l.setStorage("512gb");
//        
//        Employee e = new Employee();
//        e.setName("prem Kumar");
//        e.setDept("development");
//        e.setLaptop(l);
//        
//        t.begin();
//        session.persist(e);
//        t.commit();
//    }
//}
