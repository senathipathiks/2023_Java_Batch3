package day2oops;

public class ClassNotFoundEXceptionn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class temp=Class.forName("com.kiruba.C1");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

}
