package ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

import ems.bean.Employee;
import ems.util.DButil;



public class Employeedao {

	public int insertEmployee(Employee emp)
	{
		int n = 0;
		try
		{
			Connection con = DButil.getDBConnection();
			String query = "insert into details values(?,?,?,?)";
			PreparedStatement p = con.prepareStatement(query);
			p.setInt(1, emp.getEid());
			p.setString(2, emp.getName());
			p.setString(3, emp.getRole());
			p.setString(4, emp.getCity());
			n=p.executeUpdate();
			
		}
		catch (Exception e) {
			System.out.println("Duplicate Entry Found. Try Another Number");
		}
		return n;
	}
	
	public int deleteEmployee(int empd)
	{
		int n = 0;
		try
		{
			Connection con = DButil.getDBConnection();
			String query = "delete from details where eid = ?";
			PreparedStatement p = con.prepareStatement(query);
			p.setInt(1, empd);
			n = p.executeUpdate();
			}
		catch (Exception e) {
			System.out.println(e);
		}
		return n;
}
	public int updateEmployee(Employee empd)
	{
		int n = 0;
		try
		{

			Connection con = DButil.getDBConnection();
			String query = "Update details set name = ?, role = ?, city = ? where id = ?";
			PreparedStatement p = con.prepareStatement(query);
			p.setInt(4, empd.getEid());
			p.setString(1, empd.getName());
			p.setString(2, empd.getRole());
			p.setString(3, empd.getCity());
			n=p.executeUpdate();
			}
		catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}
	
	public Employee findEmployee(int eid)
	{
		Employee emp = new Employee();
		ResultSet rs;
		try
		{
			Connection con = DButil.getDBConnection();
			String findquery = "select * from details where eid=?";
			PreparedStatement p = con.prepareStatement(findquery);
			p.setInt(1, eid);
			rs = p.executeQuery();
			if(rs.next()) {
				
				emp.setEid(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setRole(rs.getString(3));
				emp.setCity(rs.getString(4));
			}
		}
			
			
		catch (Exception e) {
			System.out.println(e);
		}
		return emp;
}
	public LinkedList<Employee> findallEmployee() {
		
		//Student stud = null;
		
		LinkedList<Employee> list = new LinkedList<Employee>();
		try
		{
			Connection con = DButil.getDBConnection();
			String allquery = "select * from employee";
			PreparedStatement p = con.prepareStatement(allquery);
			
			
			ResultSet rs = p.executeQuery();
			
			while(rs.next()) {
				Employee emp  = new Employee();
				emp.setEid(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setRole(rs.getString(3));
				emp.setCity(rs.getString(4));
				
				list.add(emp);
			}
			}
		catch (Exception e) {
			System.out.println(e);
		}
		
		return list;
	}
	

}
