package com.Ass.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.Ass.bean.Petition;
import com.Ass.util.DBUtil;

public class PetitionDAO {

	
	  public int insertPetition(Petition pet) {
	        int n=0;
	        try {
	            Connection con=DBUtil.getDBConnection();
	            String sql="insert into peti values(?,?,?,?,?,?,?)";
	            PreparedStatement ps=con.prepareStatement(sql);
	            ps.setInt(1, pet.getId());
	            ps.setString(2, pet.getCategory());
	            ps.setString(3, pet.getDesc());
	            ps.setString(4, pet.getPriority());
	            ps.setString(5, pet.getRaised());
	            ps.setString(6, pet.getAssingned());
	            ps.setString(7, pet.getStatus());
	            n=ps.executeUpdate();
	        }
	        catch(Exception e) {
	            System.out.println(e);
	        }
	        return n;
	    }



	    public int deletePetition(int id) {
	        int n=0;
	        try {
	            Connection con=DBUtil.getDBConnection();
	            String sql="delete from peti where PetitionID =?";
	            PreparedStatement ps=con.prepareStatement(sql);
	            ps.setInt(1, id);
	            n=ps.executeUpdate();
	        }
	        catch(Exception e) {
	            System.out.println(e);
	        }
	        return n;
	    
	    }
	    
	    
	    
	    public int updatePetition(Petition pet1) { 
	        int n=0;
	        try {
	            Connection con=DBUtil.getDBConnection();
	            String sql="update petition.peti set Category=?,Desc=?,Priority=?,RaisedBy=?,AssignedTo=?,Status=? where PetitionID=?";
	            PreparedStatement ps=con.prepareStatement(sql);
	            ps.setString(1, pet1.getCategory());
	            ps.setString(2, pet1.getDesc());
	            ps.setString(3, pet1.getPriority());
	            ps.setString(4, pet1.getRaised());
	            ps.setString(5, pet1.getAssingned());
	            ps.setString(6, pet1.getStatus());
	            ps.setInt(7,  pet1.getId());
	            
	            n=ps.executeUpdate();
	        }
	        catch(Exception e) {
	            System.out.println(e);
	        }
	        return n;
	    }
	        
	     
	        
	    

	    public Petition findPetition(int id) {
	    	  ResultSet rs;
	        Petition pet=new Petition();
	        try {
	            Connection con=DBUtil.getDBConnection();
	            String sql="select * from peti where PetitionID =?";
	            PreparedStatement ps=con.prepareStatement(sql);
	            ps.setInt(1,id);
	           rs=ps.executeQuery();
	            
	            if(rs.next()) {
	               pet.setId(rs.getInt(1));
	               pet.setCategory(rs.getString(2));
	               pet.setDesc(rs.getString(3));
	               pet.setPriority(rs.getString(4));
	               pet.setRaised(rs.getString(5));
	               pet.setAssingned(rs.getString(6));
	               pet.setStatus(rs.getString(7));
	            }
	        }
	        catch(Exception e) {
	            System.out.println(e);
	        }
	        return pet;
	        
	    }
	    
	   

	    public List<Petition> findAllPetition() {
	        //Petition pet=new Petition();
	        ResultSet rs;
	        LinkedList<Petition> list=new LinkedList<Petition>();
	        
	        try{
	            Connection con=DBUtil.getDBConnection();
	            String sql="select* from peti;";
	            PreparedStatement ps=con.prepareStatement(sql);
	            
	            rs=ps.executeQuery();
	            while(rs.next()) {
	                Petition petd=new Petition();
	                petd.setId(rs.getInt(1));
	                
	                petd.setCategory(rs.getString(2));
	         
	                petd.setDesc(rs.getString(3));
	                
                    petd.setPriority(rs.getString(4));
	                
	                petd.setRaised(rs.getString(5));
	                
	                petd.setAssingned(rs.getString(6));
	                
	                petd.setStatus(rs.getString(7));
	                
	                list.add(petd);
	            }
	        }
	            catch(Exception e) {
	                System.out.println(e);
	            }
	        return list;
	    }
}
