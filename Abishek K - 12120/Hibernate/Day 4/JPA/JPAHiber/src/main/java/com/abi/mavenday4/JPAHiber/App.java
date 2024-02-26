package com.abi.mavenday4.JPAHiber;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
        EntityManager m = emf.createEntityManager();
        EntityTransaction t = m.getTransaction();
        
        Course c1 = new Course(101, "JAVA", "IT");
       t.begin();
       m.persist(c1);
       t.commit();
    }
}
