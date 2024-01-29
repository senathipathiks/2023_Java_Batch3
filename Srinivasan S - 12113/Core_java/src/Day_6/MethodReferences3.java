package Day_6;
/*
 * Method references using constructor 
 * syntax: class name::new;
 */
interface Message1{
	Message getMessage(String msg);
}

class Message{
	Message(String msg){
		System.out.println(msg);
	}
}

public class MethodReferences3 {

	public static void main(String[] args) {
		Message1 m1=Message :: new;
		m1.getMessage("Hello");

	}

}
