## Name     : Keerthana Thangavelu
## StudentId: C0932267

# CSD4464_Assignment1_C0932267
 Term 3 Java Assignment 1

This project implements two Java classes: `Dog` and `Person`, with the following functionality:
- The `Dog` class includes attributes `name` and `age`, along with appropriate constructors, getters, and setters.
- The `Person` class includes attributes `name`, `age`, and an `Optional<Dog>` to represent whether a person owns a dog.
- Includes functionality to:
    - Check if a person has an old dog (aged 10 or older).
    - Change the name of the dog a person owns or throw an exception if the person doesn't own a dog.
- A main application demonstrates the behavior, handling exceptions for operations on a person without a dog.

Additionally, unit tests are provided to validate all methods in the `Dog` and `Person` classes.

## Instructions to Run the Code and Unit Tests

### Prerequisites
1. **Java Development Kit (JDK):** Ensure you have JDK 8 or later installed.
2. **Gradle Build Tool:** The project uses Gradle for dependency management and build configuration.
    - You can install Gradle manually or use the Gradle Wrapper (`gradlew`/`gradlew.bat`) included in the project.

### Steps to Run the Application
1. Clone this repository:
   ```
   git clone https://github.com/KeerthanaThangavelu/CSD4464_Assignment1_C0932267
   cd CSD4464_Assignment1_C0932267
2. Build
    ``` 
    gradlew build
3. Run
    ``` 
    gradlew run
   

### Test Cases
1. Execute Test case using Gradle
    ```
   gradlew test
