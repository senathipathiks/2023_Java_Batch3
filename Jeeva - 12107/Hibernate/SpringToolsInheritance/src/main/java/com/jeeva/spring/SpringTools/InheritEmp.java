package com.jeeva.spring.SpringTools;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value="InheritEmp")
public class InheritEmp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int eRoll;
	private String eName;
		
	public InheritEmp() {
		super();
	}

	public InheritEmp(int eRoll, String eName) {
		super();
		this.eRoll = eRoll;
		this.eName = eName;
	
	}

	@Override
	public String toString() {
		return "Employees [eRoll=" + eRoll + ", eName=" + eName + "]";
	}
	
	
	

}