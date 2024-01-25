package oops;

abstract class Animals {
 abstract void makeSound();
}
class dog extends Animals{
	public void makeSound() {
	 System.out.println("Dog sounds like bow bowwww");
 }}
class cow extends Animals{
	public void makeSound() {
		System.out.println("cow sounds like maaaaa");
	}
}
class lion extends Animals{
	public void makeSound() {
		System.out.println("lion sounds like roar");
	}
}

public class Animal{
public static void main(String animal[]) {
  Animals s=new dog();
  s.makeSound();
  Animals s1=new cow();
  s1.makeSound();
  Animals s2=new lion();
  s2.makeSound();
  
  
  
  
}
  
 
}
