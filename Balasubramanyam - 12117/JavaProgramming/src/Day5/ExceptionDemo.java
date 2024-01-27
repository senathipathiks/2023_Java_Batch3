package Day5;
import java.io.FileNotFoundException;  
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ExceptionDemo {
   


 //    	System.out.println("start");
    	
//    	try {
//    	c =a/b;
//    	}
//    	catch(ArithmeticException ae){
//    		System.out.println(ae.toString());
//    		System.out.println("hello");
//    		System.out.println(a/(b+2));
//    	}
//    	finally {
//    		System.out.println("Finally");
//    		}
//    	System.out.println(c);
//    	System.out.println("End");}
//     
//	public static void main(String[] args) { // {throws IOException {
//		int a=10;
//    	int b=0;
//    	int c=0;
//        try {  
//        	int ab[]=new int[5];
//        	ab[6]=6;
//        	
//        }  
//       
//// pro
//        catch(ArithmeticException e)  
//        {  
//         System.out.println("Arithmetic Exception occurs");  
//        }    
//     catch(ArrayIndexOutOfBoundsException e)  
//        {  
//         System.out.println("ArrayIndexOutOfBounds Exception occurs");  
//        }    
//     catch(Exception e)  
//        {  
//         System.out.println("Parent Exception occurs");  
//        }             
//     System.out.println("rest of the code");    
//    System.out.println("File saved successfully");  
//		FileInputStream input;
//		 int i;
//		 try {
//			 input = new FileInputStream("D:\\JavaProgramming\\src\\com\\Day4Oops\\Movie.java");
//			 while((i=input.read())!=-1) {
//				 System.out.print((char)i);
//			 }
//			 input.close();
//		 }
//        catch(FileNotFoundException e) {
//        	System.out.println(e);
//        }
    static void method11() throws FileNotFoundException {
//		
//	
    	FileReader file = new FileReader("D:\\JavaProgramming\\src\\com\\Day4Oops\\Movie.java");
  	BufferedReader fileput =new BufferedReader(file);
	throw new FileNotFoundException();
	}
	public static void main(String[] args) {
		try {
			method11();
		}
		catch(FileNotFoundException e) {
		System.out.println(e.toString());
		}
		System.out.println("The code");
//	}	
//	
//	
//	}
//	 static int div; int n,m;
//     int m1(int n,int m)throws IOException {
//    	 return div=n/m;
//    	}
//     public static void main(String[] args) throws IOException {
//		try{ExceptionDemo d = new ExceptionDemo();
//		System.out.println(d.m1(10, 0));
//		}
//    	 catch(Exception e){
//    		 System.out.println(e.toString());
//    		 
//    	 }System.out.println(div);
		
     }

	
	}
		
		
	

