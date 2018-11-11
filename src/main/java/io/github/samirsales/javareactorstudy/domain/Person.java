package io.github.samirsales.javareactorstudy.domain;

import java.util.List;

public class Person {

    private Long id;
    private String name;
    private List<Animal> animals;

    public Person(Long id, String name, List<Animal> animals) {
        this.id = id;
        this.name = name;
        this.animals = animals;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
