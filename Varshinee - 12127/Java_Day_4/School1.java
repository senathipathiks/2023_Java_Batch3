package Java_Day_4;


//Write a Java program to create a class called "School" with attributes for students, teachers, and classes, and methods to add and remove students and teachers, and to create classes.



import java.util.ArrayList;

class School{
	ArrayList<String> students;
	ArrayList<String> teacher;
	ArrayList<String> classes;
	
	School(){
		this.students= new ArrayList<String>();
		this.teacher= new ArrayList<String>();
		this.classes= new ArrayList<String>();
		
	}
	
	void addStudent() {
		System.out.println("Student Names are Added to the List: ");
		students.add("Varshi");
		students.add("Sowmi");
		students.add("Ranjitha");
		students.add("Karpagam");
		System.out.println(students);
	}
	
	void addTeacher() {
		System.out.println("Teachers Names are Added to the List: ");
		teacher.add("Vino");
		teacher.add("Sherin");
		teacher.add("Deepika");
		teacher.add("Durgesh");
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

public class School1 {

	public static void main(String[] args) {
		School obj = new School();
		obj.addStudent();
		obj.addTeacher();
		obj.removeStudent();
		obj.removeTeacher();
		obj.createClasses();
		

	}

}
