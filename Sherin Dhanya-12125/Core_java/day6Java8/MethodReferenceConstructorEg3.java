package com.day6Java8;
interface Messageable{
	Message getMessage(String msg);
}
class Message{
	Message(String msg){
		System.out.println(msg);
	}
}
public class MethodReferenceConstructorEg3 {

	public static void main(String[] args) {
		Messageable hello = Message::new;
		hello.getMessage("Hello World");

	}

}
