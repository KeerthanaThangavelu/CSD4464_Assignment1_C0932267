package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    @Test
    void testDogCreation() {
        Dog dog = new Dog("Zorro", 5);
        assertEquals("Zorro", dog.getName());
        assertEquals(5, dog.getAge());
    }

    @Test
    void testSetNameAndGetAge() {
        Dog dog = new Dog("Max", 3);
        dog.setName("Bailey");
        assertEquals("Bailey", dog.getName());
        assertEquals(3, dog.getAge());
    }

    @Test
    void testEquals() {
        Dog dog1 = new Dog("Zorro", 5);
        Dog dog2 = new Dog("Zorro", 5);
        Dog dog3 = new Dog("Max", 3);

        assertEquals(dog1, dog2);
        assertNotEquals(dog1, dog3);
    }
}