package Com.Day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ResultsetMetaDataEg {

	public static void main(String[] args)throws ClassNotFoundException {
		
		final String url="jdbc:mysql://localhost:3306/stu_db";
		final String User="root";
		final String pass="Password@12345";
		
		try {
			//Class.forName("com.mysql.jdbc.Driver");//-not needed because this is deprecated
			Connection con=DriverManager.getConnection(url,User,pass);
			
			PreparedStatement st=con.prepareStatement("Select*from student_details");
			ResultSet rs=st.executeQuery();
			
		    ResultSetMetaData rsm=st.getMetaData();//to display the  total number of column, column name, column type 
		   
		    System.out.println("No of Columns:"+rsm.getColumnCount());
		    System.out.println(rsm.getColumnName(1) +" "+rsm.getColumnName(2)+" "+rsm.getColumnName(3));
		    while(rs.next()) {
			System.out.println(rs.getInt(1) +" "+ rs.getString(2) +" "+ rs.getString(3) );
			}
		}
		    catch(Exception e) {
			System.out.println(e);
		}

	}

}
