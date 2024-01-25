package Day4;

//Employee,Manager


class Employee {
  void calsalary() {
      System.out.println("Employee salary");
  }
}

class Manager extends Employee {
  void calsalary() {
      System.out.println("Manager salary");
  }
}

public class AsEmpManager {

  public static void main(String[] args) {
      Employee obj1 = new Employee();
      obj1.calsalary();

      Employee obj2 = new Manager();
      obj2.calsalary();

  }

}
