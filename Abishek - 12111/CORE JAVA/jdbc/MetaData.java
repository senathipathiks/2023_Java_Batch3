package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



public class MetaData {
       
        
    public static void main(String[] args) throws SQLException {
        
    	 final String url="jdbc:mysql://localhost:3306/abishek";
         final  String uname="root";
         final  String pass="Password@12345";
        
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection(url,uname,pass);
            DatabaseMetaData dbdm= c.getMetaData();
            
            String table[] = {"TABLE"};
            
            ResultSet rs=dbdm.getTables(null, null, null, table);
            
            while(rs.next()) {
                System.out.println(rs.getString(3));
            }
            
        } catch (Exception e) {
            System.out.println(e);
            
        }
        
        

    }

}
