package Day_5;
//number format exception
public class Exception4 {

	public static void main(String[] args) {
		int a[]=new int [5];
		String s="Name";
		
		
		try {
			a[1]=Integer.parseInt(s);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("handled");
		}
	

}
}
