package com.sts.day1;

import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.hibernate.Query;


public class App 
{
    public static void main( String[] args )
    {
        EntityManager emf=Persistence.createEntityManagerFactory("CourseDB").createEntityManager();
        emf.getTransaction().begin();
        
//        for (int i = 1; i <= 50; i++) {
//        	Course c1=new Course();
//        	c1.setCourseId(i);
//        	c1.setCourseName("Course "+i);
//        	c1.setDept("Department "+i);
//        	emf.persist(c1);
//		}
        
        emf.getTransaction().commit();
        emf.close();
    }
}
