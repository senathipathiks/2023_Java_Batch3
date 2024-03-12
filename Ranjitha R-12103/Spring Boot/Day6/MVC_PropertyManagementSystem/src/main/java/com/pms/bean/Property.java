package com.pms.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Property_tbl")
public class Property {
@Id
	private int PropId;
	private String PropName;
	private String PropType;
	private String City;
	private String Country;
	private String YearOfPurchase;
	private String Seller;

	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Property(int propId, String propName, String propType, String city, String country, String yearOfPurchase,
			String seller) {
		super();
		PropId = propId;
		PropName = propName;
		PropType = propType;
		City = city;
		Country = country;
		YearOfPurchase = yearOfPurchase;
		Seller = seller;
	}

	public int getPropId() {
		return PropId;
	}

	public void setPropId(int propId) {
		PropId = propId;
	}

	public String getPropName() {
		return PropName;
	}

	public void setPropName(String propName) {
		PropName = propName;
	}

	public String getPropType() {
		return PropType;
	}

	public void setPropType(String propType) {
		PropType = propType;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getYearOfPurchase() {
		return YearOfPurchase;
	}

	public void setYearOfPurchase(String yearOfPurchase) {
		YearOfPurchase = yearOfPurchase;
	}

	public String getSeller() {
		return Seller;
	}

	public void setSeller(String seller) {
		Seller = seller;
	}

	@Override
	public String toString() {
		return "Property [PropId=" + PropId + ", PropName=" + PropName + ", PropType=" + PropType + ", City=" + City
				+ ", Country=" + Country + ", YearOfPurchase=" + YearOfPurchase + ", Seller=" + Seller + "]";
	}

}
