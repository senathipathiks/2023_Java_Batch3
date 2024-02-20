package com.pay.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.pay.bean.Payroll;
import com.pay.util.DButil;

public class Paydao {
	int n=0;
	private List<Payroll> list ;
	private Connection con = DButil.getDBConnection();
	
	
public int insert(Payroll pay) {
		
		try {
			String q = "insert into payroll.payroll_tbl values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, pay.getPayRollID());
			ps.setString(2, pay.getEmployeeName());
			ps.setInt(3, pay.getEmpId());
			ps.setFloat(4, pay.getBasic());
			ps.setInt(5, pay.getHra());
			ps.setInt(6, pay.getDa());
			ps.setInt(7, pay.getTa());
			ps.setFloat(8, pay.getCtc());
			
			n=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
public int delete(int id) {
	
	try {
		String q = "delete from payroll.payroll_tbl where Payrollid = ?";
		PreparedStatement ps = con.prepareStatement(q);
		ps.setInt(1, id);
		n=ps.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return n;
}
public int deleteAll() {
	
	try {
		String q = "TRUNCATE `payroll`.`payroll_tbl`;";
		PreparedStatement ps = con.prepareStatement(q);
		
		n=ps.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return n;
}
public int update(Payroll pay) {
	
	try {
		String q="UPDATE payroll.payroll_tbl SET employeename = ?, empID = ?, basic = ?, hra = ?, da = ?, ta = ?, ctc = ? WHERE Payrollid = ?";
				
		
		PreparedStatement ps = con.prepareStatement(q);
		
		ps.setString(1, pay.getEmployeeName());
		ps.setInt(2, pay.getEmpId());
		ps.setFloat(3, pay.getBasic());
		ps.setInt(4, pay.getHra());
		ps.setInt(5, pay.getDa());
		ps.setInt(6, pay.getTa());
		ps.setFloat(7, pay.getCtc());
		ps.setInt(8, pay.getPayRollID());
		n=ps.executeUpdate();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return n;
}
public Payroll search(int id) {
	ResultSet rs;
	
	try {
		String q = "select * from payroll.payroll_tbl where Payrollid = ?";
		PreparedStatement ps = con.prepareStatement(q);
		ps.setInt(1, id);
		rs = ps.executeQuery();
		if(rs.next())
			return new Payroll(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getFloat(8));
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return null;
}
public List<Payroll> viewAll(){
	ResultSet rs;
	
	try {
		list = new ArrayList<Payroll>();
		String q = "select * from payroll.payroll_tbl";
		PreparedStatement ps = con.prepareStatement(q);
		rs=ps.executeQuery();
		while(rs.next())
			list.add(new Payroll(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getFloat(8)));
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return list;
}

}

