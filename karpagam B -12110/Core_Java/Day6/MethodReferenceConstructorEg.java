package Com.Day6;


interface Messagable{
	Message getMessage(String msg); // return classname here
}
class Message{
	Message(String msg){
		System.out.println(msg);
	}
}
public class MethodReferenceConstructorEg {

	public static void main(String[] args) {
		
		Messagable obj1=Message::new;//referring constructor to new keyword
		obj1.getMessage("Hello All...");

	}

}
