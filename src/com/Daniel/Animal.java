package com.Daniel;

// This is the parent class that all animals will inherit from.
public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    /*
     * All animals can eat and move. In our print-out we say that the "animal" is eating or moving to show which
     * version of this method was called.
     */
    public void eat() {
        System.out.println("The animal eats.");
    }

    public void move(int speed) {
        System.out.println("The animal moves at " + speed);
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}