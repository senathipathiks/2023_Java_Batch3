package Com.Day4;


class Employee {
	void CalculateSalary(){
		System.out.println("Employee");
		
	}
}
class Manager extends Employee{
		void CalculateSal(){
			System.out.println("Manager");
			
		}
		
	}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		 Manager obj1=new Manager();
		 obj1.CalculateSalary();
		 obj1.CalculateSal();
		 
	}

}
