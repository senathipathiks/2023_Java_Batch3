package com.rss.bean;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_User")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int usId;
	private String usName;
	private String usAge;
	private String usMob;
	
	private String usStart;
	private String usEnd;
	private String usStDate;
	private String usEnDate;
	
	@ManyToOne(targetEntity = Train.class, cascade = CascadeType.DETACH)
	@JoinColumn(name="trId")
	private Train trn;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int usId, String usName, String usAge, String usMob, String usStart, String usEnd, String usStDate,
			String usEnDate, Train trn) {
		super();
		this.usId = usId;
		this.usName = usName;
		this.usAge = usAge;
		this.usMob = usMob;
		this.usStart = usStart;
		this.usEnd = usEnd;
		this.usStDate = usStDate;
		this.usEnDate = usEnDate;
		this.trn = trn;
	}

	public int getUsId() {
		return usId;
	}

	public void setUsId(int usId) {
		this.usId = usId;
	}

	public String getUsName() {
		return usName;
	}

	public void setUsName(String usName) {
		this.usName = usName;
	}

	public String getUsAge() {
		return usAge;
	}

	public void setUsAge(String usAge) {
		this.usAge = usAge;
	}

	public String getUsMob() {
		return usMob;
	}

	public void setUsMob(String usMob) {
		this.usMob = usMob;
	}

	public String getUsStart() {
		return usStart;
	}

	public void setUsStart(String usStart) {
		this.usStart = usStart;
	}

	public String getUsEnd() {
		return usEnd;
	}

	public void setUsEnd(String usEnd) {
		this.usEnd = usEnd;
	}

	public String getUsStDate() {
		return usStDate;
	}

	public void setUsStDate(String usStDate) {
		this.usStDate = usStDate;
	}

	public String getUsEnDate() {
		return usEnDate;
	}

	public void setUsEnDate(String usEnDate) {
		this.usEnDate = usEnDate;
	}

	public Train getTrn() {
		return trn;
	}

	public void setTrn(Train trn) {
		this.trn = trn;
	}

	
	

}
