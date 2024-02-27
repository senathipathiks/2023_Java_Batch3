package com.hibernate.day4.JPAproj1;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       EntityManager emf=Persistence.createEntityManagerFactory("CourseDB").createEntityManager();
       emf.getTransaction().begin();
       Course c1=new Course(103,"C++","CSE");
       emf.persist(c1);
       emf.getTransaction().commit();
       emf.close();
    }
}
