package Day6;

interface Sayable{
	void say();
}
public class MethodExample2 {

	public static void saySomething() {
		System.out.println("Hello,this is static method");
	}
	public void Something() {
		System.out.println("Hello,this is non-static method.");
	}
	public static void main(String[] args) {
		//referring static method
		Sayable sayable=MethodExample2::saySomething;
		//calling interface method
		sayable.say();
		
		MethodExample2 methodReference=new MethodExample2();//object creation
		//Referring non-static method using refernce
		Sayable sayable1=methodReference::Something;
		//Calling interface method
		sayable.say();
		
		//referring non static method using anonymous object
		Sayable sayable2=new MethodExample2()::Something;
		sayable2.say();
		
		//using lamda function
		Sayable sayable3 =()-> System.out.println("Using Lamda expression");
		sayable3.say();

	}

}
