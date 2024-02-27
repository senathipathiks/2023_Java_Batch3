package com.sampleofsat.mavenproj;

public class Person {
	String perName;
	int perAge;
	long perMobileno;
	String perAddress;
	public Person(String perName, int perAge, long perMobileno, String perAddress) {
		super();
		this.perName = perName;
		this.perAge = perAge;
		this.perMobileno = perMobileno;
		this.perAddress = perAddress;
	}
	public String getPerName() {
		return perName;
	}
	public void setPerName(String perName) {
		this.perName = perName;
	}
	public int getPerAge() {
		return perAge;
	}
	public void setPerAge(int perAge) {
		this.perAge = perAge;
	}
	public long getPerMobileno() {
		return perMobileno;
	}
	public void setPerMobileno(long perMobileno) {
		this.perMobileno = perMobileno;
	}
	public String getPerAddress() {
		return perAddress;
	}
	public void setPerAddress(String perAddress) {
		this.perAddress = perAddress;
	}
	
	

}
