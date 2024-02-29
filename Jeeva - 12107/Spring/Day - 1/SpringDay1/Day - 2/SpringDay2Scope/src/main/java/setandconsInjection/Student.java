package setandconsInjection;

import java.util.List;

public class Student {
	
	private int studentId;
	private String studentName;
	private List<String> studentAddress;
		
	
	public Student() {
		super();
	}


	public Student(int studentId, String studentName, List<String> studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public List<String> getStudentAddress() {
		return studentAddress;
	}


	public void setStudentAddress(List<String> studentAddress) {
		this.studentAddress = studentAddress;
	}


	
	
	public void Display() {
		System.out.print("studentId=" + studentId +"\n"+ "studentName=" + studentName +"\n"+"studentAddress=");
		for (String string : studentAddress) {
			System.out.print(string);
		}
	}
		
	}
	
	


