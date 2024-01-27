package Day5;
abstract class Employee1{
	int eno;
	String name;
	int Payperday;
	void Emp(int eno,String name,int p) {
		this.eno=eno;
		this.name=name;
		this.Payperday=p;
	}
	void display() {
		System.out.println("Employee No : "+eno+"\nEmployee Name : "+name);
	}
	abstract void calculatesalary();
}
class Contract extends Employee1{
	int days;
	void contract(int eno,String name,int p,int days ) {
		super.Emp(eno, name, p);
		this.days=days;
	}

	void calculatesalary() {
		System.out.println("Salary is : "+(days*Payperday));
	}
}
class Fulltime extends Employee1{
	int days;
	void fulltime(int eno,String name,int p,int days ) {
		super.Emp(eno, name, p);
		this.days=days;
	}
	
	void calculatesalary() {
		System.out.println("Salary is : "+(days*Payperday));
	}
}
public class Employees {
	public static void main(String[] args) {
		Contract e = new Contract();
	
		e.contract(101, "Dharshan", 1000, 30);
		e.display();
		e.calculatesalary();
		
		Fulltime e1 = new Fulltime();
	
		e1.fulltime(101, "Bala", 1000, 30);
		e1.display();
		e1.calculatesalary();
		
	}

}
