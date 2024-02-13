package smsJspApp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import smsJspApp.bean.Student;
import smsJspApp.util.DbUtil;

public class StudentDAO {
	
	public static int insertStudent(Student s) throws SQLException {

		Connection c = DbUtil.getConnection();
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
		}finally {
			c.close();
		}
		return n;
	}

	public static int deleteStudent(int id) throws SQLException {
		int n = 0;
		Connection c = DbUtil.getConnection();
		try {
			PreparedStatement ps = c.prepareStatement("delete from smsjdbc.student where id = ?");
			ps.setInt(1, id);
			n = ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			c.close();
		}
		return n;

	}

	public static int updateStudent(Student s) throws SQLException {

		Connection c = DbUtil.getConnection();
		PreparedStatement ps;
		int n = 0;
		try {
			ps = c.prepareStatement("UPDATE `smsjdbc`.`student` SET `name` = ?, `city` =? WHERE (`id` = ?);");
			ps.setInt(3, s.getId());
			ps.setString(1, s.getName());
			ps.setString(2, s.getCity());
			n = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			c.close();
		}
		return n;
	}
	
	public static List<Student> fetchAll() throws SQLException {
		Connection c = DbUtil.getConnection();
		PreparedStatement ps;
		ResultSet rs = null;
		Student s = null;
		List<Student> list = new ArrayList<Student>();
		try {
			ps = c.prepareStatement("select * from smsjdbc.student ;");
			rs = ps.executeQuery();
			while(rs.next()) {
				s = new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setCity(rs.getString(3));
				list.add(s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			c.close();
		}
		return list;
	}
	
	public static boolean deleteAll() throws SQLException {
		Connection c = DbUtil.getConnection();
		PreparedStatement ps;
		boolean res = true;
		try {
			ps = c.prepareStatement("truncate table smsjdbc.student");
			res = ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			c.close();
		}
		return res;
		
	}
	
	public static Student fetchById(int id) throws SQLException {
		ResultSet rs = null;
		Student s = null;
		Connection c = DbUtil.getConnection();
		try {
			
			PreparedStatement ps = c.prepareStatement("select * from smsjdbc.student where id = ?");
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				s = new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setCity(rs.getString(3));
			}
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			c.close();
		}
		return s;
		
	}

}
