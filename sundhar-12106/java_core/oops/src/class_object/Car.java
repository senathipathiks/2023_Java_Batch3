package class_object;

/*
 * Class is blueprint of object each and every class in java is a object and it is block. 
 */

public class Car {
	
	public static void main(String[] args) {
		
//		System.out.println("Hello this the class");
		
		a:
		for (int i = 0; i < 5;i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2) {
					System.out.println("I'm going to break");
					continue a;
				}
			}
			System.out.println("Go to hell...!");
		}
		
	}

}
