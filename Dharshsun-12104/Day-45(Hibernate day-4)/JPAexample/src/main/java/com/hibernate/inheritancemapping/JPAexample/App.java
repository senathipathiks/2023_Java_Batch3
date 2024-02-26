package com.hibernate.inheritancemapping.JPAexample;

import javax.persistence.*;
public class App 
{
    public static void main( String[] args )
    {
        EntityManager emf = Persistence.createEntityManagerFactory("CourseDB").createEntityManager();
        emf.getTransaction().begin();
        Course c1=new Course(103,"C++","CSE");
        emf.persist(c1);
        emf.getTransaction().commit();
        emf.close();
    }
}
