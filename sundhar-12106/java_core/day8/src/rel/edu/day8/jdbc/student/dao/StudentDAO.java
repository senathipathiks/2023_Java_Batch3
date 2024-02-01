package rel.edu.day8.jdbc.student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import rel.edu.day8.jdbc.student.bean.Student;
import rel.edu.day8.jdbc.student.util.StudentUtility;

public class StudentDAO {

	public static int insertStudent(Student s) {

		Connection c = StudentUtility.getConnection();
		PreparedStatement ps;
		int n = 0;
		try {
			ps = c.prepareStatement("insert into smsjdbc.student values (?,?,?)");
			ps.setInt(1, s.getId());
			ps.setString(2, s.getName());
			ps.setString(3, s.getCity());
			n = ps.executeUpdate();
			c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}

	public static int deleteStudent(int id) {
		int n = 0;
		try {
			Connection c = StudentUtility.getConnection();
			PreparedStatement ps = c.prepareStatement("delete from smsjdbc.student where id = ?");
			ps.setInt(1, id);
			n = ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
		}
		return n;

	}

	public static int updateStudent(Student s) {

		Connection c = StudentUtility.getConnection();
		PreparedStatement ps;
		int n = 0;
		try {
			ps = c.prepareStatement("UPDATE `smsjdbc`.`student` SET `name` = ?, `city` =? WHERE (`id` = ?);");
			ps.setInt(3, s.getId());
			ps.setString(1, s.getName());
			ps.setString(2, s.getCity());
			n = ps.executeUpdate();
			c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public static ResultSet fetchAll() {
		Connection c = StudentUtility.getConnection();
		PreparedStatement ps;
		ResultSet set = null;
		try {
			ps = c.prepareStatement("select * from smsjdbc.student ;");
			set = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return set;
	}
	
	public static boolean deleteAll() {
		Connection c = StudentUtility.getConnection();
		PreparedStatement ps;
		boolean res = true;
		try {
			ps = c.prepareStatement("truncate table smsjdbc.student");
			res = ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
		
	}
	
	public static ResultSet fetchById(int id) {
		ResultSet rs = null;
		try {
			Connection c = StudentUtility.getConnection();
			PreparedStatement ps = c.prepareStatement("select * from smsjdbc.student where id = ?");
			ps.setInt(1, id);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			System.out.println(e);
		}
		return rs;
		
	}
}
