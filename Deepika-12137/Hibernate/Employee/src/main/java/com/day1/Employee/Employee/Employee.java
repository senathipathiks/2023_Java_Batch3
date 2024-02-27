package com.day1.Employee.Employee;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Emp")
public class Employee {
	
      @Id	
      private int eroll;
      private String enmae;
      
      @OneToOne(targetEntity =Laptop.class, cascade= CascadeType.ALL)
      @JoinColumn
      private Laptop l1;
      
      
    public Employee() {
    	super();
    }
    
	public Employee(int eroll, String enmae, Laptop l1) {
		super();
		this.eroll = eroll;
		this.enmae = enmae;
		this.l1=l1;
	}

	public int getEroll() {
		return eroll;
	}

	public void setEroll(int eroll) {
		this.eroll = eroll;
	}

	public String getEnmae() {
		return enmae;
	}

	public void setEnmae(String enmae) {
		this.enmae = enmae;
	}

	public Laptop getL1() {
		return l1;
	}

	public void setL1(Laptop l1) {
		this.l1 = l1;
	}
      
      
}
