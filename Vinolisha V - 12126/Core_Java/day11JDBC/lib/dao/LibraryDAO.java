package com.lib.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.lib.bean.Library;
import com.lib.util.DBUtil;
import com.mysql.cj.conf.DatabaseUrlContainer;

public class LibraryDAO {
	
	public int insertBooks(Library lib) {
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="insert into booktable values(?,?,?,?,?,?,?)";			
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, lib.getBookId());
			ps.setString(2,lib.getBookName());
			ps.setString(3, lib.getAuthorName());
			ps.setInt(4 ,lib.getPrice());
			ps.setString(5, lib.getPublishedBy());
			ps.setString(6, lib.getBookGener());
			ps.setString(7,lib.getPublishedDate());
			n = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();;
		}
		return n;
	}


	

	//delete values
	public int delete(int id) {
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="delete from booktable where BookId=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,id);
			n=ps.executeUpdate();
		} catch (Exception e) {
			
		}
		return n;
	}
	
	//update values
	public int updateBooks(Library lib) {
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="update booktable set BookName=? ,AuthorName=? ,Price=? ,PublishedBy=? ,BookGener=? ,PublishedDate=? where BookId=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, lib.getBookName());
			ps.setString(2, lib.getAuthorName());
			ps.setInt(3, lib.getPrice());
			ps.setString(4, lib.getPublishedBy());
			ps.setString(5, lib.getBookGener());
			ps.setString(6, lib.getPublishedDate());
			ps.setInt(7, lib.getBookId());
			n=ps.executeUpdate();
			System.out.println(n);
			
			} 
		catch (Exception e) {
			System.out.println(e);
		}
		return n;
		
	}



	//find record
	public int find(int id2) {
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="select* from booktable where BookId=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id2);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				System.out.println("Book Name: " +rs.getString(2)+ "\nAuthor Name: " + rs.getString(3)+ "\nPrice: " + rs.getInt(4) + "\nPublishedBy: " + rs.getString(5) + " \nBookGener: " +rs.getString(6) + " \nPublishedDate" +rs.getString(7));
				n=1;
			}
		} catch (Exception e) {
		
		}
		return n;
	}

	//findall
	public int findAll() {
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="select* from booktable;";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				System.out.println("BookId: " + rs.getInt(1) + "\nBook Name: " +rs.getString(2)+ "\nAuthor Name: " + rs.getString(3)+ "\nPrice: " + rs.getInt(4) + "\nPublishedBy: " + rs.getString(5) + " \nBookGener: " +rs.getString(6) + " \nPublishedDate" +rs.getString(7));
				n=1;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
		
	}

	

}
