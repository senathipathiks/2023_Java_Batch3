package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

import com.sms.Util.DBuUtil;

import com.sms.bean.Students;

public class StudentDAO {
public int insertStudent(Students stud) {
	int n=0;
	try {
		Connection con=DBuUtil.getDBConnection();
		String sql="insert into sms_tbl values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, stud.getId());
		ps.setString(2, stud.getName());
		ps.setString(3, stud.getCity());
		n=ps.executeUpdate();
	}
	catch(Exception e) {
		System.out.println(e);
	}
	return n ;
}
//delete value
public int deleteStudent(int id) {
	int n=0;
	try {
		Connection con=DBuUtil.getDBConnection();
		String sql="delete from sms_tbl where id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, id());
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
public int updateStudent(Students stud) {
	int n=0;
	try {
		Connection con=DBuUtil.getDBConnection();
		String sql="update sms_tbl set name=?, city=? where id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, stud.getName());
		ps.setString(2, stud.getCity());
		ps.setInt(3, stud.getId());
		n=ps.executeUpdate();
	}
	catch(Exception e) {
		System.out.println(e);
	}
	return n;
}
//find value
public Students findStudent(int id) {
	Students stud=new Students();
	ResultSet rs;

	try {
		Connection con=DBuUtil.getDBConnection();
		String sql="select * from sms_tbl where id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, id);
		rs=ps.executeQuery();
		if(rs.next()) {
		stud.setId(rs.getInt(1));
		stud.setName(rs.getString(2));
		stud.setCity(rs.getString(3));
	}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	return stud;
}
//find all
public LinkedList<Students> findAllStudent() {
	ResultSet rs;
LinkedList<Students> list=new LinkedList<Students>();
	try {
		Connection con=DBuUtil.getDBConnection();
		String sql="select * from sms_tbl ";
		PreparedStatement ps=con.prepareStatement(sql);
		
		rs=ps.executeQuery();
		while(rs.next()) {
		Students stud=new Students();
		stud.setId(rs.getInt(1));
		stud.setName(rs.getString(2));
		stud.setCity(rs.getString(3));
		list.add(stud);
	}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	return list;
}
}













