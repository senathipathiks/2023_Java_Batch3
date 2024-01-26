package CoreTopic;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cow extends Animal {
    public void makeSound() {
        System.out.println("The cow moos");
    }
}

class Lion extends Animal {
    public void makeSound() {
        System.out.println("The lion roars");
    }
}

public class Animalmainn {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cow cow = new Cow();
        Lion lion = new Lion();

        animal.makeSound();
        dog.makeSound();
        cow.makeSound();
        lion.makeSound();
    }
}
