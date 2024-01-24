package Java_Day_3;

public class StrBugger {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			StringBuffer s1=new StringBuffer("Java");
			System.out.println(s1.append("Programming"));
//			System.out.println(s1.reverse());
//			System.out.println(s1.length());
			System.out.println(s1.insert(4, "is a"));
			System.out.println(s1.replace(0, 4, "c,c++"));
		}

	}

