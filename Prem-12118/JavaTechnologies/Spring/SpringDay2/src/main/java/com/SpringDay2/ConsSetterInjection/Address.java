package com.SpringDay2.ConsSetterInjection;

public class Address {
private int dNo;
private String sName;
private int pincode;

public Address(int dNo, String sName, int pincode) {
	super();
	this.dNo = dNo;
	this.sName = sName;
	this.pincode = pincode;
}

public Address() {
	super();
	// TODO Auto-generated constructor stub
}

public int getdNo() {
	return dNo;
}

public void setdNo(int dNo) {
	this.dNo = dNo;
}

public String getsName() {
	return sName;
}

public void setsName(String sName) {
	this.sName = sName;
}

public int getPincode() {
	return pincode;
}

public void setPincode(int pincode) {
	this.pincode = pincode;
}

@Override
public String toString() {
	return "Address [dNo=" + dNo + ", sName=" + sName + ", pincode=" + pincode + "]";
}


}
