package practicejdbc.day2;
import java.sql.*;

public class DemoExample3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		final String URL = "jdbc:mysql://localhost:3306/sms_db";
		final String user ="root";
		final String pass = "Password@12345";
		 
		try {
	
			
			Connection c = DriverManager.getConnection(URL,user,pass);
			Statement stm =c.createStatement();
			stm.addBatch("insert into emp values ('369','loki',5698465,'plni')");
			stm.addBatch("insert into emp values ('885','ram',54225552, 'palani')");
			stm.executeBatch();
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
