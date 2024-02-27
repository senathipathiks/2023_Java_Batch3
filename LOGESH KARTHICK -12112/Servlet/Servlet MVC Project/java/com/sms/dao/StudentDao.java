package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sms.bean.StudentClass;
import com.sms.util.StudentUtil;

public class StudentDao {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	public int insertStudent(StudentClass stud)
	{
		int n=0;
		try {
			Connection con=StudentUtil.getDBConnection();
			String sql="insert into student values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, stud.getId());
			ps.setString(2, stud.getName());
			ps.setString(3, stud.getCity());
			
			n=ps.executeUpdate();
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
   return n;
}
	
	
	public StudentClass findStudent(int id) {
        // TODO Auto-generated method stub
        //int n = 0;
		
        StudentClass stud = new StudentClass() ;
        ResultSet rs;
        try 
        {
            Connection con=StudentUtil.getDBConnection();
            String sql="select * FROM Student WHERE id=?";
                    PreparedStatement ps=con.prepareStatement(sql);
                    ps.setInt(1,  id);
                     rs =ps.executeQuery();
//                    while(rs.next()) {
//                        System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
//                        n++;
                    if(rs.next())
                    {
                        stud.setId(rs.getInt(1));
                        stud.setName(rs.getString(2));
                        stud.setCity(rs.getString(3));
                    }
                    
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return stud;
    }


	}


