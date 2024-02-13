package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

import com.sms.bean.Student;
import com.sms.util.DBUtil;


public class StudentDAO {
    
    public int insertStudent(Student stu) {
        int n=0;
        try {
            Connection con=DBUtil.getDBConnection();
            String sql="insert into stud values(?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, stu.getId());
            ps.setString(2, stu.getName());
            ps.setString(3, stu.getCity());
            n=ps.executeUpdate();
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return n;
    }



    public int deleteStudent(int id) { //delete value
        int n=0;
        try {
            Connection con=DBUtil.getDBConnection();
            String sql="delete from stud where sid=?";
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
    
    public int updateStudent(Student stu) { 
        int n=0;
        try {
            Connection con=DBUtil.getDBConnection();
            String sql="update stud set  sname=? ,scity=?  where sid=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, stu.getName());
            ps.setString(2, stu.getCity());
            ps.setInt(3,  stu.getId());
            
            
            n=ps.executeUpdate();
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return n;
    }
        
        //find values
        
    

    public Student findStudent(int id) {
    	  ResultSet rs;
        Student stu=new Student();
        try {
            Connection con=DBUtil.getDBConnection();
            String sql="select*from stud where sid=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,id);
           rs=ps.executeQuery();
            
            if(rs.next()) {
               stu.setId(rs.getInt(1));
               stu.setName(rs.getString(2));
               stu.setCity(rs.getString(3));
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return stu;
        
    }
    
    //find all

    public LinkedList<Student> findAllStudent() {
        //Student stud=new Student();
        ResultSet rs;
        LinkedList<Student> list=new LinkedList<Student>();
        
        try{
            Connection con=DBUtil.getDBConnection();
            String sql="select* from stud;";
            PreparedStatement ps=con.prepareStatement(sql);
            
            rs=ps.executeQuery();
            while(rs.next()) {
                Student stud=new Student();
                stud.setId(rs.getInt(1));
                
                stud.setName(rs.getString(2));
         
                stud.setCity(rs.getString(3));
                
                list.add(stud);
            }
        }
            catch(Exception e) {
                System.out.println(e);
            }
        return list;
    }
    

}


