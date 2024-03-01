package com.Springautowiredannotation.Springautowiredannotation;

import org.springframework.stereotype.Component;

@Component //component is used for class method.
public class Parent {
	
private String fatherName;
private String motherName;
public String getFatherName() {
	return fatherName;
}
public void setFatherName(String fatherName) {
	this.fatherName = fatherName;
}
public String getMotherName() {
	return motherName;
}
public void setMotherName(String motherName) {
	this.motherName = motherName;
}
@Override
public String toString() {
	return "Parent [fatherName=" + fatherName + ", motherName=" + motherName + "]";
}



}
