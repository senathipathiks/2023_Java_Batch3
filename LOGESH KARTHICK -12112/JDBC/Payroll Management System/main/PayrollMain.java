package com.ms.main;

import java.util.Scanner;

import com.ms.bean.PayrollClass;

import com.ms.dao.PayrollDAO;

import java.sql.*;

public class PayrollMain {



	static Scanner sc=new Scanner(System.in);
	
	public static int displaymenu()
	{
		System.out.println("1.Insert  2.Delete  3.Update   4.Find  5.FindAll  6.Exit");
		System.out.println("Enter your Choice");
		int choice=sc.nextInt();
		return choice;
	}
	
	public static PayrollClass insertPayroll()
	{
		System.out.println("Enter the payroll id,payroller name,payroller id,payroller basic,payroller HRA,payroller DA,Payroller TA,payroller CTC");
		return new PayrollClass(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextFloat(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextFloat());
	}
	public static int deletePayroll()
	{
		System.out.println("Enter the payroll ID to delete ");
		return (sc.nextInt());
	}
	public static PayrollClass updatePayroll()
	{

		System.out.println("Enter the payroll id,payroller name,payroller id,payroller basic,payroller HRA,payroller DA,Payroller TA,payroller CTC");
		return new PayrollClass(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextFloat(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextFloat());
	}

	public static int  findPayroll()
	{
		System.out.println("enter the payroll id to view");
		return (sc.nextInt());
	}
		
	

public static void main(String[] args) throws SQLException {
	// TODO Auto-generated method stub
	// TODO Auto-generated method stub
	String msg=" ";
	int n;
	PayrollDAO dao=new PayrollDAO();
	do {
		switch(displaymenu())
		{
		case 1:
			PayrollClass p1=insertPayroll();
			n=dao.insertPayrollClass(p1);
			if(n==1)
				System.out.println("Record Inserted Successfully");
			else
				System.out.println("Record Insertion Failure");
			break;
			
		
			
	case 2:
		
		int pid=deletePayroll();
		n=dao.deletePayrollt(pid);
		if(n==1)
			System.out.println("Record Deleted Successfully");
		else
			System.out.println("Record Deletion Failure");
		break;
		
		
		 
	case 3:
	  
		PayrollClass p2=updatePayroll();
		n=dao.updatePayrollClass(p2);
		if(n==1)
			System.out.println("Record Updated Successfully");
		else
			System.out.println("Record Updation success ");
		break;
		
	case 4:
		
		int pp1= findPayroll();
		ResultSet rs = dao.findPayroll(pp1);
		while(rs.next())
		{
			System.out.println("Payroll  no: "+ rs.getInt(1)+"\n :"+ rs.getString(2)+ "\npayroll name :"+ rs.getInt(3)+"\n emp id :"+rs.getFloat(4)+"\n basic"+rs.getInt(5)+"\n payroller Hra"+rs.getInt(6)+"\n payroller DA"+rs.getInt(7)+"\n payroller TA"+rs.getFloat(8)+"\n Payroller CTC");
		}
		break;
		
		}
		
		
		
		
	
		System.out.println("Do you wish to continue(yes/no)");
	  msg=sc.next();
	 
	 
	  
	  
	
	} while(msg.equals("yes"));
}

}

			
			
			
			
			
			
			