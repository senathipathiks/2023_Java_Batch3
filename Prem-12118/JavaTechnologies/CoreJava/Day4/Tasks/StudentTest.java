package Day4.Tasks;
class Student {
    void study() {
        System.out.println("Student is studying...");
    }
}

class Mark extends Student {
    void recordMarks() {
        System.out.println("Recording student marks...");
    }
}

class Result extends Mark {
    void calculateResult() {
        System.out.println("Calculating student result...");
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.study();

        System.out.println();

        Mark mark = new Mark();
        mark.study();
        mark.recordMarks();

        System.out.println();

        Result result = new Result();
        result.study();
        result.recordMarks();
        result.calculateResult();
    }
}
