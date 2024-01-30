import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
	public static void main(String[] args) throws SQLException {
		
		Connection c=DriverManager.getConnection("JDBC:mysql://localhost:3306/jdbc", "root", "Password@12345");
		
		Statement s=c.createStatement();
		
		boolean a = s.execute("Insert into student values(111,'deeps')");
		System.out.println(a);
		
		if(a==false) {
			
			System.out.println("1 row updated");
		}
		
		ResultSet rs = s.executeQuery("select *from student");
		
		while(rs.next()) {
			System.out.println("iD :"+rs.getInt(1)+"\nname :"+rs.getString(2));
		}
	}

}
