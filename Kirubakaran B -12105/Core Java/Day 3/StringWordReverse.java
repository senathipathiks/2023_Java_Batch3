package day3j;

public class StringWordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java is a programming language";
		String str[] = s1.split(" ");
		String res = "";
		
		for (int i = str.length-1 ; i >= 0; i--) {
			res += str[i]+" ";
		}
		
		System.out.println(res + "");
	}

	}


