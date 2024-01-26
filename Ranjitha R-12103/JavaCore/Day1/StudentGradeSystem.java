package Day1;

import java.util.Scanner;

class Students {

	private int s_id;
	private String s_name;
	private String gender;
	private String dept;

	private double mark1;
	private double mark2;
	private double mark3;

	public Students() {

	}

	Students(int s_id, String s_name, String gender, String dept) {
		this.s_id = s_id;
		this.s_name = s_name;
		this.gender = gender;
		this.dept = dept;
	}

	public void displayStudent() {
		System.out.println("Student id : " + s_id);
		System.out.println("Student name : " + s_name);
		System.out.println("Student dept : " + dept);
		System.out.println("Student gender : " + gender);
	}

	public char gradeCalc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Java marks");
		mark1 = sc.nextDouble();
		System.out.println("enter M1 marks");
		mark2 = sc.nextDouble();
		System.out.println("enter ReactJS marks");
		mark3 = sc.nextDouble();

		double grade = (mark1 + mark2 + mark3) / 3;

		if (grade > 90 && grade < 100) {
			return 'A';
		} else if (grade > 80 && grade < 90) {
			return 'B';
		} else if (grade > 70 && grade < 80) {
			return 'C';
		} else {
			return 'D';
		}

	}
}

public class StudentGradeSystem {

	public static void main(String[] args) {

		Students s1 = new Students(101, "Ranjitha", "Female", "CSE");

		System.out.println("Your Grade is : " + s1.gradeCalc());

	}

}
