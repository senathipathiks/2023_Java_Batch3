package Day_5;


interface personalInfo{
    void personDetails();
}
interface collegeInfo{
    void collegeDetails();
}
class student implements personalInfo,collegeInfo{
    String sname;
    String sloc;
    String clgname;
    String clgLocation;

    void Student( String clgName,String clgLocation,String stuName,String stuLocation ) {
        this.sname=clgName;
        this.sloc=clgLocation;
        this.clgname=stuName;
        this.clgLocation=stuLocation;
        }

    @Override
    public void collegeDetails() {
        System.out.println("Student college name is:"+sname);
        System.out.println("Student college location is:"+sloc);
    }

    @Override
    public void personDetails() {
        System.out.println("Stuent name is:"+clgname);
        System.out.println("Student location is:"+clgLocation);
        }
    }
public class StudentInt {

    public static void main(String[] args) {
         student obj1=new student();
         obj1.Student("Srinivasan","Neyveli","PEC","Chennai");
         obj1.collegeDetails();
         System.out.println("-----------------------------------------");
         obj1.personDetails();
     }

}

