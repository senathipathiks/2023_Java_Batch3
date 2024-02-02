package Day5;

abstract class Employee1{
	int eNO;
	String name;
	int payperday;
	void read_Emp(int eno,String name,int pay) {
		this.eNO =eno;
		this.name=name;
		payperday=pay;
	}
	void display() {
		System.out.println("Employye No : "+eNO+ "Employee Name : "+name);
		
	}
	abstract void calculateSalary();
}



class contract extends Employee1{
	int days;
	void read_contract(int eNO,String name,int pay,int days) {
		super.read_Emp(eNO, name, pay);
		this.days=days;
	}
	
	@Override
	void calculateSalary() {
		System.out.println("Salary is : "+ (days*payperday));
		
	}

}

class Fulltime extends Employee1{
	
	
	int days;
	void read_Fulltime(int eNO,String name,int pay,int days) {
		super.read_Emp(eNO, name, pay);
		this.days=days;
	}
	@Override
	void calculateSalary() {
		
		System.out.println("Salary is : "+ (days*payperday));
	}
}


public class MainEmployee {

	public static void main(String[] args) {
		
		Fulltime f=new Fulltime();
		f.read_Fulltime(101, "Jothi", 1000, 10);
		f.calculateSalary();
		
		
		contract c=new contract();
		c.read_contract(102, "jeeva", 150, 200);
		c.calculateSalary();
		
		
		
		
		
		
	}

}
