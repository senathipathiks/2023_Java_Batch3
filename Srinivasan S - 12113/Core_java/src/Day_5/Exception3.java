package Day_5;
//class not found exception
public class Exception3 {

	public static void main(String[] args) {
		try {
			Class temp=Class.forName("");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}

}
