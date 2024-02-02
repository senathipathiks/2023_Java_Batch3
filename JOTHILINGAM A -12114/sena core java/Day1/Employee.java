package Day1;

public class Employee {
	
	private int empID;
	private String Name;
	private String role;
	private int salary;
	private int age;
	

  public Employee(int empID, String name, String role, int salary, int age) {
		super();
		this.empID = empID;
		Name = name;
		this.role = role;
		this.salary = salary;
		this.age = age;
	}

void dispalayEmp() {
	  System.out.println("Employee Details");
	  System.out.println("---------------------");
	  System.out.println("Employee ID    :" + empID);
	  System.out.println("Name           :" + Name);
	  System.out.println("Role           :" + role);
	  System.out.println("salary         :" + salary);
	  System.out.println("Age            :" + age);
  }

public static void main(String[] args) {
		
		Employee e1 =new  Employee(101,"jothi","manager",25000,25);
		e1.dispalayEmp();

	}

}
