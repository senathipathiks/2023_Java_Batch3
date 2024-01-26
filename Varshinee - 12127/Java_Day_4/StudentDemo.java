package Java_Day_4;


	class StudentEx{
	     int rollno;
	     String name;
	     StudentEx(){
	         
	     }
	     StudentEx(int no,String n){
	         rollno=no;
	         name=n;
	     }
	     StudentEx(StudentEx e){
	    	 rollno=e.rollno;
	    	 name=e.name;
	     }
	    @Override
	    public String toString() {
	        return "Student [rollno=" + rollno + ", name=" + name + "]";
	    }
	     
	     
	 }
	public class StudentDemo {

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        StudentEx obj=new StudentEx(123,"Varshi");
	        System.out.println(obj.toString());
	        System.out.println(new StudentEx().toString());
	        StudentEx obj1=new StudentEx(obj);
	        System.out.println(obj1.toString());
	        

	    }

	}

