package com.ms.dao;

import java.sql.*;


import com.ms.bean.PayrollClass;
import com.ms.util.PayrollUtil;



public class PayrollDAO {

		public int insertPayrollClass(PayrollClass pay)
		{
			int n=0;
			try {
				Connection con=PayrollUtil.getDBConnection();
				String sql="insert into payroll values(?,?,?,?,?,?,?,?)";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, pay.getPid());
				ps.setString(2, pay.getEname());
				ps.setInt(3, pay.getEid());
				ps.setFloat(4, pay.getBasic());
				ps.setInt(5, pay.getHra());
				ps.setInt(6, pay.getDa());
				ps.setInt(7, pay.getTa());
				ps.setFloat(8, pay.getCtc());
				n=ps.executeUpdate();
					
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	   return n;
		}

		public int deletePayrollt(int pid)
		{
			int n=0;
			try {
				Connection con=PayrollUtil.getDBConnection();
				String sql="delete from payroll where pid=?";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, pid);
				n=ps.executeUpdate();
					
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	   return n;
	}
		public int updatePayrollClass(PayrollClass pay)
		{
			int n=0;
			try {
				Connection con=PayrollUtil.getDBConnection();
				String sql="update payroll set ename=?,eid=?,basic=?,hra=?,da=?,ta=?,ctc=? where pid=?";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, pay.getPid());
				ps.setString(2, pay.getEname());
				ps.setInt(3, pay.getEid());
				ps.setFloat(4, pay.getBasic());
				ps.setInt(5, pay.getHra());
				ps.setInt(6, pay.getDa());
				ps.setInt(7, pay.getTa());
				ps.setFloat(8, pay.getCtc());
				n=ps.executeUpdate();
					
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	   return n;
	}
		 
		 public ResultSet findPayroll(int pid) throws SQLException
		 {
			 Connection con = PayrollUtil.getDBConnection();
			 String sql = "select * from payroll where pid = ?";
			 PreparedStatement ps=con.prepareStatement(sql);
			 ps.setInt(1, pid);
			 
			 ResultSet rs = ps.executeQuery();
			 return rs;
			 
			 
		 }
		
		
}
