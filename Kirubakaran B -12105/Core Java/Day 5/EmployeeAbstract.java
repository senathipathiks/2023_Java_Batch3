package day2oops;

abstract class Emp{
	int eno;
	String name;
	int perday;
	public void read(int eno, String name, int perday) {

		this.eno = eno;
		this.name = name;
		this.perday = perday;
	}
	void display() 
	{
		System.out.println("Employee no:"+eno+""+"Employeename"+name);
	}
	abstract void calculateSalary();
}
class Contract extends Emp
{
	int days;
	
	void readContract(int eno, String name, int perday,int days)
	{
		super.read(eno,name,perday);
		this.days=days;
	}

	void calculateSalary()
	{
		System.out.println("Salary is :"+(days*perday));
	}

}
class Fulltime extends Emp
{
	int days;
	void readFull(int eno, String name, int perday,int days)
	{
		super.read(eno,name,perday);
		this.days=days;
	}

	void calculateSalary(){
		System.out.println("Salary is :"+(days*perday));
	}

}
public class EmployeeAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fulltime f=new Fulltime();
		f.readFull(12, "prem", 1200,30);
		f.calculateSalary();
		Contract s=new Contract();
		s.readContract(1234, "premkumar", 1000,30);
		s.calculateSalary();


	}

}
