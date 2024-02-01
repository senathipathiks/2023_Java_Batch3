package rel.edu.day6.CustomException;

public class Eg1 {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,0};
		
		int b = 10,c;
		
		try {
			c = b/a[5];
		} catch (Exception e) {
			System.out.println("hello exception occured");
		}
		System.out.println("hello guys");
	}

}
