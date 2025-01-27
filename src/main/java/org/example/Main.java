package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person personWithoutDog = new Person("John", 30);

        try {
            // Step 2: Try to change the dog's name
            personWithoutDog.changeDogsName("Buddy");
        } catch (RuntimeException e) {
            // Step 3: Catch the exception and output the message
            System.out.println("Unable to change dog's name: " + e.getMessage());
        }
    }
}