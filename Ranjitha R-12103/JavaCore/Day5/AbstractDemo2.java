package Day5;

abstract class Employee1 {
	int eno;
	String name;
	int payperday;

	void read_Emp(int eno, String name, int pay) {
		this.eno = eno;
		this.name = name;
		payperday = pay;

	}

	void display() {
		System.out.println("Employee No:" + eno + "Employee name: " + name);
	}

	abstract void calculateSalary();

}

class Contract extends Employee1 {
	int days;

	void read_Contract(int eno, String name, int pay, int days) {
		super.read_Emp(eno, name, pay);
		this.days=days;
	}

	@Override
	void calculateSalary() {
		System.out.println("Salary is :" + (days * payperday));

	}
}

class FullTime extends Employee1 {
	int days;

	void read_Fulltime(int eno, String name, int pay, int days) {
		super.read_Emp(eno, name, pay);
		this.days = days;
	}

	@Override
	void calculateSalary() {
		System.out.println("Salary is: " + (days * payperday));

	}
}

public class AbstractDemo2 {

	public static void main(String[] args) {
		Contract obj1 = new Contract();
		obj1.read_Contract(123, "Ram", 1300, 28);
		obj1.calculateSalary();

		FullTime obj2 = new FullTime();
		obj2.read_Fulltime(456, "Raj", 1200, 30);
		obj2.calculateSalary();

	}

}
