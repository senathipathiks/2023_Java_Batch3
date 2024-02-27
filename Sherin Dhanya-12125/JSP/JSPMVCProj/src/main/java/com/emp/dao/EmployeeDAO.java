package com.emp.dao;
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.LinkedList;

	import com.emp.Util.DBUtil;
	import com.emp.bean.Employee;
	public class EmployeeDAO {
	public int insertEmployee(Employee emp) {
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="insert into emp_tbl values(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getName());
			ps.setString(3, emp.getCity());
			ps.setInt(4, emp.getPhoneno());
			ps.setString(5,emp.getDepartment());
			n=ps.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return n ;
	}
	//delete value
	public int deleteCourse(int id) {
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="delete from course_tbl where id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			n=ps.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
	private int id() {
		// TODO Auto-generated method stub
		return 0;
	}
	//update value
	public int updateCourse(Course cor) {
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="update course_tbl set CourseName=?, CourseType=?, CourseDuration=?, CourseFee=? where CourseID=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, cor.getName());
			ps.setString(2, cor.getCity());
			ps.setInt(3, cor.getPhoneno());
			ps.setString(4, cor.getDepartment());
			ps.setInt(5, cor.getId());
			n=ps.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
	//find value
	public Employee findEmployee(int id) {
//		Employee emp=new Employee();
		Employee emp=null;
		ResultSet rs;

		try {
			Connection con=DBUtil.getDBConnection();
			String sql="select * from emp_tbl where id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			rs=ps.executeQuery();
			if(rs.next()) {
		    emp=new Employee();
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setCity(rs.getString(3));
			emp.setPhoneno(rs.getInt(4));
			emp.setDepartment(rs.getString(5));
			
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return emp;
	}
	//find all
	public LinkedList<Employee> findAllEmployee() {
		ResultSet rs;
	LinkedList<Employee> list=new LinkedList<Employee>();
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="select * from emp_tbl ";
			PreparedStatement ps=con.prepareStatement(sql);
			
			rs=ps.executeQuery();
			while(rs.next()) {
			Employee emp=new Employee();
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setCity(rs.getString(3));
			emp.setPhoneno(rs.getInt(4));
			emp.setDepartment(rs.getString(5));
			list.add(emp);
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return list;
	}
	}
	










