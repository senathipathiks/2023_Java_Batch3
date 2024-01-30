package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;

public class BatchExecution {
	
	static String url="jdbc:mysql://localhost:3306/dharshsun_db";
	static String user="root";
	static String Pass="Password@12345";

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection(url,user,Pass);
		String Query="insert into tbl_dept values(?,?,?)";
		String Query1="delete from tbl_dept Where(deptid=?)";
		
		PreparedStatement pst = con.prepareStatement(Query1);
		Scanner sc = new Scanner(System.in);
//		for(int i=0;i<1;i++) {
//			System.out.println("Enter the user id:");
//			String deptid =sc.nextLine();
//			System.out.println("enter the dept name:");
////			sc.nextLine();
//			String deptname=sc.nextLine();
//			System.out.println("enter the dept location:");
////			sc.nextLine();
//			String location=sc.nextLine();
//			pst.setString(1, deptid);
//            pst.setString(2, deptname);
//            pst.setString(3, location);
//            pst.addBatch();
//		}
//		int[] a = pst.executeBatch();
//		System.out.println(Arrays.toString(a));
//	}
	System.out.println("Enter the id you want to delete");
    String deptid=sc.nextLine();
    pst.setString(1, deptid);
//    pst.setString(2, deptname);
    int a= pst.executeUpdate();
    if(a==1) {
        System.out.println("1 row deleted");
        }

}
}
