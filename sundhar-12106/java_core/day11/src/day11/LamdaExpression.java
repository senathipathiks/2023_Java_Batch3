package day11;

interface Drawable{
	public void draw();
}

public class LamdaExpression {
	
	public static void main(String[] args) {
		
		Drawable d = () -> {System.out.println("Im from draw mthod");};
		
		d.draw();
	}

}
