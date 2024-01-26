package Day3;

public class ArrayEx1 {

	public static void main(String s1[]) {
	int arr[]= {10,20,30,40,50};
	String[] name= {"Arun","Kumar","sowmi","prabhu"};
	
	System.out.println("length is: "+arr.length);
	//for loop
//	for(int i=0;i<arr.length;i++) {
//		System.out.println(arr[i]);
//	}
	//for each method
//	for(int i:arr) {
//		System.out.println(i);
//	}
	
	for(String s:name) {
		System.out.println(s);
	}

	}

}
