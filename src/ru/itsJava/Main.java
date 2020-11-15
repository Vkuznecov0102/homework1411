package ru.itsJava;

public class Main {

    public static void main(String[] args) {

        try {
            Person hulk = new Person("Hulk", 40);
            System.out.println("hulk.returnAge() = " + hulk.returnAge());

            Person whoAreYou = new Person("NoName", -19);
            System.out.println("whoAreYou.returnAge() = " + whoAreYou.returnAge());

            Person tanos = new Person("Tanos", 25000);
            System.out.println("tanos.returnAge() = " + tanos.returnAge());

        } catch (AgeNotValidException ageNotValidException) {
            System.out.println("Неправильный возраст!");
        }
    }
}
