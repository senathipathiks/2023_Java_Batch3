package Day_1;

public class Marks {
	private int StudId;
	private String StudName;
	private int Tamil;
	private int English;
	private int Maths;
	private int TotalMarks;
	private int Average;
	
	Marks(int StudId,String StudName,int Tamil,int English,int Maths){
		this.StudId=StudId;
		this.StudName=StudName;
		this.Tamil=Tamil;
		this.English=English;
		this.Maths=Maths;
	}
	
	void DisplayMarks() {
		System.out.println("Student Name: " +StudId);
		System.out.println("Student Name: " +StudName);
	}
	void sum() {
		TotalMarks = Tamil+English+Maths;
		System.out.println("Total Marks: "+TotalMarks);
	}
	void average() {
		Average=TotalMarks/3;
		System.out.println("Average: "+Average);
	}
	

	public static void main(String[] args) {
		Marks M1=new Marks(123,"Varshinee",75,85,90);
		M1.DisplayMarks();
		M1.sum();
		M1.average();
		
		Marks M2=new Marks(124,"Yokesh",95,100,80);
		M2.DisplayMarks();
		M2.sum();
		M2.average();
		
		Marks M3=new Marks(125,"Vairavan",75,95,96);
		M3.DisplayMarks();
		M3.sum();
		M3.average();

	}

}
