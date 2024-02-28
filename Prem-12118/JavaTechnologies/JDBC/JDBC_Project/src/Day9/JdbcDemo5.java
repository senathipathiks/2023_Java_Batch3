package Day9;
import java.sql.*;

public class JdbcDemo5 {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/c_db";
		String userName = "root";
		String password = "Prem@1234";
		
		Connection con=DriverManager.getConnection(url,userName,password);
		
		Statement st= con.createStatement();
		
		st.addBatch("Insert into employee values(8,'riyas',3000)");
		int[] rs=st.executeBatch();
		System.out.println("Rows affected:"+rs);
		con.close();
		 
		
		
	}

}
