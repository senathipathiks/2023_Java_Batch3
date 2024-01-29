package Day_6;


interface Sayable{
	void say();
}

public class MethodReferences2 {
	public static void saySomething() {
	System.out.println("Hello,this is static ");
	}
	
	public void something(){
		System.out.println("Hello,non static method");
	}

	
	public static void main(String[] args) {
		//Static method
		Sayable s=MethodReferences2 :: saySomething;
		s.say();
		
		//non static method
		MethodReferences2 m1=new MethodReferences2();//object creation
		Sayable s1= m1 :: something;
		s1.say();
		
		//using lambda
		
		Sayable saya=()->System.out.println("using lambda func");
		saya.say();
		

	}

}
