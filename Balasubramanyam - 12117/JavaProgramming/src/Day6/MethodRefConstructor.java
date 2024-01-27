package Day6;
interface Messageable{
	Message getMessage(String str);
}
class Message{
	Message(String str){
		System.out.println(str);
	}
}
public class MethodRefConstructor {
	public static void main(String[] args) {
		Messageable m = Message::new;
        m.getMessage("Balu");
	}

}
