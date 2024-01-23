package Day_3;

public class RevString {

	public static void main(String[] args) {
		String s=new String ("Java is a programming language");
		
		String s1[]=s.split(" ");
		
		String rev="";
		for (int i = s1.length-1; i >=0 ; i--) {
			rev=rev+s1[i]+" ";
		}
		System.out.println(rev);
	}

}
	