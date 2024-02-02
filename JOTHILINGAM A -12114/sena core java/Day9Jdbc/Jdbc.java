package Day9Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;

public class Jdbc {

	public static void main(String[] args) throws SQLException {
		  final String URL = "jdbc:mysql://localhost:3306/student1";
	        final String User="root";
	        final String pass="root";
	        
	        Scanner sc=new Scanner(System.in);
	        int studid;
	        String studname;
	        String studaddress;
	        int studphoneno;
	        int deptid;
	        char ch;
	        
	        Connection con = DriverManager.getConnection(URL,User,pass);
	        
	        PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?)");
	        do {
	            studid=sc.nextInt();
	            studname=sc.next();
	            studaddress=sc.next();
	            studphoneno=sc.nextInt();
	            deptid=sc.nextInt();
	            ps.setInt(1, studid);
	            ps.setString(2, studaddress);
	            ps.addBatch();
	            System.out.println("do u wish to continue:(Y/N");
	            ch=sc.next().charAt(0);
	            
	            
	        }while(ch=='Y'||ch=='y');
	        
	        int[] rs=ps.executeBatch();
	        System.out.println(Arrays.toString(rs));

	}

}
