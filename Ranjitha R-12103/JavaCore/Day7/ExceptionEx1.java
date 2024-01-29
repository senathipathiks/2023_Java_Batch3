package Day7;

public class ExceptionEx1 {

	public static void main(String[] args) {
//		String Str = "Array";
//		char c = Str.charAt(5);
//		System.out.println(c);
		int a[] = { 1, 2, 3, 4, 0 };
		int b = 10;
		try {
			int c = b / a[5];
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
