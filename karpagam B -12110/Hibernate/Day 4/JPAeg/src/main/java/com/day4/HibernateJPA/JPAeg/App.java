package com.day4.HibernateJPA.JPAeg;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;


public class App 
{
    public static void main( String[] args )
    {
    	EntityManager emf=Persistence.createEntityManagerFactory("CourseDB").createEntityManager();
    	emf.getTransaction().begin();
    	Course c1=new Course(103,"JSP","Cse");
    	emf.persist(c1);
    	emf.getTransaction().commit();
    	emf.close();
    }
}
