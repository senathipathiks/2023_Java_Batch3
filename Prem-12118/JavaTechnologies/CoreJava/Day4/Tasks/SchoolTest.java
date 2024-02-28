package Day4.Tasks;
import java.util.ArrayList;
import java.util.List;

class School {
    private List<String> students;
    private List<String> teachers;
    private List<String> classes;

    public School() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.classes = new ArrayList<>();
    }

    public void addStudent(String student) {
        students.add(student);
        System.out.println("Student '" + student + "' added.");
    }

    public void removeStudent(String student) {
        if (students.contains(student)) {
            students.remove(student);
            System.out.println("Student '" + student + "' removed.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void addTeacher(String teacher) {
        teachers.add(teacher);
        System.out.println("Teacher '" + teacher + "' added.");
    }

    public void removeTeacher(String teacher) {
        if (teachers.contains(teacher)) {
            teachers.remove(teacher);
            System.out.println("Teacher '" + teacher + "' removed.");
        } else {
            System.out.println("Teacher not found.");
        }
    }

    public void createClass(String className) {
        classes.add(className);
        System.out.println("Class '" + className + "' created.");
    }

    public List<String> getStudents() {
        return students;
    }

    public List<String> getTeachers() {
        return teachers;
    }

    public List<String> getClasses() {
        return classes;
    }
}

public class SchoolTest {
    public static void main(String[] args) {
        School school = new School();

        // Add students
        school.addStudent("Student1");
        school.addStudent("Student2");

        // Remove a student
        school.removeStudent("Student3");

        // Add teachers
        school.addTeacher("Teacher1");
        school.addTeacher("Teacher2");

        // Remove a teacher
        school.removeTeacher("Teacher3");

        // Create classes
        school.createClass("Math");
        school.createClass("Science");

        // Display students, teachers, and classes
        System.out.println("\nStudents: " + school.getStudents());
        System.out.println("Teachers: " + school.getTeachers());
        System.out.println("Classes: " + school.getClasses());
    }
}
