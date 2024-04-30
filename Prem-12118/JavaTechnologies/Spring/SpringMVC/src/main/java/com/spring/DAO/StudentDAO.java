package com.spring.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.spring.bean.Student;
import com.spring.util.HibernateUtil;

public class StudentDAO {

    public int insertStudent(Student stud) {
        int n = 0;

        try {
            Session session = HibernateUtil.opensession();
            Transaction t = session.beginTransaction();
            n = (Integer) session.save(stud);
            t.commit();
        } catch (Exception e) {
            System.out.println(e);
            return n = 0;
        }
        return n;
    }
 

    public int deleteStudent(int studentId) {
        int n = 0;
        try {
            Session session = HibernateUtil.opensession();
            Transaction t = session.beginTransaction();
            Student student = session.get(Student.class, studentId);
            if (student != null) {
                session.delete(student);
                n = 1;
            }
            t.commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e);
            return n = 0;
        }
        return n;
    }

    public int updateStudent(Student stud) {
        int n = 0;
        try {
            Session session = HibernateUtil.opensession();
            Transaction t = session.beginTransaction();
            session.update(stud);
            t.commit();
            session.close();
            n = 1;
        } catch (Exception e) {
            System.out.println(e);
            return n = 0;
        }
        return n;
    }

    public Student getStudentById(int studentId) {
       
            Session session = HibernateUtil.opensession();
            Student s = session.get(Student.class, studentId);
            session.close();
            return s;
    }

    public List<Student> getAllStudents() {
        List<Student> studentList = null;
        try {
            Session session = HibernateUtil.opensession();
            Query<Student> query = session.createQuery("from Student");
            studentList = query.list();
            session.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return studentList;
    }
}
