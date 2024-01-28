package Com.Day6;

@FunctionalInterface

interface Shape{
	void draw();
}

public class MethodReferenceStaticEg {  //static method reference 
	public static void construct() {
		System.out.println("Shape constructing process..");
	}

	public static void main(String[] args) {
		Shape obj1=MethodReferenceStaticEg::construct; //-->refferring classname to methodname
		obj1.draw();

	}

}
