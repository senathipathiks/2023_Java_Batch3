package Com.Day5;

public class CheckedExceptionEg2 {

	public static void main(String[] args) {
		
		/*try {
			Class temp=Class.forName("Com.Day5.InterfaceEg");//op-java.lang.ClassNotFoundException: Com.Day5.InterfaceEg

		}
		catch(ClassNotFoundException e) {
			System.out.println(e);*/
		
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
