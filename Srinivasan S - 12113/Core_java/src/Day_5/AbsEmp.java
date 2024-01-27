package Day_5;

abstract class Employee1{
	 int empId,days,payperDay;
	 String name,designation;
	 
	 void readEmp(int empId,String name,String designation,int days,int payperDay) {
		this.empId=empId;
		this.name=name;
		this.designation=designation;
		this.days=days;
		this.payperDay=payperDay;
	 }
	 
	 void display() {
		 System.out.println("Employee id is "+empId);
		 System.out.println("Employee name is "+name);
		 System.out.println("Employee designation is "+designation);
		 
	 }
	 
	 abstract void calSal();
}

class Contract extends Employee1{
	
	void read_contract(int empId,String name,String designation,int days,int payperDay) {
		super.readEmp(empId, name, designation, days, payperDay);
	}
	@Override
	void calSal() {
		
		System.out.println("Salary of the emp is "+(days*payperDay));
		System.out.println("---------------------");
		
	}
	
}

class Fulltime extends Employee1{

	void read_fulltime(int empId,String name,String designation,int days,int payperDay) {
		super.readEmp(empId, name, designation, days, payperDay);
	}
	@Override
	void calSal() {
		System.out.println("Salary of the emp is "+(days*payperDay));	
		System.out.println("---------------------");
	}
	
}

public class AbsEmp {

	public static void main(String[] args) {
		Contract e1=new Contract();
		e1.read_contract(1,"Adam", "Dev",24 ,500);
		e1.display();
		e1.calSal();
		
		Fulltime e2=new Fulltime();
		e2.read_fulltime(101,"Srinivas","Developer", 28, 1000);
		e2.display();
		e2.calSal();
	}

}
