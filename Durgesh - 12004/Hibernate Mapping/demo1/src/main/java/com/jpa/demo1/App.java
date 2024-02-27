package com.jpa.demo1;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	EntityManager em = Persistence.createEntityManagerFactory("StudentDB").createEntityManager();
    	em.getTransaction().begin();
    	Course c1 = new Course(1, "JAVA", "CS");
    	em.persist(c1);
    	em.getTransaction().commit();
    	em.close();
    }

}
