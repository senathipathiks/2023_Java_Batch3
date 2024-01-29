package day2oops;

import java.util.Scanner;

interface PersonalInfo{
	void bioData(String name,String age);
}
interface CollegeInfo{
	void adress(String collegeName,String adddress);
}
class Student implements PersonalInfo,CollegeInfo{
//	String collegeName;
//	String adddress;
	
	public void adress(String collegeName,String adddress) {
		// TODO Auto-generated method stub
		System.out.println(collegeName);
		System.out.println(adddress);
		
	}

	
	public void bioData(String name,String age) {
		// TODO Auto-generated method stub
		System.out.println(name);
		System.out.println(age);
		
	}
	
}
public class StudentInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.adress("kamaraj college","Near vishnu house");
		s.bioData("Kiruba","22");
		Scanner sc=new Scanner(System.in);
		
//		int s=sc.nextInt();
		

	}

}
