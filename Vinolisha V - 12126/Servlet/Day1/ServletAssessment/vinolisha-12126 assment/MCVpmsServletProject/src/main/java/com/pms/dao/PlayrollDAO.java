package com.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

import com.pms.bean.Playroll;
import com.pms.util.DBUtil;

public class PlayrollDAO {

	//insert
		public int insertPlayroll(Playroll play) {
			int n=0;
			try {
				Connection con=DBUtil.getDBConnection();
				String sql="insert into playroll_tbl values(?,?,?,?,?,?,?,?)";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, play.getRollId());
				ps.setString(2, play.getEmpName());
				ps.setInt(3, play.getEmpId());
				ps.setFloat(4, play.getBasic());
				ps.setInt(5, play.getHra());
				ps.setInt(6, play.getDa());
				ps.setInt(7, play.getDa());
				ps.setFloat(8, play.getCtc());
				n=ps.executeUpdate();
				} catch (Exception e) {
				System.out.println(e);
			}
			return n;
			
		}
		
		//delete values
		
		public int deletePlayroll(int rollId) {
			int n=0;
			try {
				Connection con=DBUtil.getDBConnection();
				String sql="delete from playroll_tbl where playrollId=?";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, rollId);
				n=ps.executeUpdate();
			} catch (Exception e) {
				System.out.println();
			}
			return n;
			
		}
		
		//update
		public int updatePlayroll(Playroll play) {
			int n=0;
			try {
				Connection con=DBUtil.getDBConnection();
				String sql="update playroll_tbl set employeeName=? ,empId=? ,basic=? ,hra=? ,da=? ,ta=? ,ctc=? where playrollId=?";
				PreparedStatement ps=con.prepareStatement(sql);
				
				ps.setString(1, play.getEmpName());
				ps.setInt(2, play.getEmpId());
				ps.setFloat(3, play.getBasic());
				ps.setInt(4, play.getHra());
				ps.setInt(5, play.getDa());
				ps.setInt(6, play.getDa());
				ps.setFloat(7, play.getCtc());
				
				
				n=ps.executeUpdate();
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
			return n;
			
		}
		
		//find values
		
		public Playroll findPlayroll(int Id) {
			Playroll play=new Playroll();
			ResultSet rs;
			
			try {
				Connection con=DBUtil.getDBConnection();
				String sql="select * from playroll_tbl where playrollId=?";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, Id);
				rs=ps.executeQuery();
				if(rs.next()) {
					play.setRollId(rs.getInt(1));
					play.setEmpName(rs.getString(2));
					play.setEmpId(rs.getInt(3));
					play.setBasic(rs.getFloat(4));
					play.setHra(rs.getInt(5));
					play.setDa(rs.getInt(6));
					play.setTa(rs.getInt(7));
					play.setCtc(rs.getFloat(8));
				}
				
			}
			
			 catch (Exception e) {
				System.out.println(e);
			}
			return play;
		}
		
		//find all
		
		public LinkedList<Playroll> findAllStudent() {
			
			ResultSet rs;
			LinkedList<Playroll> list=new LinkedList<Playroll>();
			
			try{
				Connection con=DBUtil.getDBConnection();
				String sql="select* from playroll_tbl;";
				PreparedStatement ps=con.prepareStatement(sql);
				
				rs=ps.executeQuery();
				while(rs.next()) {
					Playroll play=new Playroll();
					play.setRollId(rs.getInt(1));
					play.setEmpName(rs.getString(2));
					play.setEmpId(rs.getInt(3));
					play.setBasic(rs.getFloat(4));
					play.setHra(rs.getInt(5));
					play.setDa(rs.getInt(6));
					play.setTa(rs.getInt(7));
					play.setCtc(rs.getFloat(8));
					
					list.add(play);
				}
			}
				catch(Exception e) {
					System.out.println(e);
				}
			return list;
		}



	}
