package Day4.ClassExamples;

import java.util.*;

class StudentEx {
    int rollno;
    String name;

    StudentEx(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student[rollno=" + rollno + ", name=" + name + "]";
    }
}

class Mark extends StudentEx {
    int mark1, mark2, mark3;

    Mark(int no, String n, int m1, int m2, int m3) {
        super(no, n);
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    @Override
    public String toString() {
        return "Mark{Mark1=" + mark1 + ", Mark2=" + mark2 + ", Mark3=" + mark3 + ", " + super.toString() + "}";
    }
}

public class DemoClass {

    public static void main(String[] args) {

        Mark m = new Mark(007, "Prem", 70, 80, 90);
        System.out.println(m.toString());
    }
}


