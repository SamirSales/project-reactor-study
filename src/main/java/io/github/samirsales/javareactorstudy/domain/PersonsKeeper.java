package io.github.samirsales.javareactorstudy.domain;

import java.util.ArrayList;
import java.util.List;

public class PersonsKeeper {

    private List<Person> persons;

    public PersonsKeeper() {
        this.persons = new ArrayList<>();

        Animal animal1 = new Animal(1L, "Toto", "Dog");
        Animal animal2 = new Animal(2L, "Dodo", "Dog");
        Animal animal3 = new Animal(3L, "Lolo", "Cat");
        Animal animal4 = new Animal(4L, "Fofo", "Cat");
        Animal animal5 = new Animal(5L, "Momo", "Monkey");
        Animal animal6 = new Animal(6L, "Nono", "Monkey");
        Animal animal7 = new Animal(7L, "Popo", "Duck");
        Animal animal8 = new Animal(8L, "Bobo", "Duck");

        ArrayList<Animal> animalArrayList1 = new ArrayList<>();
        animalArrayList1.add(animal1);
        animalArrayList1.add(animal2);
        animalArrayList1.add(animal3);

        ArrayList<Animal> animalArrayList2 = new ArrayList<>();
        animalArrayList2.add(animal4);
        animalArrayList2.add(animal5);
        animalArrayList2.add(animal6);

        ArrayList<Animal> animalArrayList3 = new ArrayList<>();
        animalArrayList3.add(animal7);
        animalArrayList3.add(animal8);

        Person person1 = new Person(1L, "Larry", null);
        Person person2 = new Person(2L, "Harry", animalArrayList1);
        Person person3 = new Person(3L, "Mary", null);
        Person person4 = new Person(4L, "Terry", animalArrayList2);
        Person person5 = new Person(5L, "Carrie", animalArrayList3);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
    }

    public List<Person> getPersons() {
        return persons;
    }
}
