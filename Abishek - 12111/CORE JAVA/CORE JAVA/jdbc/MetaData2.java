package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class MetaData2 {

    public static void main(String[] args) {
        
        final String url="jdbc:mysql://localhost:3306/abishek";
        final String uname="root";
        final String pass="Password@12345";
        

        try {
            Connection c= DriverManager.getConnection(url,uname,pass);
            
            PreparedStatement p=c.prepareStatement("select * from tbl_3");
            
            ResultSet rs=p.executeQuery();
            
            ResultSetMetaData rsm=p.getMetaData();
            
            System.out.println("No of columns :" + rsm.getColumnCount());
            System.out.println(rsm.getColumnName(1)+"  "+rsm.getColumnName(2)+" "+rsm.getColumnName(3));
            
            while(rs.next()) {
                System.out.println(rs.getInt(1)+ "   "+rs.getString(2) + "  "+ rs.getString(3));
            }
        }
        
            catch (Exception e) {
                System.out.println(e);
            }
        
    }

}
