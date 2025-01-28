package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person personWithoutDog = new Person("John", 30);

        try {
            personWithoutDog.changeDogsName("Buddy");
        } catch (RuntimeException e) {
            System.out.println("Unable to change dog's name: " + e.getMessage());
        }
    }
}