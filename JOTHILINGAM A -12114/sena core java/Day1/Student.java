package Day1;

public class Student {

	private int studID;
	private String studName;
	private String dept;
	private String gender;
	private int m1;
	private int m2;
	private int m3;
	
	// constructor
	public Student() {
		
	}	
		public Student(int studID, String studName, String dept, String gender, int m1, int m2, int m3) {
		super();
		this.studID = studID;
		this.studName = studName;
		this.dept = dept;
		this.gender = gender;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	void calc() {
		int total=m1+m2+m3;
		double avg=total/3;
		System.out.println("Student mark 1    : " + m1);
		System.out.println("Student mark 2    : " + m2);
		System.out.println("Student mark 3    : " + m3);
		System.out.println("Total Marks       :"+total);
		System.out.println("Avg marks :"+avg);
		
		
		if(avg>90)
		{
			System.out.println("Grade A:");
		}
		else if(avg>70 && avg <80 ) {
			System.out.println("Grade B:");
		}
		else if(avg>50 && avg <69) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Fail!!!!");
			
		}
		
	}


	void displayStudent() {
		System.out.println("Student ID        : "+ studID);
		System.out.println("Student Name      : "  + studName);
		System.out.println("Student department: " + dept);
		System.out.println("Student gender    : " + gender);
		
		
		
	}
	public static void main(String[] args) {
//		Student s1=new Student(101,"jothi","mca","male",60,45,90);
//		s1.displayStudent();
		
//		Student s2=new Student(101,"jothi","mca","male",60,45,90);
//		s2.displayStudent();
//		s2.calc();
		
		Student s3=new Student(101,"jothi","mca","male",90,45,90);
		s3.displayStudent();
		s3.calc(); 
		
	}	

}
