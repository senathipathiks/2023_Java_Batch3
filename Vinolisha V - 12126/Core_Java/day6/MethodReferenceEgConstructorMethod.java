package com.day6;
interface Messagable{
	Message  getMessage(String name);
}

class Message {
	Message(String msg){
		System.out.println(msg);
	}
}

public class MethodReferenceEgConstructorMethod {

	public static void main(String[] args) {
		Messagable hello=Message::new;
		hello.getMessage("Hello World");
		

	}

}
