package com.javacoreday9collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setName(String newName) {
		// TODO Auto-generated method stub
		
	}

	public void setAge(int newAge) {
		// TODO Auto-generated method stub
		
	}

	public int getName() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}

    // Getters and Setters (not shown for brevity)
}

public class CollectionOperations {
    private List<Person> personList = new ArrayList<>();

    // Insert operation
    public void insertPerson(int id, String name, int age) {
        Person person = new Person(id, name, age);
        personList.add(person);
        System.out.println("Person added successfully.");
    }

    // Update operation
    public void updatePerson(int id, String newName, int newAge) {
        for (Person person : personList) {
            if (person.getId() == id) {
                person.setName(newName);
                person.setAge(newAge);
                System.out.println("Person updated successfully.");
                return;
            }
        }
        System.out.println("Person not found with ID: " + id);
    }

    // View operation
    public void viewPersons() {
        System.out.println("Persons in the list:");
        for (Person person : personList) {
            System.out.println(person.getId() + " - " + person.getName() + " - " + person.getAge());
        }
    }

    // Delete operation
    public void deletePerson(int id) {
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getId() == id) {
                iterator.remove();
                System.out.println("Person deleted successfully.");
                return;
            }
            System.out.println("Person not found with ID: " + id);
        }
    }

        public static void main(String[] args) {
            CollectionOperations collectionOperations = new CollectionOperations();

            // Insert example
            collectionOperations.insertPerson(1, "Dharshsun", 28);
            collectionOperations.insertPerson(2, "Chandru", 36	);

            // View example
            collectionOperations.viewPersons();

            // Update example
//            collectionOperations.updatePerson(1, "Updated John", 26);

            // View example after update
//            collectionOperations.viewPersons();

            // Delete example
//            collectionOperations.deletePerson(2);

            // View example after delete
//            collectionOperations.viewPersons();
        }
    }
