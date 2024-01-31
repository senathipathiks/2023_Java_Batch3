package JDBC.day1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CrudAsmnt {
    public static void main(String[] args) throws SQLException {

        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer_deatails", "root", "Password@12345");

        String insertQuery = "INSERT INTO user VALUES (?, ?, ?, ?, ?)";
        String deleteQuery = "DELETE FROM user WHERE id = ?";
        String updateQuery = "UPDATE user SET names = ? WHERE id = ?";

        PreparedStatement insertStatement = c.prepareStatement(insertQuery);
        PreparedStatement deleteStatement = c.prepareStatement(deleteQuery);
        PreparedStatement updateStatement = c.prepareStatement(updateQuery);
        PreparedStatement selectStatement = c.prepareStatement("SELECT * FROM user");

        Scanner scanner = new Scanner(System.in);

        boolean flag = true;

        while (flag) {
            System.out.println("\nSelect an operation: \n1. Insert 2. Delete 3. Update 4. View 5. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Insert
                    System.out.println("Enter the user id:");
                    int id = scanner.nextInt();

                    System.out.println("Enter the user name:");
                    scanner.nextLine();
                    String name = scanner.nextLine();

                    System.out.println("Enter the phone number:");
                    String phoneNumber = scanner.nextLine();

                    System.out.println("Enter the address:");
                    String address = scanner.nextLine();

                    System.out.println("Enter the salary:");
                    double salary = scanner.nextDouble();

                    insertStatement.setInt(1, id);
                    insertStatement.setString(2, name);
                    insertStatement.setString(3, phoneNumber);
                    insertStatement.setString(4, address);
                    insertStatement.setDouble(5, salary);

                    int rowsAffected = insertStatement.executeUpdate();

                    if (rowsAffected == 1) {
                        System.out.println("\n1 Row Affected");
                    } else {
                        System.out.println("Error in inserting record");
                    }
                    break;
               case 2: // Delete
                    System.out.println("Enter the id you want to delete:");
                    int idToDelete = scanner.nextInt();

                    deleteStatement.setInt(1, idToDelete);

                    int rowsDeleted = deleteStatement.executeUpdate();

                    if (rowsDeleted == 1) {
                        System.out.println("1 row deleted");
                    } else {
                        System.out.println("Error in deleting record");
                    }
                    break;

                case 3: // Update
                    System.out.println("Enter the name you want to update:");
                    String newName = scanner.next();

                    System.out.println("Enter existing id:");
                    int existingId = scanner.nextInt();

                    updateStatement.setString(1, newName);
                    updateStatement.setInt(2, existingId);

                    int rowsUpdated = updateStatement.executeUpdate();

                    if (rowsUpdated == 1) {
                        System.out.println("1 row updated");
                    } else {
                        System.out.println("Error in updating record");
                    }
                    break;

                case 4: // View
                    ResultSet rs = selectStatement.executeQuery();

                    while (rs.next()) {
                        System.out.println("id: " + rs.getInt(1) + "\nname: " + rs.getString(2) + "\nphone no: " + rs.getString(3) + "\nAddress: " + rs.getString(4) + "\nsalary: " + rs.getDouble(5));
                    }
                    break;

                case 5: // Exit
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

        c.close();
        insertStatement.close();
        deleteStatement.close();
        updateStatement.close();
        selectStatement.close();
    }
}

