package com.day28;

import java.sql.*;

public class TableCreationClass {

	public static void main(String[] args)throws SQLException {
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","sam@6383587926");
		
		Statement st = c.createStatement();
		
		boolean creFlag= st.execute("create table subject_tbl(sub_id int primary key,sub_name varchar(15) not null)");
		if(!creFlag)
			System.out.println("Subject Table Created...");
		
//		boolean delFlag = st.execute("drop table subject_tbl");
//		if(!delFlag)
//			System.out.println("Subject Table Deleted...");

	}

}
