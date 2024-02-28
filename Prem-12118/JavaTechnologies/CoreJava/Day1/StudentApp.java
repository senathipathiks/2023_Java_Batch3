package Day1;

public class StudentApp {
	
	private int studID;
	private String studName;
	private String Clss;
	private String gender;
	private int marks1;
	private int marks2;
	private int marks3;
	private int Avg;
	
	StudentApp(int studID,String studName,String clas,String gender, int marks1,int marks2,int marks3){
		this.Clss=Clss;
		this.studID=studID;
		this.gender=gender;
		this.studName=studName;
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;			
	}
	void displayGrade() {
		System.out.println("Student ID:"+ studID);
		System.out.println("Student Name:"+ studName);
		System.out.println("Department:"+ Clss);
		System.out.println("Gender:"+ gender);
		Avg=(marks1+marks2+marks3)/3; 
		System.out.println("The Average marks scored"+ Avg);
		if(Avg > 80) {
			System.out.println("The Grade is A ");
		}
		else if (Avg < 80) {
			System.out.println("The Grade is B");	
		}
		else if (Avg < 60) {
			System.out.println("The Grade is C");
		}
		}
	
 	public static void main(String[] args) {
		 
 		StudentApp a1 =new StudentApp(232,"Prem","EEE","Male",89,90,99);
 		a1.displayGrade();

	}

}
