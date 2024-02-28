package Day6;
interface Sayable{
	void say();
}

public class MethodReferenceEx2 {
	
	public static void  saySomething() {
		System.out.println("Hello this is static Method");
	}
   public void Something() {
	   System.out.println("Hello,this is not static method.");
   }
	public static void main(String[] args) {
		 // Refering static method\
		Sayable sayable=MethodReferenceEx2::saySomething;
		sayable.say();
		
		MethodReferenceEx2 m = new MethodReferenceEx2();
		
		Sayable s1 = m::Something;
		
		s1.say();

	}

}
