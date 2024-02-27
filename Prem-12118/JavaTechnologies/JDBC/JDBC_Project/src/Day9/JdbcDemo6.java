package Day9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcDemo6 {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/c_db";
        String userName = "root";
        String password = "Prem@1234";

        Scanner sc = new Scanner(System.in);
        Connection con = DriverManager.getConnection(url, userName, password);

        PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");

        
            System.out.print("Enter emp_id: ");
            int emp_id = sc.nextInt();
            System.out.print("Enter ename: ");
            String ename = sc.next();
            System.out.print("Enter Salary: ");
            int salary = sc.nextInt();

            ps.setInt(1, emp_id);
            ps.setString(2, ename);
            ps.setInt(3, salary);

            ps.addBatch();

            //System.out.println("Do you want to continue? (yes/no): ");
         //while (sc.next().equalsIgnoreCase("yes"));

        int[] result = ps.executeBatch();
        con.commit();

        System.out.println("Number of records inserted: " + result.length);

        ps.close();
        con.close();
    }
}
