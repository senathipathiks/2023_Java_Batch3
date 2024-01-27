package Day6;
//Functional interface
//static method
interface Shape {
	void draw();
}

public class MethodReferenceDemo1 {
	public static void paint() {
		System.out.println("Method referance");
	}

	public static void main(String[] args) {
		Shape obj = MethodReferenceDemo1::paint;
		obj.draw();
	}

}
