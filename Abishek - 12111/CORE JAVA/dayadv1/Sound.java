package com.dayadv1;

class Animal {
    void makeSound() {
        System.out.println("Sound");
    }
}
class dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("dog barks!!!!!!!");
    }
}
class Cow extends Animal{
    @Override
    void makeSound() {
        System.out.println("Cow maaaaaa!!!!!!!!!");
    }
    
}
class Lion extends Animal{
    @Override
    void makeSound() {
        System.out.println("lion rawwwwrsss!!!!!!!!!!! ");
    }
}

public class Sound {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	Lion obj = new Lion();
    	obj.makeSound();
    }

}