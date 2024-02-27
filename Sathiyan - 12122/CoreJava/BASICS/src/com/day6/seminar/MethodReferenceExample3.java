package com.day6.seminar;

interface Messageable{
	Message getMessage(String msg);
}

class Message{
	
	Message(String msg){
		System.out.println(msg);
	}
	
}

public class MethodReferenceExample3 {

	public static void main(String[] args) {
		Messageable ref=Message::new;
		ref.getMessage("Hello world...!");

	}

}
