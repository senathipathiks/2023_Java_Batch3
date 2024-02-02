package com.lib.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.lib.bean.library;
import com.lib.util.DBUtill;
//import com.sms.util.DBUtil;


public class LibraryDao {
	
	public int insert(library lib) {
		Connection con=DBUtill.getDBCOnnection();
		String sql="insert into library values(?,?,?,?,?,?,?)";
		int n=0;
		try {
			PreparedStatement p=con.prepareStatement(sql);
			p.setInt(1, lib.getBookID());
			p.setString(2, lib.getBookName());
			p.setString(3, lib.getAuthorName());
			p.setInt(4, lib.getPrice());
			p.setString(5, lib.getPublisherName());
			p.setString(6, lib.getGenre());
			p.setString(7, lib.getPublisheddate());
//			p.setDate(n, lib.getPublisheddate());
			n=p.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
		
	}
	public int update(library lib) {
        int n=0;
        try {
            Connection con=DBUtill.getDBCOnnection();
            String sql="UPDATE `library`.`library` SET `BookName` = ?, `AuthorName` =?, `Price` = ?, `publishedBy` = ?, `BookGenre` = ?, `PublishedDate` = ? WHERE (`BookId` = ?);";
            PreparedStatement p = con.prepareStatement(sql);
            
			p.setString(1, lib.getBookName());
			p.setString(2, lib.getAuthorName());
			p.setInt(3, lib.getPrice());
			p.setString(4, lib.getPublisherName());
			p.setString(5, lib.getGenre());
			p.setString(6, lib.getPublisheddate());
			p.setInt(7, lib.getBookID());
			n=p.executeUpdate();
           
        }
        catch (Exception e) {
			e.printStackTrace();
		}
        return n;

}
	public int delete(int id) {
		int n=0;
        try {
            Connection con=DBUtill.getDBCOnnection();
            String sql="delete from library.library where BookId=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            n=ps.executeUpdate();
        }
        catch (Exception e) {
			System.out.println(e);
		}
		
		return n;
		
	}
	public int Find(int id1) {
		int n=0;
        try {
            Connection con=DBUtill.getDBCOnnection();
            String sql="Select * from library.library where BookId=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id1);
            ResultSet rs=ps.executeQuery();
			 while(rs.next()) {
				 System.out.print("Book ID: "+rs.getInt(1)+"\nBook Name: "+rs.getString(2)+"\nAuthor Name: "+rs.getString(3)+"\nBook Price: "+rs.getInt(4)+"\nPublishedBy: "+rs.getString(5)+"\nBook Genre: "+rs.getString(6)+"\nPublished Date: "+rs.getString(7));
				 System.out.println("--------------------------------------------------------------------------------------------------");
			 }
        }
        catch (Exception e) {
			System.out.println(e);
		}
		return n;
		
	}
	 public int fingAll() {
		 int n=0;
		  
		 try {
			 Connection con=DBUtill.getDBCOnnection();
			 String sql="select * from library.library";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				 System.out.print("Book ID: "+rs.getInt(1)+"\nBook Name: "+rs.getString(2)+"\nAuthor Name: "+rs.getString(3)+"\nBook Price: "+rs.getInt(4)+"\nPublishedBy: "+rs.getString(5)+"\nBook Genre: "+rs.getString(6)+"\nPublished Date: "+rs.getString(7));
				 System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			 }
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
		 
	 }
	

	  
	
}
