package Day6;
interface Sayable{
    
    void say();
}


public class MethodReferencenonstatic {

	
		
	
		    
		      public static void saysomething() {
		          
		          System.out.println("Hello static method");
		      }
		      
		      public void Something() {
		          
		          System.out.println("Hello , this is non-static method");
		      }

		    public static void main(String[] args) {
		        
		    	MethodReferencenonstatic m = new MethodReferencenonstatic();
		        
		        Sayable s = m::Something;
		        
		        s.say();
		        

	}

}
