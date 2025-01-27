package org.example;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testPersonWithoutDog() {
        Person person = new Person("John", 25);

        assertEquals("John", person.getName());
        assertEquals(25, person.getAge());
        assertEquals(Optional.empty(), person.getDog());
    }

    @Test
    void testPersonWithDog() {
        Dog dog = new Dog("Buddy", 6);
        Person person = new Person("Doe", 30, dog);

        assertEquals("Doe", person.getName());
        assertEquals(30, person.getAge());
        assertTrue(person.getDog().isPresent());
        assertEquals(dog, person.getDog().get());
    }

    @Test
    void testHasOldDogWhenDogIsOld() {
        Dog oldDog = new Dog("Paati", 12);
        Person person = new Person("Malley", 40, oldDog);

        assertTrue(person.hasOldDog());
    }

    @Test
    void testHasOldDogWhenNoDog() {
        Person person = new Person("Ben", 28);
        assertFalse(person.hasOldDog());
    }

    @Test
    void testChangeDogsNameWhenDogExists() {
        Dog dog = new Dog("Zorro", 5);
        Person person = new Person("Eva", 35, dog);

        person.changeDogsName("Max");
        assertEquals("Max", person.getDog().get().getName());
    }

    @Test
    void testChangeDogsNameWhenNoDog() {
        Person person = new Person("Frank", 29);

        RuntimeException exception = assertThrows(RuntimeException.class, () -> person.changeDogsName("Buddy"));
        assertEquals("Frank does not own a dog!", exception.getMessage());
    }

    @Test
    void testEquals() {
        Dog dog = new Dog("Buddy", 6);

        Person person1 = new Person("Bailey", 33, dog);
        Person person2 = new Person("Bailey", 33, dog);
        Person person3 = new Person("Meredith", 40);

        assertEquals(person1, person2);
        assertNotEquals(person1, person3);
    }

}