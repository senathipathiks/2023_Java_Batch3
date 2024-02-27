package com.Student.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Student.bean.Student;
import com.Student.util.StudentUtil;

public class StudentDao {
public int insertStudent(Student stud) {
	int n=0;
	try {
		Session session=StudentUtil.opensession();
		Transaction t=session.beginTransaction();
		n=(Integer)session.save(stud);
		t.commit();
	} catch (Exception e) {
		System.out.println(e);
	}
	return n;
}
public int updateStudent( Student ) {
	int n=0;
	try {
		
	} catch (Exception e) {
		// TODO: handle exception
	}
}

}
