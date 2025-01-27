package org.example;
import java.util.Objects;
import java.util.Optional;

public class Person {
    private String name;
    private Integer age;
    private Optional<Dog> dog;

    public Person(String name, Integer age) {
        this(name, age, null);
    }

    public Person(String name, Integer age, Dog dog) {
        this.name = name;
        this.age = age;
        this.dog = Optional.ofNullable(dog);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<Dog> getDog() {
        return dog;
    }

    public void setDog(Optional<Dog> dog) {
        this.dog = dog;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean hasOldDog() {
        return dog.map(d -> d.getAge() >= 10).orElse(false);
    }

    public void changeDogsName(String newName) {
        dog.map(d -> {
            d.setName(newName);
            return d;
        }).orElseThrow(() -> new RuntimeException(this.name + " does not own a dog!"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age) &&
                Objects.equals(dog, person.dog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, dog);
    }
}
