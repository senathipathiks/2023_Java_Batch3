package Day_5;

interface Drawable{
	void draw();
}
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int width = 10;
		Drawable d1 = () -> {
			var localVar = width;
			System.out.println("Drawing : " +localVar);
		};

		d1.draw();
	}

}
