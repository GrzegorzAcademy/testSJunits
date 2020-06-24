package com.isa.pet;

import java.util.Objects;

public class Pet {

    private final String name;
    private final int age;
    private final PetType type;

    public Pet(String name, int age, PetType type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public PetType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age &&
                Objects.equals(name, pet.name) &&
                type == pet.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, type);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type=" + type +
                '}';
    }
}
