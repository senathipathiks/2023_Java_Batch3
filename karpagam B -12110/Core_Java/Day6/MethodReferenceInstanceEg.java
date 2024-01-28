package Com.Day6;

interface Sayable{
	void say();
}

public class MethodReferenceInstanceEg {
	public void something() {
		System.out.println("Hello,this is non-static method..");
	}

	public static void main(String[] args) {
		
	   MethodReferenceInstanceEg obj1=new MethodReferenceInstanceEg();
		
	    // Referring non-static method using reference
		Sayable obj2= obj1::something; //referring a object to non static method
		//calling interface method
		obj2.say();
		
		System.out.println("-------------");
		
	    // Referring non-static method using anonymous function
		Sayable obj3=new MethodReferenceInstanceEg()::something;
		//calling interface method
        obj3.say();
		
	

		
	}

}
 