package oops;

public class StudentMarks {
  String studName;
  int studId;
  int rollNo;
  int java;
  int python;
  int wedDesigning;
  int total;
    
  StudentMarks(String studName,int studId,int rollNo,int java,int python,int webDesigning){
	  this.studName=studName;
	  this.studId=studId;
	  this.rollNo=rollNo;
	  this.java=java;
	  this.python=python;
	  this.wedDesigning=webDesigning;
	  
  }
  
  void studDetails() {
	  System.out.println(studName);
	  System.out.println(studId);
	  System.out.println(rollNo);
  }
  
  void studMarks() {
	total=(java+python+wedDesigning);
	System.out.println(total);
  }
   
  public static void main(String sm[]) {
	  StudentMarks m1=new StudentMarks("Ellie",123,19397510,90,99,98);
	  m1.studDetails();
	  m1.studMarks();
	  
  }
  
}
