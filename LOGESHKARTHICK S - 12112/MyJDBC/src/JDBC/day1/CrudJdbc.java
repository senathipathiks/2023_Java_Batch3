package JDBC.day1;
import java.sql.*;

public class CrudJdbc {
    public static void main(String[] args) {
        try {
            // Establishing a connection to the database
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mydb", "username", "password");
            System.out.println("Connection established.");

            // Creating a new record
            String sql = "INSERT INTO table_name (column1, column2, column3) VALUES (?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, "value1");
            statement.setString(2, "value2");
            statement.setInt(3, 123);
            statement.executeUpdate();
            System.out.println("Record created.");

            // Reading a record
            sql = "SELECT column1, column2, column3 FROM table_name WHERE id = ?";
            statement = con.prepareStatement(sql);
            statement.setInt(1, 1);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                String column1 = result.getString("column1");
                String column2 = result.getString("column2");
                int column3 = result.getInt("column3");
                System.out.println("Column 1: " + column1);
                System.out.println("Column 2: " + column2);
                System.out.println("Column 3: " + column3);
            }

            // Updating a record
            sql = "UPDATE table_name SET column1 = ?, column2 = ?, column3 = ? WHERE id = ?";
            statement = con.prepareStatement(sql);
            statement.setString(1, "new_value1");
            statement.setString(2, "new_value2");
            statement.setInt(3, 456);
            statement.setInt(4, 1);
            statement.executeUpdate();
            System.out.println("Record updated.");

            // Deleting a record
            sql = "DELETE FROM table_name WHERE id = ?";
            statement = con.prepareStatement(sql);
            statement.setInt(1, 1);
            statement.executeUpdate();
            System.out.println("Record deleted.");

            // Closing the connection
            con.close();
            System.out.println("Connection closed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
