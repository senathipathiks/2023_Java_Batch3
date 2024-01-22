package Day1;

class Animal {
    void makeSound() {
        System.out.println("The Animal sound varies from the type of the animal");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("The Dog barks loudly");
    }
}

class Cow extends Animal {
    void makeSound() {
        System.out.println("The Cow makes moo");
    }
}

class Lion extends Animal {
    void makeSound() {
        System.out.println("The Lion roars proudly");
    }
}

public class AnimalSound {
    public static void main(String[] args) {
        Animal A1 = new Animal();
        A1.makeSound();

        Dog D1 = new Dog();
        D1.makeSound();

        Cow C1 = new Cow();
        C1.makeSound();

        Lion L1 = new Lion();
        L1.makeSound();
    }
}
