package rel.day3.string;

public class SentenceReverse {

	public static void main(String[] args) {
		
		String s1 = "I Love Programming Language";
		String str[] = s1.split(" ");
		String res = "";
		
		for (int i = str.length-1 ; i >= 0; i--) {
			res += str[i]+" ";
		}
		
		System.out.println(res + "");
	}
}
