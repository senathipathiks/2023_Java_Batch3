package com.employeeapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.employeeapp.bean.Employee;
import com.employeeapp.util.DBUtility;

public class EmployeeDAO {
	
	static Connection con = DBUtility.getConnetion();
	
	public int insertEmployee(Employee employee) {
		int n = 0 ;
		try {
			PreparedStatement ps = con.prepareStatement("insert into tbl_employee values(?,?,?)");
			ps.setInt(1, employee.getEid());
			ps.setString(2, employee.getName());
			ps.setDouble(3, employee.getSalary());
			n = ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
		}
		return n;
		
	}
	
	public List<Integer> idList() {
		
		
		List<Integer> ls = new ArrayList<Integer>();
		try {
			PreparedStatement ps = con.prepareStatement("SELECT eid FROM ems_db.tbl_employee;");
			
			ResultSet rs =  ps.executeQuery();
			
			while(rs.next())
				ls.add(rs.getInt("eid"));
			
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		System.out.println(ls);
		return  ls;
		
	}
	
	public int updateEmployee(Employee employee) {
		int n = 0 ;
		try {
			PreparedStatement ps = con.prepareStatement("UPDATE `ems_db`.`tbl_employee` SET `name` = ?, `salary` = ? WHERE (`eid` = ?);");
			ps.setString(1, employee.getName());
			ps.setDouble(2, employee.getSalary());
			ps.setInt(3, employee.getEid());
			n = ps.executeUpdate();
			System.out.println(n);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	
	
	public int deleteEmployee(int id) {
		int n = 0 ;
		try {
			PreparedStatement ps = con.prepareStatement("delete from `ems_db`.`tbl_employee`  WHERE (`eid` = ?);");
			ps.setInt(1, id);
			n = ps.executeUpdate();
			System.out.println(n);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public Employee findEmployee(int id) {
	
		PreparedStatement ps;
		Employee employee = new Employee();
		try {
			ps = con.prepareStatement("select * from `ems_db`.`tbl_employee`  WHERE (`eid` = ?);");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				employee.setEid(rs.getInt("eid"));
				employee.setName(rs.getString("name"));
				employee.setSalary(rs.getDouble("salary"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("employee "+employee);
		return employee;
	}
	
	public List<Employee> fetchAll() {
		
		PreparedStatement ps;
		List<Employee> ls = new ArrayList<Employee>();
		Employee employee = null;
		try {
			ps = con.prepareStatement("select * from `ems_db`.`tbl_employee` ;");
			
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				employee = new Employee(rs.getInt("eid"), rs.getString("name"), rs.getDouble("salary"));
				ls.add(employee);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ls+"from dao");
		return ls;
	}
}
