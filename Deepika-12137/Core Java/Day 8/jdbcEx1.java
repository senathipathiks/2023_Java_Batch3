import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcEx1 {
public static void main(String[] args) throws SQLException {
	
	Connection cn= DriverManager.getConnection("JDBC:mysql://localhost:3306/user_details", "root", "Password@12345");
    
	Statement st=cn.createStatement();
	
	boolean b= st.execute("delete from customer Where cus_id=112 ");
	System.out.println(b +" row deleted");
	
	
	ResultSet r=st.executeQuery("select *from customer");
	while(r.next()) {
		System.out.println("ID :"+r.getInt(1)+"\nName :"+r.getString(2));
		
}
}
}