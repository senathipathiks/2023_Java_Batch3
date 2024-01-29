package com.javacoreday6;

interface Messageable{  
    Message getMessage(String msg);  
}  
class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }  
}  

public class MethodReferenceExample3 {

	public static void main(String[] args) {
		
		  Messageable hello = Message::new;  
	  	  hello.getMessage("Hello World");  

	}

}
