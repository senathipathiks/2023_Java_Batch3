package Day6;
interface Drawable{
	void draw();
}

public class LambdaExpression {

	public static void main(String[] args) {
		int width =10;
		// without object creation (using new)]
		
		Drawable d1=()->{
			System.out.println("Drawing:"+ width);
		};
		d1.draw();
		 
	}

}

//package Day6;
//
//interface Drawable {
//    void draw(int i);
//}
//
//public class LambdaExpression {
//    public static void main(String[] args) {
//        int width = 10;
//
//        // With Local-Variable Syntax for Lambda Parameters (using var)
//        Drawable d1 = (var) -> {
//            System.out.println("Drawing" + width);
//        };
//        d1.draw width();
//    }
//}

   	
