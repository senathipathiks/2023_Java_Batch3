package DAY1;

public class std {
	private int studID;
	private String dept;
	private String gender;
	private int m1;
	private int m2;
	private int m3;
	
	public std(int studID, String dept, String gender, int m1, int m2, int m3)
	{
		this.studID = studID;
		this.dept = dept;
		this.gender = gender;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	void displaysTd() 
	{
		System.out.println("Student ID"+ studID);
		System.out.println("Student department"+ dept);
		System.out.println("Student gender"+ gender);
		System.out.println("Mark1"+ m1);
		System.out.println("Mark2"+ m2);
		System.out.println("Mark3"+ m3);
		
	}
	public void get()
	{
		int total = m1 + m2 +m3;
		double avg = total/3;
		System.out.println("Total marks" + total);
		System.out.println("average"+ avg);
		
		if (avg > 80)
		{
			System.out.println("GRADE A");
		}
		else if (avg >70)
		{
			System.out.println("GRADE B");
		}
		else if (avg > 60)
		{
			System.out.println("GRADE C");
		}
		else
         {
			System.out.println("GRADE D");
		}	
	}
	

		public static void main(String[] args) {
		std s1 = new std(12345,"MCA","MALE", 67, 99, 82);
		s1.displaysTd();
		s1.get();
	
	
	} 

}
