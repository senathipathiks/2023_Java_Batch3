package Day7;

interface Drawable {
	void draw();
}

public class LambdaParameterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width = 10;
		Drawable d1 = () -> {
			var localVar = width;
			System.out.println("Drawing: " + width);
		};
		d1.draw();
	}

}
