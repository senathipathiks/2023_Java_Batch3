package Day6;
@FunctionalInterface
interface Drawable {
	public void draw();
}


public class LambdaEx1 {

	public static void main(String[] args) {
		
		int width=15;
		int height=20;
		// without lambda drawable implementation using anonymous class
		Drawable d=new Drawable() {
			
			@Override
			public void draw() {
				System.out.println("Drawing rectangle " + width*height);
				
			}
		};
		d.draw();
		
		
		
		
		// without lambda
		
		Drawable d2=() -> {
			System.out.println("Drawing" + width*height);
		};
		d2.draw();
		
		
		

	}

}
