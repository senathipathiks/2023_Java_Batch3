package database;

import java.util.*;
import java.sql.*;

public class DbDemo7 {

	public static void main(String[] args) throws Exception {
		
		final String URL="jdbc:mysql://localhost:3306/employee";
	    final String User="root";
	    final String pass="root";
	    
	    Scanner sc=new Scanner(System.in);
	    
	    int uid;
	    String uname;
	    char ch;
	    
	    Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(URL,User,pass);
        
        PreparedStatement ps=con.prepareStatement("insert into user values(?,?)");
        
        do {
        	uid=sc.nextInt();
        	uname=sc.next();
        	
        	ps.setInt(1, uid);
        	ps.setString(2, uname);
        	
        	ps.addBatch();
        	
        	System.out.println("Do you wish to continue (Y/N)");
        	ch=sc.next().charAt(0);
        }while(ch=='Y' || ch=='y');
        
        	
        	int[] rs=ps.executeBatch();
        	System.out.println(Arrays.toString(rs));
		
	}

}
