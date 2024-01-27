package Day6;


interface messagable{
	Message getMessage(String Constructor);
}
//constructor
class Message{
	Message(String constructor){
		System.out.println(constructor);
	}
}
public class MethodReference2 {

	public static void main(String[] args) {
		
		messagable hello=Message::new;
		hello.getMessage("Hello World");
           
	}

}
