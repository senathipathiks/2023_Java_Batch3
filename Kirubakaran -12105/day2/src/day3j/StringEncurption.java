package day3j;

public class StringEncurption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABCDEFGH";
//		char cArr[] = s.toCharArray();
		String encryptVal = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			encryptVal +=  Character.toLowerCase(s.charAt(i))-'a'+1;
		}
		System.out.println(encryptVal);
		
	}


	}


