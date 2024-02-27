package com.mon.jpa.sample7;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.mon.jpa.sample7.Course;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManager emf = Persistence.createEntityManagerFactory("CourseDB").createEntityManager();
    	emf.getTransaction().begin();
    	Course c1 = new Course(102,"Java","CSE");
    	emf.persist(c1);
    	emf.getTransaction().commit();
    	emf.close();
    }
}
