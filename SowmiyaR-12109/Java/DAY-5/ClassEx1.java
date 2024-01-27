package Day5;
//Array of object
import java.util.Scanner;

class Employee{
	int eNo;
	String name;
	
	Employee(){
		
	}
	void getdata(int no,String nam) {
		eNo=no;
		name=nam;
	}
	void display()
	{
		System.out.println("No: "+eNo);
		System.out.println("Name: "+name);
	}
}
public class ClassEx1 {

	public static void main(String[] args) {
		Employee[] emp=new Employee[10];
	
		Scanner sc=new Scanner(System.in);
//		Employee emp1=new Employee();
//		emp1.getdata(123, "sowmi");
//		emp1.display();
         for(int i=0;i<3;i++) {
        	 emp[i]=new Employee();
        	 int n=sc.nextInt();
        	 String fn=sc.next();
        	 emp[i].getdata(n, fn);
         }
         for(int i=0;i<3;i++)
         {
        	 emp[i].display();
         }

	}  

}
