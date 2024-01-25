package Day4;
class StudentEx001{
    int rollno;
    String name;

    StudentEx001(int no, String n) {
        this.rollno=rollno;
        this.name=name;
        
    }

    StudentEx001() {
        
    }
    public String toString() {
        return "Student [roolno=" + rollno + ", name=" + name +"]";
    }
    
}
class Mark extends StudentEx{
    int mark1,mark2,mark3;
    Mark(){
        super();
    }
    Mark(int no,String n,int m1,int m2,int m3)
    {
        super(no,n);
        mark1=m1;
        mark2=m2;
        mark3=m3;
        
    }
    @Override
    public String toString() {
        return "Mark [mark1=" + mark1 + ", mark2=" + mark2 + ", mark3=" + mark3 + ", toString()=" + super.toString()
                + "]";
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Mark obj=new Mark(123,"varshi",50,60,70);
        System.out.println(obj.toString());

    }

}