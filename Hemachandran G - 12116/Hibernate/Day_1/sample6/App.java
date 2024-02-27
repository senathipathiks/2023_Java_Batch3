package com.mon.jpa.sample6;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * 
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        

    	EntityManager emf = Persistence.createEntityManagerFactory("CourseDB").createEntityManager();
    	emf.getTransaction().begin();
    	Course c1 = new Course(101,"Java","CSE");
    	emf.persist(c1);
    	emf.getTransaction().commit();
    	emf.close();
    }
}
