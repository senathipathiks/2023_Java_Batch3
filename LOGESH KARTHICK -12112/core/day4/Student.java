package core.day4;

//public class Student 
//	  {	    
//	    int rollno;
//	    String name;
//	    
//	    Student(int no, String n)
//	    {
//	        this.rollno=rollno;
//	        this.name=name;
//	    }
//	
//
//		public Student(Student obj) {
//			// TODO Auto-generated constructor stub
//		}
//
//
//		@Override
//	    public String toString() {
//	        return "Student1 [rollno=" + rollno + ", name=" + name + "]";
//	    }
//	  }
//class Mark extends Student
//{
//	int Mark1,Mark2,Mark3;
//	Mark()
//	{
//		Mark(int no,String n,int m1,int m2,int m3)
//		{
//			super(no,n);
//			Mark1=m1;
//			Mark2=m2;
//			Mark3=m3;
//			
//		}
//		
//		
//	@Override
//		public String toString() {
//			return "Mark [Mark1=" + Mark1 + ", Mark2=" + Mark2 + ", Mark3=" + Mark3 + ", rollno=" + rollno + ", name="
//					+ name + ", toString()=" +"]"
//		}
//
//
//	}
//	
//	}
//	    public static void main(String[] args) {
//	        Student obj=new Student(123,"jeeva");
//	        System.out.println(obj.toString());
//	        System.out.println(new Student(1234,"deva").toString());
//	        Student obj1=new Student(obj);
//	        System.out.println(obj1.toString());
//	        
//	        
//	    }
//	    
//
//	}
//	}
//
class Student {
    private int rollNo;
    private String name;
    
    public Student() {
        System.out.println("This is Super Class Default Constructor");
    }
    
    public Student(int rollNo,String name) {
        this.rollNo = rollNo;
        this.name = name;
        System.out.println("This is Super Class Parameterized Constructor");
    }

    @Override
    public String toString() {
        return "StudentEx [rollNo=" + rollNo + ", name=" + name + "]";
    }
    
}

class Mark extends Student{
    private int mark1;
    private int mark2;
    private int mark3;
    
    public Mark() {
        System.out.println("This is base Class Default Constructor");
    }
    
    public Mark(int mark1,int mark2,int mark3) {
        super(112,"loki");
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    @Override
    public String toString() {
        return "Mark [mark1=" + mark1 + ", mark2=" + mark2 + ", mark3=" + mark3 + ", toString()=" + super.toString()
                + "]";
    }
}
public class Student {


    public static void main(String[] args) {
        Student obj = new Mark (123,345,678);
        System.out.println(obj.toString());
        

    }

}



    


