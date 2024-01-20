//Create an animal class as base class and create the subclasses named Dog, Cow, Lion. 
//override the makeSound method in the subclasses.
package Day1;


abstract class Animal {
   abstract void makeSound() ;
}
    class dog extends Animal{
        public void makeSound() {
            System.out.println("Woof!");
        }
    }
    class cow extends Animal{
            public void makeSound() {
                System.out.println("Maaaaa!");
        }
    }
    class lion extends Animal{
        public void makeSound() {
            System.out.println("Roar");
        }
    }
    public class AnimalClass{
    	
    
    public static void main(String []ss) {
    	Animal obj = new lion();
    	obj.makeSound();
    	Animal obj2=new cow();
    	obj2.makeSound();
    	Animal obj3=new dog();
    	obj3.makeSound();
    	
    	}
    }
