package Day5.ClassExamples;
import java.util.*;

class Employee{
	int empno;
	String name;
	public void getData(int no , String nam)
	{
		empno=no;
		name=nam;
	}
	void display() {
		System.out.println("No:"+empno);
		System.out.println("Name:"+name);
	}
}

public class ArrayOfObject {

	public static void main(String[] args) {
		 Employee[] emp =new Employee[10];
		 Scanner sc=new Scanner(System.in);
		 for(int i=0;i<3;i++)
		 {
			 emp[i]=new Employee();
			 int n=sc.nextInt();
			 String fn=sc.next();
			 emp[i].getData(n,fn);
			 
		 }
		 for (int i = 0; i <3; i++) {
			emp[i].display();
		}
	}

}
