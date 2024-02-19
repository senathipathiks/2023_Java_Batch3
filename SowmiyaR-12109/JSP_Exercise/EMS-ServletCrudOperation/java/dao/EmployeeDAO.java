package com.Ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

import com.Ems.bean.Employee;
import com.Ems.util.DBUtill;
public class EmployeeDAO {
          public int insertEmployee(Employee Emp)
	{
		int n=0;
		try {
			Connection con=DBUtill.getDBConnection();
			String sql="insert into Employee values(?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,Emp.getId() );
			ps.setString(2,Emp.getName());
			ps.setString(3,Emp.getCity());
			ps.setInt(4, Emp.getDeptid());
			ps.setString(5, Emp.getDeptname());
			ps.setString(6, Emp.getPhno());
			n=ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return n;
	}
//          ---------------------------------------------------
          public int deleteEmployee(int id)
      	{
      		int n=0;
      		try {
      			Connection con=DBUtill.getDBConnection();
      			String sql="delete from Employee where id=?";
      			PreparedStatement ps=con.prepareStatement(sql);
      			ps.setInt(1, id);
      			n=ps.executeUpdate();
      		}
      		catch(Exception e)
      		{
      			System.out.println(e);
      		}
      		return n;
      	}
//          -----------------------------------------------
          public int UpdateEmployee(Employee Emp1)
      	{
      		int n=0;
      		try {
      			Connection con=DBUtill.getDBConnection();
      			String sql="update Employee  set name=?,city=?,deptid=?,deptname=?,phno=? where id=?";
      			PreparedStatement ps=con.prepareStatement(sql);
      			ps.setString(1, Emp1.getName());
      			ps.setString(2, Emp1.getCity());
      			ps.setInt(3, Emp1.getDeptid());
      			ps.setString(4, Emp1.getDeptname());
      			ps.setString(5, Emp1.getPhno());
      			ps.setInt(6, Emp1.getId());
      			n=ps.executeUpdate();
      		}
      		catch(Exception e)
      		{
      			System.out.println(e);
      		}
      		System.out.println(n);
      		return n;
      	}
//          ---------------------------------------------
          public Employee FindEmployee(int id)
      	{
//      		Student stud=new Student();
      		Employee Emp=null;
      		ResultSet rs;
      		try {
      			Connection con=DBUtill.getDBConnection();
      		    String sql="Select * from Employee where id=?";
      		    PreparedStatement ps=con.prepareStatement(sql);
      		    ps.setInt(1, id);
      		    rs=ps.executeQuery();
      		    if(rs.next()) {
      		    	Emp=new Employee();
      		    	Emp.setId(rs.getInt(1));
      		    	Emp.setName(rs.getString(2));
      		    	Emp.setCity(rs.getString(3));
      		    	Emp.setDeptid(rs.getInt(4));
      		    	Emp.setDeptname(rs.getString(5));
      		    	Emp.setPhno(rs.getString(6));
      		    }}
      		    catch(Exception e)
      		{
      			System.out.println(e);
      		}
      	return Emp;
      	}
//          ------------------------------------
          public LinkedList<Employee> FindallEmployee()
      	{
      		 ResultSet rs;
      		 LinkedList<Employee> list=new LinkedList<Employee>();
      		try {
      			Connection con=DBUtill.getDBConnection();
      			 String sql="Select * from Employee";
      			 PreparedStatement ps=con.prepareStatement(sql);
      			 rs=ps.executeQuery();
      			 
      			 while(rs.next())
      			 {
      				 Employee Emp=new Employee();
      				 Emp.setId(rs.getInt(1));
      				 Emp.setName(rs.getString(2));
      				 Emp.setCity(rs.getString(3));
      				 Emp.setDeptid(rs.getInt(4));
      				 Emp.setDeptname(rs.getString(5));
      				 Emp.setPhno(rs.getString(6));
      				 list.add(Emp);
      			 }
      		}catch(Exception e)
      		{
      			System.out.println(e);
      		}
      		return list;
      	}

	}


