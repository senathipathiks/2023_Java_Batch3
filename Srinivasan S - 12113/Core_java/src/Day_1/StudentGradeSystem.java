package Day_1;

import java.util.Scanner;


public class StudentGradeSystem {
	int stuid,tammark,engmark,matmark,scimark,socmark;
	String stuname;
	double average;

	void details() {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Student id:");
	 stuid=sc.nextInt();
	
	System.out.println("Enter Student name:");
	 stuname=sc.next();
	
	System.out.println("Enter Tamil mark:");
	 tammark=sc.nextInt();
	 
	System.out.println("Enter English mark:");
	 engmark=sc.nextInt();
	 
	System.out.println("Enter Maths mark:");
	 matmark=sc.nextInt();
	 
	System.out.println("Enter Science mark:");
	 scimark=sc.nextInt();
	 
	System.out.println("Enter Social mark:");
	 socmark=sc.nextInt();
	
	average =(tammark+engmark+matmark+scimark+socmark)/5;
	System.out.println("The average mark is: "+average);
	
	if (average>90) {
		System.out.println(stuname+" scored A grade ");
		}
	else if (average>80 && average<90) {
		System.out.println(stuname+" scored B grade ");
	}
	else if (average>70 && average<80) {
		System.out.println(stuname+" scored c grade ");
	}
	else if(average>60 && average<70) {
		System.out.println(stuname+" scored D grade ");
	}
	else if(average>50 && average<60) {
		System.out.println(stuname+" scored E grade ");
	}
	else
		System.out.println(stuname+" scored F grade");
	}
	 
	
	
	

	public static void main(String[] args) {
		StudentGradeSystem sgs=new StudentGradeSystem();
		sgs.details();
		
	}

}
