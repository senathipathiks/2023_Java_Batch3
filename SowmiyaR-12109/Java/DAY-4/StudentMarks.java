package Day4;

class StudentE1 {
    int rollno;
    String name;

    StudentE1(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;

    }

    StudentE1() {

    }

    public String toString() {
        return "Student [roolno=" + rollno + ", name=" + name + "]";
    }

}

class Marks extends StudentEx {
    int mark1, mark2, mark3;

    Marks() {
        super();
    }

    Marks(int no, String n, int m1, int m2, int m3) {
        super(no, n);
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;

    }

    @Override
    public String toString() {
        return "Mark [mark1=" + mark1 + ", mark2=" + mark2 + ", mark3=" + mark3 + ", toString()=" + super.toString()
                + "]";
    }
}

public class StudentMarks {

    public static void main(String[] args) {
        Marks obj = new Marks(123, "Sowmi", 50, 60, 70);
        System.out.println(obj.toString());

    }

}
