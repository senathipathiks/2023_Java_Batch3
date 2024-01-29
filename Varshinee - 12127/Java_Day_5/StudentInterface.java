package Java_Day_5;

interface personalInfo{
	void personDetails();
}
interface collegeInfo{
	void collegeDetails();
}
class student implements personalInfo,collegeInfo{
    String clgName;
	String clgLocation;
	String stuName;
	String stuLocation;

	void Student( String clgName,String clgLocation,String stuName,String stuLocation ) {
    	this.clgName=clgName;
    	this.clgLocation=clgLocation;
    	this.stuName=stuName;
    	this.stuLocation=stuLocation;
    	}

	@Override
	public void collegeDetails() {
		System.out.println("Student college name is:"+clgName);
		System.out.println("Student college location is:"+clgLocation);
	}

	@Override
	public void personDetails() {
		System.out.println("Stuent name is:"+stuName);
		System.out.println("Student location is:"+stuLocation);
		}
	}
public class StudentInterface {

	public static void main(String[] args) {
	     student obj1=new student();
	     obj1.Student("SCE","Chennai","Varshinee","Trichy");
	     obj1.collegeDetails();
	     System.out.println("-----------------------------------------");
	     obj1.personDetails();
	 }

}