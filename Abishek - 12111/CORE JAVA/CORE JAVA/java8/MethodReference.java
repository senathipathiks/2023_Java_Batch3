package Day6;

interface shape{
	void draw();
}

public class MethodReference {
	public static void construct() {
		System.out.println("Constructing Process!!!!!!!!");
	}

	public static void main(String[] args) {
		
		
		
		shape sh=MethodReference:: construct;
		
		sh.draw();
		
		
		
		
	}

}
