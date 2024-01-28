package Day6;

interface Messageable{
	Message getMessage (String s);
}
class Message{
	Message(String msg){
		System.out.println("The message is invoked by constructor ");
	}
}

public class ConstructorReference {

	public static void main(String[] args) {
		 Messageable m1 =Message::new;
		 m1.getMessage("hello");
	}

}
