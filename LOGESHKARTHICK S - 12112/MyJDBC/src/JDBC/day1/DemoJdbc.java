package JDBC.day1;
import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;

public class DemoJdbc {

	public static void main(String[] args)  throws SQLException{
		// TODO Auto-generated method stub
		Connection c = DriverManager.getConnection("JDBC:mysql://localhost:3306/jdbc1","root","Password@12345");
//		Statement s =  c.createStatement();
//		boolean a =s.execute("insert into vcky value (45,'loki',24)");
//		System.out.println(a);
//		if (a==false)
//		{
//			System.out.println("1 row updated");
//		}
//		ResultSet rs=s.executeQuery("select * from vcky");
//		while (rs.next())
//		{
//			System.out.println("id :"+rs.getInt(1)+"\tname :"+rs.getString(2)+"\tage :"+rs.getInt(3));
//		}
//		
       String q = "insert into vcky values(? ,?)";
//       String q3 = "delete from vcky whew sid=?";
//       String q4 = "UPDATE VCKY SET sname=?WHERE (sid = ?)";
//       
       PreparedStatement p =c.prepareStatement(q);
       Scanner sc = new Scanner(System.in);
       for(int i =0;i<2;i++)
       {
       System.out.println("enter the id");
       int id = sc.nextInt();
       System.out.println("enter the name");
       sc.nextLine();
       String name=sc.nextLine();
       p.setInt(1, id);
       p.setString(2, name);
       p.addBatch();
       }
       
       int []x=p.executeBatch();
       {
    	   System.out.println(Arrays.toString(x));
       }
       
       
	}

}
