package Day2;

public class Pattern {
public static void main(String[] args) {
	for (int i = 0; i <= 4 ; i++) {
		for (int j = 0; j <=4; j++) {	
			if (i==0 && j==2 || (i==1 && j==1) || (i==1 && j==2) || (i==1 && j==3) || (i==2) || (i==3 && (j==1||j==2||j==3)) || (i==4 && j==2)) {
				System.out.print(" * ");
			}else {
				System.out.print("   ");
			}			
		}
		System.out.println();
		
	}
}
}
