package Com.Day5;

abstract class Employee1{
	int eno;
	String name;
	int payperday;
	void read_Emp(int eno,String name,int payperday)
	{
		this.eno=eno;
		this.name=name;
		this.payperday=payperday;
		}
	void display() {
		System.out.println(" Employee No:"+eno+"\n "+"Employee Name:"+name);
	}
	abstract void calculatesalary();
}

class contract extends Employee1{
	
	int days;
	void read_contract(int eno,String name,int payperday,int days) {
		super.read_Emp(eno, name, payperday);
		this.days=days;
	}
	@Override
	void calculatesalary() {
		System.out.println("Contract employee salary is:"+(days*payperday));
	}
	
}

class FullTime extends Employee1{
	
	int days;
	void read_FullTime(int eno,String name,int payperday,int days) {
		super.read_Emp(eno, name, payperday);
		this.days=days;
	}
	@Override
	void calculatesalary() {
		System.out.println("Full-time employee salary is:"+(days*payperday));
	}
	
}


public class AbstractClassEg {

	public static void main(String[] args) {
		
		contract obj1=new contract();
		obj1.read_contract(123, "kaviya",100, 10);
		obj1.calculatesalary();
		obj1.display();
	    System.out.println("----------------------------");
		FullTime obj2=new FullTime();
		obj2.read_FullTime(124, "rekha",200, 15);
		obj2.calculatesalary();
		obj2.display();
	    System.out.println("----------------------------");
	    Employee1 obj3=new contract();
		obj3.read_Emp(123, "Ravi", 150);
		obj3.display();
		
		
	}

}
