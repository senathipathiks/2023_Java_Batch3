package Java_Day_3;

public class ArraySample {

	public static void main(String s1[]) {
		int arr[]= {10,20,30,40,50};
		String[] name= {"Varshi","Yokesh","Vairavan","Appu","Meens"};
		System.out.println(arr.length);
		for (int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		//for each
		System.out.println("***************************************************");
		for (int i:arr) {
			System.out.println(i);
		}
		System.out.println("***************************************************");
		for (String s:name) {
			System.out.println(s);
		}
	}

}
