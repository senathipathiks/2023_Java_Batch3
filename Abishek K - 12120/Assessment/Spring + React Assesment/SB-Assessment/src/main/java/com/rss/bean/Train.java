package com.rss.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_Train")
public class Train {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trId;
	private String trName;
	private String trNum;
	private String trYear;
	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Train(int trId, String trName, String trNum, String trYear) {
		super();
		this.trId = trId;
		this.trName = trName;
		this.trNum = trNum;
		this.trYear = trYear;
	}
	public int getTrId() {
		return trId;
	}
	public void setTrId(int trId) {
		this.trId = trId;
	}
	public String getTrName() {
		return trName;
	}
	public void setTrName(String trName) {
		this.trName = trName;
	}
	public String getTrNum() {
		return trNum;
	}
	public void setTrNum(String trNum) {
		this.trNum = trNum;
	}
	public String getTrYear() {
		return trYear;
	}
	public void setTrYear(String trYear) {
		this.trYear = trYear;
	}
	
	

}
