package com.assosiate.hiber.HiberMapping;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="EmployeeBean")
public class EmployeeBean {
    @Id
	private int eroll;
    private String ename;
    
    // one to one rel make a rel btw 2 tables, in attributes target value is not madatory but cascade attri is important one
    //bcoz if any changes made in child table it could be affect in associate table 
    
    @OneToOne(targetEntity = LaptopBean.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "lid")   // foreign key
    private LaptopBean l1;
    
    public EmployeeBean() {
		super();
	}

	public EmployeeBean(int eroll, String ename, LaptopBean l1) {
		super();
		this.eroll = eroll;
		this.ename = ename;
		this.l1 = l1;
	}

	public int getEroll() {
		return eroll;
	}

	public void setEroll(int eroll) {
		this.eroll = eroll;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public LaptopBean getL1() {
		return l1;
	}

	public void setL1(LaptopBean l1) {
		this.l1 = l1;
	}

	@Override
	public String toString() {
		return "EmployeeBean [eroll=" + eroll + ", ename=" + ename + ", l1=" + l1 + "]";
	}
    
    
	
}
