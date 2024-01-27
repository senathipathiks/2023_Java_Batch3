package Day6;

//constructor reference
interface Messagable {
	Message getMessage(String msg);
}

class Message {
	Message(String msg) {
		System.out.println(msg);
	}
}

public class ConstructorReference {

	public static void main(String[] args) {
		Messagable msg = Message::new;
		msg.getMessage("Hello");

	}

}
