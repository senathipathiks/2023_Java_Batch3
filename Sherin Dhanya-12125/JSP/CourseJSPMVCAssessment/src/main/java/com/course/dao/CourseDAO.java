package com.course.dao;
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.LinkedList;

	import com.course.Util.DBUtil;
	import com.course.bean.Course;

	public class CourseDAO {
	public int insertCourse(Course cor) {
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="insert into course_tbl values(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, cor.getCourseID());
			ps.setString(2, cor.getCourseName());
			ps.setString(3, cor.getCourseType());
			ps.setInt(4, cor.getCourseDuration());
			ps.setInt(5,cor.getCourseFee());
			n=ps.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return n ;
	}
	//delete value
		public int deleteCourse(int id) {
			int n=0;
			try {
				Connection con=DBUtil.getDBConnection();
				String sql="delete from course_tbl where CourseID=?";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, id);
				n=ps.executeUpdate();
			}
			catch(Exception e) {
				System.out.println(e);
			}
			return n;
		
		}
		//update value
		public int updateCourse(Course cor) {
			int n=0;
			try {
				Connection con=DBUtil.getDBConnection();
				String sql="update course_tbl set CourseName=?, CourseType=?, CourseDuration=?, CourseFee=? where CourseID=?";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, cor.getCourseName());
				ps.setString(2, cor.getCourseType());
				ps.setInt(3, cor.getCourseDuration());
				ps.setInt(4,cor.getCourseFee());
				ps.setInt(5, cor.getCourseID());
				n=ps.executeUpdate();
			}
			catch(Exception e) {
				System.out.println(e);
			}
			return n;
		}
		//find value
		public Course findCourse(int id) {

			Course cor=null;
			ResultSet rs;

			try {
				Connection con=DBUtil.getDBConnection();
				String sql="select * from course_tbl where CourseID=?";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, id);
				rs=ps.executeQuery();
				if(rs.next()) {
			    cor=new Course();
				cor.setCourseID(rs.getInt(1));
				cor.setCourseName(rs.getString(2));
				cor.setCourseType(rs.getString(3));
				cor.setCourseDuration(rs.getInt(4));
				cor.setCourseFee(rs.getInt(5));
				
			}
			}
			catch(Exception e) {
				System.out.println(e);
			}
			return cor;
		}
		//find all
		public LinkedList<Course> findAllCourse() {
			ResultSet rs;
		LinkedList<Course> list=new LinkedList<Course>();
			try {
				Connection con=DBUtil.getDBConnection();
				String sql="select * from course_tbl ";
				PreparedStatement ps=con.prepareStatement(sql);
				
				rs=ps.executeQuery();
				while(rs.next()) {
				Course cor=new Course();
				cor.setCourseID(rs.getInt(1));
				cor.setCourseName(rs.getString(2));
				cor.setCourseType(rs.getString(3));
				cor.setCourseDuration(rs.getInt(4));
				cor.setCourseFee(rs.getInt(5));
				list.add(cor);
			}
			}
			catch(Exception e) {
				System.out.println(e);
			}
			return list;
		}
}