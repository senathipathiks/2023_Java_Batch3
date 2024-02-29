package setandconsInjection;

import java.util.List;

public class AddStudent {

	private int studentId;
	private String studentName;
	private List<Address> studentAddress;
		
	
	public AddStudent() {
		super();
	}


	public AddStudent(int studentId, String studentName, List<Address> studentAddress) {
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


	public List<Address> getStudentAddress() {
		return studentAddress;
	}


	public void setStudentAddress(List<Address> studentAddress) {
		this.studentAddress = studentAddress;
	}


	public void display() {
		System.out.print("studentId=" + studentId +"\n"+ "studentName=" + studentName +"\n");
		for (Address string : studentAddress) {
			System.out.println(string);
		}
	}
	
}
