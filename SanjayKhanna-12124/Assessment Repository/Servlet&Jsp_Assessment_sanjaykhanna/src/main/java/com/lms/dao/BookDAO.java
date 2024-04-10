package com.lms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import com.lms.util.DBUtil;
import com.lms.bean.Book;

public class BookDAO {
	
	private static Connection con = DBUtil.getDBConnection();
	private static LinkedList<Book> list;
	
	public  int insertBook(Book b) {
		int n=0;
		try {
			String q = "insert into tbl_book value(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, b.getBookId());
			ps.setString(2, b.getBookName());
			ps.setString(3, b.getAuthor());
			ps.setString(4, b.getPublisher());
			ps.setFloat(5,b.getPrice());
			ps.setInt(6, b.getEdition());
			n = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public  int updateBook(Book b) {
		int n=0;
		try {
			String q = "update tbl_book set book_name = ?,author = ?,publisher = ?, price = ?, edition = ? where book_id = ? ";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(6, b.getBookId());
			ps.setString(1, b.getBookName());
			ps.setString(2, b.getAuthor());
			ps.setString(3, b.getPublisher());
			ps.setFloat(4,b.getPrice());
			ps.setInt(5, b.getEdition());
			n= ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public  int deleteBook(int id) {
		int n=0;
		try {
			String q = "delete from tbl_book where book_id=?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, id);
			n = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public  boolean deleteAllBook(String password) {
		boolean flag= true;
		try {
			String q = "delete from tbl_book";
			Statement st = con.createStatement();
			if(DBUtil.password.equals(password))
				flag = st.execute(q);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public  Book searchBook(int id) {
		
		try {
			String q = "select * from tbl_book where book_id = ?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
				return new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getFloat(5), rs.getInt(6));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public  LinkedList<Book> veiwAllBook(){
		list = new LinkedList<Book>();
		try {
			String q = "select * from tbl_book";
			PreparedStatement ps = con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
				 list.add(new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getFloat(5), rs.getInt(6)));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;	
	}

}
