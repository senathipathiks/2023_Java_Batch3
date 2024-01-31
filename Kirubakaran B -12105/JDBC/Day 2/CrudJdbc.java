package day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;

class Execution  {
    Scanner sc=new Scanner(System.in);
    public void insert() throws SQLException{    //method for insert the data
        
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo1","root","root");
    //making connection
    String query="insert into emp values(?,?)";    //query for insertion
    
    PreparedStatement psr=c.prepareStatement(query);    //statement used to execute sql query
    
    System.out.println("Enter number of data to enter");
    int n=sc.nextInt();
    
    for (int i = 0; i <n; i++) {
        System.out.println("Enter id");
        int id=sc.nextInt();
        System.out.println("Enter name");
        String name=sc.next();
        psr.setInt(1, id);                    //getting id
        psr.setString(2, name);                //getting name
        psr.addBatch();                        //adding to batch in order to get multiple inputs from user
        
    }
    int []a=psr.executeBatch();                //executing the batch
    System.out.println(Arrays.toString(a));
    }
    
    public void read() throws SQLException{    //method for read the data
        Connection c1=DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo1","root","root");
        //making connection
        String query1="SELECT * FROM emp;";    //query for read the data
        
        PreparedStatement psr1=c1.prepareStatement(query1);     //statement used to execute sql query
        ResultSet rs=psr1.executeQuery();                        //statement used to execute sql query
        while(rs.next()) {
            System.out.println("Id : "+rs.getInt(1)+ "  Name : "+rs.getString(2));
        }
        
    }
    
    public void update() throws SQLException{    //method for update
        Connection c2=DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo1","root","root");
        //making connection
        String query2="UPDATE emp SET Empname= ? where (Empid = ?)";    //query for update the data
        
        PreparedStatement psr2=c2.prepareStatement(query2);
        
        System.out.println("Enter number of data to alter");
        int n=sc.nextInt();
        
        for (int i = 0; i <n; i++) {
            System.out.println("Enter name");
            sc.nextLine();
            String name=sc.nextLine();
            System.out.println("Enter id");
            int id=sc.nextInt();
            
            psr2.setString(1, name);            //getting name
            psr2.setInt(2, id);                    //getting id
            psr2.addBatch();                    //adding to batch in order to get multiple inputs from user
            
        }
        int []a=psr2.executeBatch();                //executing the batch
        System.out.println(Arrays.toString(a));
        
    }
    public void delete()throws SQLException{    // method for delete the data
        Connection c3=DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo1","root","root");
        //making connection
        
        String query3="DELETE FROM `Demo1`.`emp` WHERE (Empid = ?)";
        
        PreparedStatement psr3=c3.prepareStatement(query3);
        
        System.out.println("Enter number of data to alter");
        int n=sc.nextInt();
        
        for (int i = 0; i <n; i++) {
            
            System.out.println("Enter id");
            int id=sc.nextInt();
            
            psr3.setInt(1, id);                    //getting id
            psr3.addBatch();                    //adding to batch in order to get multiple inputs from user
            
        }
        int []a=psr3.executeBatch();                //executing the batch
        System.out.println(Arrays.toString(a));
        
    }    
        
}

public class CrudJdbc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo1","root","root");
	        Execution exe=new Execution();
	        
	        boolean flag=true;
	        while(flag) {
	            
	        System.out.println("*************** Welcome to Batch 3 ***************");            
	        System.out.println("1.Add data\n2.Update data\n3.Read data\n4.Delete data");
	        System.out.println("\nEnter the operation you want to perform");
	        int val=sc.nextInt();
	                
	        switch (val) {
	        case 1:
	            exe.insert();
	            break;
	        case 2:
	            exe.update();            
	            break;
	        case 3:
	            exe.read();
	            break;
	        case 4:
	            exe.delete();
	            break;
	        default:
	            System.err.println("Enter valid input");
	            break;
	        }
	        
	        System.out.println("Are you want to continue");
	        System.out.println("1.Yes\n2.No");
	        int opt=sc.nextInt();
	        if(opt==1) {
	            flag=true;
	        }
	        else
	            flag=false;
	            System.out.println("Thank You !");
	        }
	    }

	

	}

