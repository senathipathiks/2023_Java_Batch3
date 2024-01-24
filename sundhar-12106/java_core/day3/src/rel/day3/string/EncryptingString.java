package rel.day3.string;

public class EncryptingString {
	
	public static void main(String[] args) {
		
		String s = "sundhar123";
//		char cArr[] = s.toCharArray();
		String encryptVal = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			encryptVal +=  Character.toLowerCase(s.charAt(i))-'a'+1;
		}
		System.out.println(encryptVal);
		
	}

}
