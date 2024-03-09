package com.practice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.practice.bean.Employee;
import com.practice.util.EmployeeUtil;

public class EmployeeDAO {

	public int insertEmp(Employee emp) {
		int n=0;
		
		try {
			Connection con=EmployeeUtil.getDBConnection();
			String query="insert into tbl_employee values(?,?,?)";
			PreparedStatement prs=con.prepareStatement(query);
			
			prs.setInt(1, emp.geteId());
			prs.setString(2, emp.geteName());
			prs.setString(3, emp.geteDesig());
			n=prs.executeUpdate();
			prs.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return n;
	}
	
	public int deleteEmp(int id) {
		int n=0;
		
		try {
			Connection con=EmployeeUtil.getDBConnection();
			String query="DELETE FROM `tbl_employee` WHERE (eId = ?) ";
			PreparedStatement prs=con.prepareStatement(query);
			
			prs.setInt(1,id);
			n=prs.executeUpdate();
			prs.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public List<Integer> getId(){
		
		List<Integer> idlist=new ArrayList();
		try {
		Connection con=EmployeeUtil.getDBConnection();
		String query="select eId from tbl_employee";
		PreparedStatement prs=con.prepareStatement(query);
		ResultSet rs=prs.executeQuery();
		while(rs.next()) {
			idlist.add(rs.getInt("eId"));
		}
		prs.close();
		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return idlist;
		
		
	}
	
	public Employee getEmp(int eid) throws SQLException {
		Employee emp=null;
		try {
		Connection con=EmployeeUtil.getDBConnection();
		String query="select * from tbl_employee where eId=?";
		PreparedStatement prs=con.prepareStatement(query);
		
		prs.setInt(1, eid);;
		ResultSet rs=prs.executeQuery();
		
		if(rs.next()) {
			emp=new Employee(rs.getInt("eId"),rs.getString("eName"), rs.getString("eDesig"));
		}
		
		}catch (Exception e){
			e.printStackTrace();
		}
		return emp;
	}
	
	public int updateEmp(Employee emp) {
		int n=0;
		try {
			Connection con=EmployeeUtil.getDBConnection();
			
			String query="UPDATE `tbl_employee` SET `eName` = ?, `eDesig` = ? WHERE (`eId` = ?)";
					
			PreparedStatement prs=con.prepareStatement(query);
			
			prs.setString(1, emp.geteName());
			prs.setString(2, emp.geteDesig());
			prs.setInt(3, emp.geteId());
			n=prs.executeUpdate();
			prs.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();	
			}
		return n;
		
	}
	
//	public Employee searchEmp(int eid) {
//		int n=0;
//		Employee emp=null;
//		try {
//			Connection con=EmployeeUtil.getDBConnection();
//			String query="select * from tbl_employee where eId=?";
//			PreparedStatement prs=con.prepareStatement(query);
//			prs.setInt(1, eid);
//			ResultSet rs=prs.executeQuery();
//			if(rs.next()) {
//				emp=new Employee(rs.getInt("eId"),rs.getString("eName"), rs.getString("eDesig"));
//			}
//			prs.close();
//			con.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return emp;
//		
//	}
	
	public List<Employee> findallEmp() {
		 List<Employee> list=new LinkedList<Employee>();
		
		try {
Connection con=EmployeeUtil.getDBConnection();
			
			String query="select * from tbl_employee";
					
			PreparedStatement prs=con.prepareStatement(query);
			
			ResultSet rs=prs.executeQuery();
			
			while(rs.next()) {
				Employee emp=new Employee();
				emp.seteId(rs.getInt(1));
				emp.seteName(rs.getString(2));
				emp.seteDesig(rs.getString(3));
				list.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
