package com.day6;
interface Messageable{
	Message getMessage(String msg);
}
class Message{
	Message(String msg){
		System.out.println(msg);
	}
}
public class MethodRef2 {
public static void main(String[] args) {
	Messageable hello = Message::new;
	hello.getMessage("Method reference");
}
}
