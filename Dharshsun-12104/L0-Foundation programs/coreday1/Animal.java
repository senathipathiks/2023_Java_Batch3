package com.coreday1;


class Animals {

    public void printSound() {
        System.out.println("Sound method of animals dog,lion,cat");
    }
}

class Dog extends Animals {

    public void printSound() {
        System.out.println("Dogs bark");
    }
}

class Lion extends Animals {

    public void printSound() {
        System.out.println("Lion roars");
    }
}

class Cow extends Animals {

    public void printSound() {
        System.out.println("Cow moo");
    }
}
class Animal {

    public static void main(String[] args) {
    	Animals a = new Animals();
    	a.printSound();
        Dog d = new Dog();
        d.printSound();
        Cow c = new Cow();
        c.printSound();
        Lion l = new Lion();
        l.printSound();
        
    }
}
	        
	




