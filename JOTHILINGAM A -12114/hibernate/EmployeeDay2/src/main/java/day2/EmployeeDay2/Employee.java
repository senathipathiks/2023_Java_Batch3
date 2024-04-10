package day2.EmployeeDay2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee1")
public class Employee {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)      // its automated creation id
	private int eid;
	@Column(name = "name")// it is no need sepcify the column name ,automatically created the columns
	private String name;
	
	@Column(name = "designation")
	private String Designation;

	public Employee(int eid, String name, String designation) {
		super();
		this.eid = eid;
		this.name = name;
		Designation = designation;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", Designation=" + Designation + "]";
	}
	
	
	
	
}
