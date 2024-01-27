package Day6;
interface Drawable{
	void draw();
}
public class LambdaExpression {

	public static void main(String[] args) {
		int width=10;
		Drawable l1 = new Drawable() { //Drawable implementation using anonymous class 
			public void draw() {
				System.out.println(width);
			}
		};
		l1.draw();
		
		Drawable l =()->{
			System.out.println(width);
		};
		l.draw();
	}}


