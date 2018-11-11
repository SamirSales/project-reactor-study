package io.github.samirsales.javareactorstudy.domain;

public class Animal {

    private Long id;
    private String name;
    private String type;

    public Animal(Long id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
