package Day5.ClassExamples;
abstract class Employee1{
	int eno;
	String name;
	int payperday;
	void read_Emp(int eno,String name,int pay) {
		this.eno=eno;
		this.name=name;
		payperday=pay;
	}
	void display() {
		System.out.println("Employee No:"+eno+""+"Employeename:"+name);
	}
	abstract void calculateSalary();
}

class Contract extends Employee1 {
	int days;
	void read_Contract(int eno,String name,int perday,int days) {
		super.read_Emp(eno, name, days);
		this.days=days;
	}
	void calculateSalary() {
		System.out.println("Salary is :"+(days*payperday));
		
	}
}
class FullTime extends Employee1{
	int days;
	void read_FullTime(int eno,String name,int pay,int days) {
		super.read_Emp(eno, name, pay);
		this.days=days;
	}
	void calculateSalary() {
		System.out.println("Salary is:"+(days*payperday));
		
	}
}
public class AbstractEx2 {

	public static void main(String[] args) {
		 FullTime obj1=new FullTime();
		 obj1.read_FullTime(123,"Prem",1200,5);
		 obj1.calculateSalary();
		 
		 Contract obj2=new Contract();
		 obj2.read_Contract(432,"Abii", 3445,5);
		 obj2.calculateSalary();

	}

}
