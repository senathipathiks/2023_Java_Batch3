package com.mms.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

import com.mms.bean.*;
import com.mms.util.*;
public class MmsDao {
	


	

	
			// TODO Auto-generated method stub
			
				public int insertstd(Mms std)
				{
					int n=0;
					try 
					{
						Connection con=MmsUtil.getDBConnection();
						String sql="insert into details values(?,?,?)";
						PreparedStatement ps=con.prepareStatement(sql);
						ps.setString(1,std.getMovieName());
						ps.setInt(2, std.getScreenNo());
						ps.setInt(3, std.getTicketId());
						n=ps.executeUpdate();			
					}
					catch (Exception e)
					{
						System.out.println(e);
					}
					
					return n;
				}
				

				
				public int updateStudent(Mms id) {
					int n=0;
					try {
						Connection con=MmsUtil.getDBConnection();
						String sql="update details set movieName=?,screenNo=? where ticketId=?";
						PreparedStatement ps=con.prepareStatement(sql);
						ps.setString(1, id.getMovieName());
						ps.setInt(2,id.getScreenNo());
						ps.setInt(3, id.getTicketId());
						
						n=ps.executeUpdate();
						
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println(e);
					}
					return n;	
				}
				
				public Mms findstd(int id) {
					Mms stud=new Mms();
					ResultSet rs;
					try {
						Connection con=MmsUtil.getDBConnection();
						String sql="select * from details where ticketId=?";
						PreparedStatement ps=con.prepareStatement(sql);
						ps.setInt(1, id);
						rs=ps.executeQuery();
						if (rs.next()) {
							stud.setMovieName(rs.getString(1));
							stud.setScreenNo(rs.getInt(2));
							stud.setTicketId(rs.getInt(3));
						}
						
						
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println(e);
					}
					return stud;
					
				}

			
		public LinkedList<Mms> findAllStudent(){
			int n=0;
			
			
			LinkedList<Mms> list=new LinkedList<Mms>();
			Mms stud=null;
			try {
				Connection con=MmsUtil.getDBConnection();
				String sql="select * from details";
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					stud=new Mms();
					stud.setMovieName(rs.getString(1));
					stud.setScreenNo(rs.getInt(2));
					stud.setTicketId(rs.getInt(3));
					list.add(stud);
				}

		}catch(Exception e) {
			System.out.println(e);
		}
	return list;
	}
		
		public int deleteStudent(int id) {
			int n=0;
			try {
				Connection con=MmsUtil.getDBConnection();
				String sql="delete from details where ticketId=?";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, id);
				n=ps.executeUpdate();
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
			return n;	
		}
	}

