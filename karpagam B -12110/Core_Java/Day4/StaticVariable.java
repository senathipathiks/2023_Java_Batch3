package Com.Day4;


public class StaticVariable {
	
    static int count;//auto-initialize count as 0
    
    static int increment() {
    	return ++count; //both should be static
    }


	public static void main(String[] args) {
		System.out.println(StaticVariable.increment());//invoked by using class name
	}

}
