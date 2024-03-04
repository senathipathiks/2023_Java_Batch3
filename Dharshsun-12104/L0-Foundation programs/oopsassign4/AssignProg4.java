package com.oopsassign4;

//program to determine salary of manager and programmer
//Base class Employee
class Employee {
 public String name;
 public String role;

 public Employee(String name, String role) {
     this.name = name;
     this.role = role;
 }

 public String getName() {
     return name;
 }

 public String getRole() {
     return role;
 }

 public double calculateSalary() {
     return 0.0;
 }
}

//Subclass Manager
class Manager extends Employee {
 public double baseSalary;
 public double bonus;

 public Manager(String name, double baseSalary, double bonus) {
     super(name, "Manager");
     this.baseSalary = baseSalary;
     this.bonus = bonus;
 }

 @Override
 public double calculateSalary() {
     return baseSalary + bonus;
 }
}

//Subclass Programmer
class Programmer extends Employee {
 public double baseSalary;
 public double overtimePay;

 public Programmer(String name, double baseSalary, double overtimePay) {
     super(name, "Programmer");
     this.baseSalary = baseSalary;
     this.overtimePay = overtimePay;
 }

 @Override
 public double calculateSalary() {
     return baseSalary + overtimePay;
 }
}



public class AssignProg4 {
	public static void main(String[] args) {
        Employee emp1 = new Manager("Naveen", 7500.0, 1500.0);//(name,base pay,bonus)
        Employee emp2 = new Programmer("Dharshsun", 5000.0, 600.0);//(name,salary,overtimepay)
        Employee emp3 = new Programmer("Loki", 6000.0, 600.0);//(name,salary,overtimepay)

        System.out.println("Manager: " + emp1.getName() + "\nRole: " + emp1.getRole() + "\nSalary: " + emp1.calculateSalary());
        System.out.println("\nProgrammer: " + emp2.getName() + "\nRole: " + emp2.getRole() + "\nSalary: " + emp2.calculateSalary());
        System.out.println("\nProgrammer: " + emp3.getName() + "\nRole: " + emp3.getRole() + "\nSalary: " + emp3.calculateSalary());
    }
}


