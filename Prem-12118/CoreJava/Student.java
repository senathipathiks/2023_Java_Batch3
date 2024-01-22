package Day1;

public class Student {
  
		private int studID;
		private String studName;
		private String dept;
		private String gender;
		
		Student(int studID,String studName,String dept, String gender ){
			this.studID=studID;
			this.studName=studName;
			this.dept=dept;
			this.gender=gender;
	}
		void displayStudent() {
			System.out.println("Student ID"+ studID);
			System.out.println("Student Name"+ studName);
			System.out.println("Department"+ dept);
			System.out.println("Gender"+ gender);
		}

		
	public static void main (String s[]){
		Student s1 =new Student(123,"Arun","Cse","Male");
		s1.displayStudent();
				}
}
