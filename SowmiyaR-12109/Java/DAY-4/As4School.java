package Day4;
//5. Write a Java program to create a class called "School" with 
//attributes for students, teachers, and classes, and methods to add and
//remove students and teachers, and to create classes.
import java.util.ArrayList;

class Schl{
	ArrayList<String> students;
	ArrayList<String> teacher;
	ArrayList<String> classes;
	
	Schl(){
		this.students= new ArrayList<String>();
		this.teacher= new ArrayList<String>();
		this.classes= new ArrayList<String>();
		
	}
	
	void addStudent() {
		System.out.println("Student Names are Added to the List: ");
		students.add("Sowmi");
		students.add("Ranji");
		students.add("Vino");
		students.add("Varsh");
		System.out.println(students);
	}
	
	void addTeacher() {
		System.out.println("Teachers Names are Added to the List: ");
		teacher.add("Malar");
		teacher.add("Kaviya");
		teacher.add("Magesh");
		teacher.add("Ram");
		System.out.println(teacher);
	}
	void removeStudent() {
		System.out.println("Students Removed List: ");
	     students.remove(0);
		System.out.println(students);
	}
	void removeTeacher() {
		System.out.println("Teacher Removed List: ");
		teacher.remove(1);
		System.out.println(teacher);
	}
	void createClasses() {
		System.out.println("Classes are Created: ");
		classes.add("I");
		classes.add("II");
		classes.add("III");
		classes.add("IV");
		System.out.println(classes);
	}
	
	
}

public class As4School {

	public static void main(String[] args) {
		Schl obj = new Schl();
		obj.addStudent();
		obj.addTeacher();
		obj.removeStudent();
		obj.removeTeacher();
		obj.createClasses();
		

	}

}
