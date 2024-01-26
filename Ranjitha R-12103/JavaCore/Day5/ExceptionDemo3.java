package Day5;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		String s="Name";
		try {
			a[1]=Integer.parseInt(s);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
