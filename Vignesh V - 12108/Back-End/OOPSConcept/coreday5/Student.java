package CoreTopic;

public class Student {
    private int stuID;
    private String studName;
    private String dept;
    private String gender;
    //constructor
    Student (int stuID, String studName, String dept, String gender)
    {
        this.stuID = stuID;
        this.studName = studName;
        this.dept = dept;
        this.gender = gender;
        
    }
    void displayStudent()
    {
        System.out.println("student ID is " +stuID);
        System.out.println("student ID is " +studName);
        System.out.println(studName+ " department  is " +dept);
        System.out.println("student's gender is " +gender);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Student obj = new Student(123, "vignesh", "Engineering", "Male");
        obj.displayStudent();
    }

}

