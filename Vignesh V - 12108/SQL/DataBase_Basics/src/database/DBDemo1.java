package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class DBDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String URL="jdbc:mysql://localhost:3306/employee";
	    final String User="root";
	    final String pass="root";
	    
	    try {
	        Class.forName("com.mysql.jdbc.Driver");
	        Connection con=DriverManager.getConnection(URL,User,pass);
	        
	        PreparedStatement st=con.prepareStatement("Select * from user");
	        
	        ResultSet rs=st.executeQuery();
	        
	        ResultSetMetaData rsm=st.getMetaData();
	        
	        System.out.println("No of Columns : "+rsm.getColumnCount());
	        System.out.println(rsm.getColumnName(1)+" "+rsm.getColumnName(2)+" "+rsm.getColumnClassName(3));
	        
	        
	        while(rs.next()) {
	            System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getInt(3));
	        }}
	        catch(Exception e){
	            System.out.println(e);}

	}

}
