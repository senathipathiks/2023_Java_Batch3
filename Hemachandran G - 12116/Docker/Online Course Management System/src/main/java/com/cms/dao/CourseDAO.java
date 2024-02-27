package com.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cms.bean.Course;
import com.cms.util.DBUtil;


public class CourseDAO {
	
	int n=0;
	private List<Course> list;
	private Connection con = DBUtil.getDBConnection();
	public int insertCourse(Course oc) {
		try {
			String q = "insert into course value(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, oc.getCourseID());
			ps.setString(2, oc.getCourseName());
			ps.setString(3, oc.getCourseType());
			ps.setInt(4, oc.getCourseDuration());
			ps.setFloat(5, oc.getCourseFee());
			n=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;		
	}

	public int deleteCourse(int id) {
		try {
			String q = "delete from Course where courseid = ?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, id);
			n=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return n;
	}

	public int updateCourse(Course oc) {
		try {
			String q = "update course set courseName = ?, courseType = ?, courseDuration = ?, courseFee = ?  where courseid =?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, oc.getCourseID());
			ps.setString(2, oc.getCourseName());
			ps.setString(3, oc.getCourseType());
			ps.setInt(4, oc.getCourseDuration());
			ps.setFloat(5, oc.getCourseFee());
			n=ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return n;
	}

	public Course searchCourse(int id) {
		ResultSet rs;
		
		try {
			String q = "select * from course where courseid = ?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.next())
				return new Course(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getFloat(5));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Course> viewAll() {
ResultSet rs;
		
		try {
			list = new ArrayList<Course>();
			String q = "select * from course";
			PreparedStatement ps = con.prepareStatement(q);
			rs=ps.executeQuery();
			while(rs.next())
				list.add(new Course(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getFloat(5)));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
