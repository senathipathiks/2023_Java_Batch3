package Com.Day6;

@FunctionalInterface

interface Drawable{
	void draw();
}
public class LambdaEg {

	public static void main(String[] args) {
		int width=10;
  
//      with lambda, Drawable implementation using anonymous class
		
////		Drawable obj1=new Drawable() {
////			public void draw() {
////				System.out.println("Drawing"+width);}
////			};
////			obj1.draw();

			//with lambda
		
			Drawable obj2=()->{  //overriding the method
				System.out.println("Drawing : "+width);
			};
			obj2.draw();
			
		}

	}


