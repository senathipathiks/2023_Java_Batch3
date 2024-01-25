package Day5;
//ArrayofObject
import java.util.Scanner;

class Employee {
	int eNo;
	String name;

	void getdata(int no, String nam) {
		eNo = no;
		name = nam;
	}

	void display() {
		System.out.println("No:" + eNo);
		System.out.println("Name: " + name);
	}
}

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] emp = new Employee[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			emp[i] = new Employee();
			int n = sc.nextInt();
			String fn = sc.next();
			emp[i].getdata(n, fn);
		}
		for (int i = 0; i < 3; i++) {
			emp[i].display();
		}
//		Employee emp1=new Employee();
//		emp1.getdata(123, "Ram");
//		emp[0]=emp1;
//		emp[0].display();

	}

}
