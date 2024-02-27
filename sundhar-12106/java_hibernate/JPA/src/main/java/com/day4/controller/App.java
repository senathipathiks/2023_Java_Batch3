package com.day4.controller;

import com.day4.bean.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
       EntityManager manager = factory.createEntityManager();
       EntityTransaction transaction = manager.getTransaction();
       
       Course c = new Course();
       c.setCname("JavaScript");
       
       transaction.begin();
       manager.persist(c);
       transaction.commit();
    }
}
