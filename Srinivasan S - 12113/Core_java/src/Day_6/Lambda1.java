package Day_6;
/*
 * Lambda function will be applicable only if we have one functional interface 
 *Functional interface means interface having only one abstract method
 *syntax : ()->{}
 */
interface eg{
	void maths();
}

public class Lambda1 {
	
	public static void main(String[] args) {
		int a=7;
		
		eg m1=new eg() {

			@Override
			public void maths() {
				System.out.println(a+" is an integer 1");
				
			}
			};
			m1.maths();
		
		
		
		eg e1 =()->
			System.out.println(a+" is an integer");
		
		e1.maths();

	}

}
