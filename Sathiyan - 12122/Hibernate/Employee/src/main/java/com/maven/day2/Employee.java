package com.maven.day2;
import javax.persistence.*;
 
@Entity
@Table(name="Emoloyee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	  private int empid;
	@Column(name="name")
	  private String empname;
	@Column(name="role")
	  private String emprole;
	@Column(name="pay")
	  private int salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String empname, String emprole, int salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.emprole = emprole;
		this.salary = salary;
	}
	
	public Employee(String empname, String emprole, int salary) {
		super();
		this.empname = empname;
		this.emprole = emprole;
		this.salary = salary;
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmprole() {
		return emprole;
	}
	public void setEmprole(String emprole) {
		this.emprole = emprole;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", emprole=" + emprole + ", salary=" + salary + "]";
	}

	}