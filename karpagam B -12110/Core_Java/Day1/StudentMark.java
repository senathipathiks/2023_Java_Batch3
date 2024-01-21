package Com.Day1;

class StudentMark {
	private int stuID;
	private String studName;
	private String dept;
	private String gender;
	private int Mark1;
	private int Mark2;
	private int Mark3;
	private int avg;
	public StudentMark(int stuID, String studName, String dept, String gender, int mark1, int mark2, int mark3 ) {
		super();
		this.stuID = stuID;
		this.studName = studName;
		this.dept = dept;
		this.gender = gender;
		Mark1 = mark1;
		Mark2 = mark2;
		Mark3 = mark3;
		
	}
	void displayStudentGrade() {
		System.out.println("Student ID :" +stuID);
		System.out.println("Student Name :" +studName);
		System.out.println("Student Deparment :" +dept);
		System.out.println("Student Gender :" +gender);
		System.out.println("student mark 1:" +Mark1);
		System.out.println("Student mark 2:" +Mark2);
		System.out.println("Student mark 3:" +Mark3);
		avg=(Mark1+Mark2+Mark3)/3;
		
		System.out.println("Average is: "+ avg);
		if (avg>=220) {
			System.out.println("Student Grade is A");
		}
		else if(avg>=100 && avg<220) {
			System.out.println("Student Grade is B");

		}
		else {
			System.out.println("Student Grade is C");
			}
		}

	

	public static void main(String[] args) {
		StudentMark obj1=new StudentMark(123,"kaviya","CSE","Female",91,87,35);
		obj1.displayStudentGrade();

	}

}
