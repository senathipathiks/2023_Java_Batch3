package day3exception;

class VoteEligible extends Exception{
	public VoteEligible(String msg) {
		super(msg);
	}
}

class ElectionComm{
	public ElectionComm(int age) throws VoteEligible {
		// TODO Auto-generated constructor stub
		if(age<18 ||age>100) {
			throw new VoteEligible("Not eligible to vote ");
		}
		else {
			System.out.println("Correct age to vote");
		}
	}
}
public class CustomAgeForVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ElectionComm e=new ElectionComm(14);
		} catch (VoteEligible e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("By election commission");
		
	}

}
