package Java_Day_5;

abstract class Employee1{
	int eno;
	String name;
	int payperday;
	void read_emp(int eno,String name,int pay) {
		this.eno=eno;
		this.name=name;
		payperday=pay;
	}
	void dispaly() {
		System.out.println("Employee No: "+eno+" "+"Employee Name: " +name);
	}
	abstract void calculateSalary();
}

class Constract extends Employee1{
	int days;
	void read_Contract(int eno,String name,int pay,int days) {
		super.read_emp(eno, name, pay);
		this.days=days;
	}
	void calculateSalary() {
		System.out.println("Salary is : "+(days*payperday) );
	}
}
class FullTime extends Employee1{
	int days;
	void read_Fulltime(int eno,String name,int pay,int days) {
		super.read_emp(eno, name, pay);
		this.days=days;
	}
	void calculateSalary() {
		System.out.println("Salary is : "+ (days*payperday));
	}
}
public class AbstractEx2 {

	public static void main(String[] args) {
		FullTime obj1=new FullTime();
		obj1.read_Fulltime(123, "Varshi", 1000, 30);
		obj1.calculateSalary();
		
		Constract obj2=new Constract();
		obj2.read_Contract(123,"Varshi",1000, 15);
		obj2.calculateSalary();

	}

}
