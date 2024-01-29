package day3exception;

class invalid extends Exception{
        invalid(String msg){
    	  super(msg); 
       }
}

public class CustomExceptionExample1 {
	
	public static void main(String[] args) throws Exception {
		
		int num1=10;
		try {
			if(num1>100) {
				throw new invalid("Number is invalid provide upto 100");
				
			}
			else {
				System.out.println("Known number");
			}
		} catch (invalid e) {
		System.out.println(e.getMessage());
		}
		System.out.println("Custom exception generated");
          
	}

}
