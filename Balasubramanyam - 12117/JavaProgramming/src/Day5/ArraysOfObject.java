package Day5;
import java.util.*;
class Employee{
	private int eno;
	private String name;
	void getdata(int e ,String n) {
		eno=e;
		name=n;
	}
	void displayData() {
		System.out.println("\nEmployee Details: ");
		System.out.println("\nEmployee No: "+eno);
		System.out.println("Employee Name: "+name);
	}
}
public class ArraysOfObject {
	public static void main(String[] args) {
		Employee[] emp = new Employee[10];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<2; i++) {
		    emp[i] = new Employee(); //invoke the new constructor
		    
		    System.out.println("Enter the employee number:");
		    int n = sc.nextInt();
		    
		    sc.nextLine(); // consume the newline character
		    
		    System.out.println("Enter the employee name: ");
		    String s = sc.nextLine();
		    
		    emp[i].getdata(n, s);
		}
		for(int i=0; i<2; i++) {
		    emp[i].displayData();
		}


	}

}
