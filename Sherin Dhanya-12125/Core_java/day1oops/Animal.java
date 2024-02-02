package com.day1oops;
//Create an animal class as base class and create the subclasses named Dog, Cow, Lion. 
//override the makeSound method in the subclasses.
class s{
	void makeSound() {
		 System.out.println("Animal Sounds");
	 }
}
class dog extends s{
	 void makeSound() {
		 System.out.println("Bow Bowwww");
	 }
}
class cow extends s{
	 void makeSound() {
		 System.out.println("Maaa Maaaa");
	 }
}
class lion extends s{
	 void makeSound() {
		 System.out.println("roar roarrrrrrrr");
	 }
}

	 
	 public class Animal {

	public static void main(String[] args) {
		cow c1=new cow();
		dog d1=new dog();
		lion l1=new lion();
		
		c1.makeSound();
		d1.makeSound();
		l1.makeSound();

	

}
}
