package ru.itsJava;

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int returnAge() throws AgeNotValidException {
        if (age >= 0 && age <= 150) {
            return age;
        } else {
            throw new AgeNotValidException("Incorrect!");
        }
    }
}
