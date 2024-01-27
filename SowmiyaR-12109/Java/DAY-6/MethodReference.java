package Day6;
//@FunctionInterface
interface Shape{
	void draw();
}
public class MethodReference {
	//static method
    public static void constructor(){
    	System.out.println("Shape Constructing process..");
    }
    
	public static void main(String[] args) {
	Shape obj=MethodReference::constructor;
	obj.draw();

	}

}
