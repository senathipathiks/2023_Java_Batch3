package com.OCMS.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

import com.OCMS.bean.Ocms;
import com.OCMS.util.OcmsUtil;

public class OcmsDao {


				
				
					public int insert(Ocms course)
					{
						int n=0;
						try 
						{
							Connection con=OcmsUtil.getDBConnection();
							String sql="insert into c_details values(?,?,?,?,?)";
							PreparedStatement ps=con.prepareStatement(sql);
							ps.setInt(1,course.getCourseID());
							ps.setString(2,course.getCourseName());
							ps.setString(3, course.getCourseType());
							ps.setInt(4, course.getCourseDuration());
							ps.setFloat(5,course.getCourseFee());
							n=ps.executeUpdate();			
						}
						catch (Exception e)
						{
							System.out.println(e);
						}
						
						return n;
					}
					

					
					public int update(Ocms id) {
						int n=0;
						try {
							Connection con=OcmsUtil.getDBConnection();
							String sql="update c_details set CourseName=?,CourseType=? where CourseID=?";
							PreparedStatement ps=con.prepareStatement(sql);
							ps.setInt(1,id.getCourseID());
							ps.setString(2,id.getCourseName());
							ps.setString(3, id.getCourseType());
							ps.setInt(4, id.getCourseDuration());
							ps.setFloat(5,id.getCourseFee());
							
							n=ps.executeUpdate();
							
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println(e);
						}
						return n;	
					}
					
					public Ocms find(int id) {
						Ocms course=null;
						ResultSet rs;
						try {
							Connection con=OcmsUtil.getDBConnection();
							String sql="select * from c_details where CourseID=?";
							PreparedStatement ps=con.prepareStatement(sql);
							ps.setInt(1, id);
							rs=ps.executeQuery();
							if (rs.next()) {
							    course=new Ocms();
								course.setCourseID(rs.getInt(1));
								course.setCourseName(rs.getString(2));
								course.setCourseType(rs.getString(3));
								course.setCourseDuration(rs.getInt(4));
								course.setCourseFee(rs.getFloat(5));
							}
							
							
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println(e);
						}
						return course;
						
					}

				
			public LinkedList<Ocms> findAll(){
				int n=0;
				
				
				LinkedList<Ocms> list=new LinkedList<Ocms>();
				Ocms course=null;
				try {
					Connection con=OcmsUtil.getDBConnection();
					String sql="select * from c_details";
					PreparedStatement ps=con.prepareStatement(sql);
					ResultSet rs=ps.executeQuery();
					
					while(rs.next()) {
						course=new Ocms();
						course.setCourseID(rs.getInt(1));
						course.setCourseName(rs.getString(2));
						course.setCourseType(rs.getString(3));
						course.setCourseDuration(rs.getInt(4));
						course.setCourseFee(rs.getFloat(5));
						list.add(course);
					}

			}catch(Exception e) {
				System.out.println(e);
			}
		return list;
		}
			
			public int delete(int id) {
				int n=0;
				try {
					Connection con=OcmsUtil.getDBConnection();
					String sql="delete from c_details where CourseID=?";
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


