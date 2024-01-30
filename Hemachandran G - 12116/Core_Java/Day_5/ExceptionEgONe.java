package Day_5;

	public class ExceptionEgONe {
	
		public static void main(String[] args) {
	
	
			    int a = 10;
			    int b = 0;
			    int c;
	//		    = a/b; // it'll throw an "Arithimetic Exception".
	//		    System.out.println(c);
			    
			   
			    try{
			    c = a/b;
			    }
			    
			    catch
			    (ArithmeticException e){System.out.println(e);}  // the lines from 34 - 39 will handle the exception;
			    
			    // this is how we handle the exception in Java .....
			    
			    String str = "Array";
		        int a1 []= {2,4,5,6,7};
		        int b1=10;
		        int c1 ;
	//	        System.out.println(c);
		        try {
		            c1 = b1/a1[5];
		            
		        }
		        catch(ArithmeticException e)
		        {
		            System.out.println(e);
		        }
		        catch(ArrayIndexOutOfBoundsException e)
		        {
		            System.out.println(e);
		        }
		        catch(Exception e)
		        {
		            System.out.println(e);
		        }
			    
			    
	
		}
	
	}
