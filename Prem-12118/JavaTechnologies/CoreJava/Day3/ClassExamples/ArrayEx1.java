package Day3.ClassExamples;

public class ArrayEx1 {
	
	public static void main(String s1[]) {

	int arr[]= {10,20,30,40,50};
	 String[] name= {"Arun","Kumar","prem"};
	 System.out.println(arr.length);
	 System.out.println(name.length);
	 for (int i=0;i<arr.length;i++) {
		 
		 System.out.println("By using for loop"+i);
		 
		}
	  for (int i:arr) {
		  System.out.println("By default method"+i);
	  }
	  for (String s:name) {
		  System.out.println("By default method"+s);
	  }
	}

}
