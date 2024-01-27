package Day6;

interface Drawable {
	void draw();
}

public class LambdaDemo1 {

	public static void main(String[] args) {
		int width = 10;
		// without lambda,Drawable implementation using anonymous class
		Drawable d = new Drawable() {
			public void draw() {
				System.out.println("Drawing " + width);
			}
		};
		d.draw();

		// with lambda
		Drawable d2 = () -> {
			System.out.println("Drawing " + width);
		};
		d2.draw();
	}

}
