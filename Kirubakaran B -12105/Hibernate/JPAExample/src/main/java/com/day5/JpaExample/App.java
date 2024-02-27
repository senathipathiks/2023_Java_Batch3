package com.day5.JpaExample;


import javax.persistence.*;

public class App 
{
    public static void main(String[] args )
    {
      EntityManager emf=Persistence.createEntityManagerFactory("CourseDB").createEntityManager();
      EntityTransaction tr= emf.getTransaction();
      tr.begin();
      Course c=new Course(109,"Java","BCA");
      emf.persist(c);
      tr.commit();
    }
}
