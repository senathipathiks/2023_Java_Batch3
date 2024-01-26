package Day1;

public class StudentMark {
	private int stuid;
	private String stuName;
	private int maths;
	private int history;
	private int english;
	int Totalmarks;
	int Average;
	
	StudentMark(int stuid,String stuName,int maths,int history,int english){
		this.stuid=stuid;
		this.stuName=stuName;
		this.maths=maths;
		this.history=history;
		this.english=english;
	}
	void displayStudentdetails() {
		System.out.println("Student ID:"+stuid);
		System.out.println("Student Name:"+stuName);
	}
	void displaymarks() {
		Totalmarks=maths+history+english;
		System.out.println("Total Marks:"+Totalmarks);
		}
	void DisplayAverage() {
		Average=Totalmarks/3;
		System.out.println("Average marks:"+Average);
	}
	

	public static void main(String[] args) {
	 StudentMark s1=new StudentMark(1,"sowmi",50,80,40);
	 s1.displayStudentdetails();
	 s1.displaymarks();
	 s1.DisplayAverage();

	}

}
