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

        dog.eat();  //Even though eat() is defined in Animal, because Dog is an Animal it has that method as well.
        System.out.println();

        dog.move(5);
        System.out.println();

        dog.walk();
        System.out.println();

        dog.run();
        System.out.println();
    }
}