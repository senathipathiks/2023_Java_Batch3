package com.hibernate.releationship.EmployeeManytoMany;

import org.hibernate.Session;

import com.hibernate.releationship.EmployeeManytoMany.Employee;
import com.hibernate.releationship.EmployeeManytoMany.Project;
import com.hibernate.util.HibernateUtil;

public class Test {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        // Create an employee
        Employee employee = new Employee();
        employee.setFirstName("Ramesh");
        employee.setLastName("Tilak");

       // Create project1
        Project project = new Project();
        project.setTitle("Employee Management System");

        // Create project2
        Project project1 = new Project();
       project1.setTitle("Content Management System");

       // employee can work on two projects, Add project references in the employee
       employee.getProjects().add(project);
       employee.getProjects().add(project1);

        // Add employee reference in the projects
       project.getEmployees().add(employee);
       project1.getEmployees().add(employee);

       session.persist(employee);

       session.getTransaction().commit();
       HibernateUtil.shutdown();
    }
}
