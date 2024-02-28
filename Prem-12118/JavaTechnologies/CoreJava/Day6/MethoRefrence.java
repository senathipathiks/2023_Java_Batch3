package Day6;
interface Shape{
	void draw();
}

public class MethoRefrence {
	
	public static void construct() {
		System.out.println("Shape interface method referenced");
	}

	public static void main(String[] args) {
		
		Shape s=MethoRefrence::construct;
		
		s.draw();
		 

	}

}
