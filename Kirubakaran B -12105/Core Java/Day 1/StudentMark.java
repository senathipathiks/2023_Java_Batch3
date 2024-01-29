package classIntro;

public class StudentMark {
	private int studId;
	private String studName;
	private String age;
	private int mark1;
	private int mark2;
	private int mark3;
	

	public StudentMark(int studId, String studName, String age, int mark1, int mark2, int mark3) {
		this.studId = studId;
		this.studName = studName;
		this.age = age;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		
	}
	void display() {
		System.out.println("Student ID : "+studId);
		System.out.println("Student Name: "+studName);
		System.out.println("Age     : "+age);
		System.out.println("Mark1   :" +mark1);
		System.out.println("Mark2   :" +mark2);
		System.out.println("Mark3   :" +mark3);
		
	}
		
      public void get() {
        	  int total=mark1+mark2+mark3;
        	  double avg=total/3;
        	  System.out.println("Total marks "+total);
        	  System.out.println("Average "+avg);
        	  
        	  if(avg>85) {
        		  System.out.println("A grade");
        	  }
        	  else if(avg<85 &&avg>60) {
        		  System.out.println("B grade");
        	  }
        	  else if(avg<60&&avg>30) {
        		  System.out.println("C grade");
        	  }
        	  else {
        		  System.out.println("fail");
        	  }
        	 
          }

	public static void main(String[] args) {
		StudentMark sm=new StudentMark(1,"prem","22",64,65,59);
		sm.display();
		sm.get();
		
		
          
	}

}
