package Day5;

public class ExceptionClassNotFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class temp = Class.forName("Day5.Ex1");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}

}
