package Java_Day_4;


	class StudentEx01{
	     int rollno;
	     String name;
	     StudentEx01(){
	         
	     }
	     StudentEx01(int no){
	         rollno=no;
	         
	     }
	     StudentEx01(int rollno,String name){
	    	this(rollno);
	    	this.name=name;
	     }
	     StudentEx01(StudentEx e){
	    	 rollno=e.rollno;
	    	 name=e.name;
	     }
	    @Override
	    public String toString() {
	        return "Student [rollno=" + rollno + ", name=" + name + "]";
	    }
	public class StudentDemoEx1 {
	public static void main(String[] args) {
		StudentEx01 obj=new StudentEx01(123,"Varshi");
		System.out.println(obj.toString());
		
		System.out.println(new StudentEx01().toString());
		
		StudentEx01 obj1=new StudentEx01();
		System.out.println(obj1.toString());
	}

}
}