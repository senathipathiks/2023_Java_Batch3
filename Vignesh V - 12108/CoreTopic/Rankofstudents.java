package CoreTopic;

public class Rankofstudents {
	private String studentName;
	private int stuId;
	private int tamilMarks;
	private int englishMarks;
	private int mathsMarks;
	private int scienceMarks;
	private int socialMarks;
	public Rankofstudents(String studentName,int stuId, int tamilMarks, int englishMarks, int mathsMarks,
			int scienceMarks, int socialMarks) {
		super();
		this.studentName = studentName;
		this.tamilMarks = tamilMarks;
		this.englishMarks = englishMarks;
		this.mathsMarks = mathsMarks;
		this.scienceMarks = scienceMarks;
		this.socialMarks = socialMarks;
		this.stuId=stuId;
	}
	void displayStudent() {
		double avg=Math.floor((tamilMarks+englishMarks+mathsMarks+scienceMarks+socialMarks)/5);
				
        System.out.println("student name is " +studentName);
        System.out.println("student ID is " + stuId);
        System.out.println("tamil mark is " + tamilMarks);
        System.out.println("english mark  is " + englishMarks);
        System.out.println("maths mark is  " + mathsMarks);
        System.out.println("science mark is " + scienceMarks);
        System.out.println("social mark is " + socialMarks);

    
	if (avg>80)
		System.out.println("Average is : "+avg+ "\n A grade");
		else if (avg>50)
			System.out.println("Average is : "+avg+ "\n B grade ");
		else if (avg>35)
			System.out.println("Average is : "+avg+ "\n c grade ");
		else
			System.out.println("Average is : "+avg+ "\n d grade ");
		
			
		}
	
	
	public static void main(String[] args) {
        // TODO Auto-generated method stub
		Rankofstudents obj = new Rankofstudents("vignesh", 1001, 80,78,69,87,100);
        obj.displayStudent();
	}
}
    	
    


