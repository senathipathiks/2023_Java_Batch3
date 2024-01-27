package Day6;
interface Shape {
	void draw();
}
public class MethodReference {
    public static void method1() {
    	System.out.println("Shape");
    }
    public void method2() {
    	System.out.println("Shape1");
    }
	public static void main(String[] args) {
		//nonstatic method using ref
		MethodReference l = new MethodReference();
		Shape s = l::method2;
		//calling interface method
		s.draw();
		Shape o = MethodReference::method1;
		o.draw();
	}

}
