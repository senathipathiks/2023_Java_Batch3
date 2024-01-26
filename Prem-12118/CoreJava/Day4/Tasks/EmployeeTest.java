package Day4.Tasks;
class Employee {
    void work() {
        System.out.println("Employee is working...");
    }
}

class Manager extends Employee {
    void manageTeam() {
        System.out.println("Manager is managing the team...");
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.work();

        System.out.println();

        Manager manager = new Manager();
        manager.work();
        manager.manageTeam();
    }
}

