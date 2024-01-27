package Day6;

interface Drawable{
	void draw();
}
public class LambdaExample {

	public static void main(String[] args) {
		int width=10;
		//without Lamda, Drawable implementation using anonymous class
		Drawable d=new Drawable() {
			public void draw() {
				System.out.println("drawing "+width);}
			};
			d.draw();
			
		//with lamda
			Drawable d2=()->{
				System.out.println("drwaing "+width);
			};
			d2.draw();

	}

}
