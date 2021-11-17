package com.Daniel;

/**
 * This is a short project demonstrating how Inheritance works in Java.
 * @author Daniel Ginocchetti
 * @version 1.0
 * @since 2021-9-16
 */

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1,5,5);
        Dog dog = new Dog("Yorkie", 8, 20, 2,4,1,20,"long silky");

        /*
         * These will call the overridden methods within Dog that also reference the parent class.
         * In this way we can write code once for all animals, and reuse it within child classes like Dog.
         * Each method call will print out showing which class is being used.
         */
        dog.eat();
        System.out.println();

        dog.move(5);
        System.out.println();

        dog.walk();
        System.out.println();

        dog.run();
        System.out.println();
    }
}