package com.hb.Dao;



import java.sql.Connection;
import java.sql.PreparedStatement;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hb.bean.Student;
import com.hb.util.DBUtil;

public class StudentDao {

	public int insertStudent(Student stud)
	{
	int n=0;
	try {
	Session session=DBUtil.opensession();
	Transaction t=session.beginTransaction();
	n=(Integer)session.save(stud);
	t.commit();
	}
   catch(Exception e)
   {
	 System.out.println(e);  
   }
   return n;
}



	
	 
}
