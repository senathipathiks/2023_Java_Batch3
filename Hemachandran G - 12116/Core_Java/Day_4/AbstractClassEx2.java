package Day_4;

abstract class Employee1{
	int no;
	String name;
	int payperday;
	void read_Emp(int eno, String name, int pay) {
		this.no=eno;
		this.name=name;
		payperday=pay;
	}
	
	void display() {
		System.out.println("Employee No : " + no+" "+" Employee Name : "+name);
		
	}
	
	abstract void calculateSalary();
	
}

class Contract extends Employee1{
	int days;
	void read_Contract(int no, String name, int pay, int days) {
		super.read_Emp(no, name, pay);
		this.days=days;
	}
	
	void calculateSalary() {
		System.out.println("Salary is :"+(days*payperday));
	}
}

class FullTime extends Employee1{
	
	int days;
	void read_FullTime(int no, String name, int pay, int days) {
		super.read_Emp(no, name, pay);
		this.days=days;
	}
	
	void calculateSalary() {
		System.out.println("Salary is :"+(days*payperday));
	}
	
}

public class AbstractClassEx2 {

	public static void main(String[] args) {
		
		Contract e = new Contract();
		System.out.println("The Contract Employee Data ");
		e.read_Contract(101, "Heram", 550,30);
		e.display();
		e.calculateSalary();
		
		FullTime f = new FullTime();
		System.out.println("The FullTime Employee Data ");
		f.read_FullTime(121,"Hero",600, 28);
		f.display();
		f.calculateSalary();
		

	}

}
