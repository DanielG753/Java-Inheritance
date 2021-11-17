package com.Daniel;

//To create a sub-class use keyword extends. MUST call the parent class in its constructor.
public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    /*
     * Rather than passing a ton of parameters to the parent class (Animal) we know that all Dogs have 1 brain,
     * and 1 body, so we will instead pass that on to the super constructor instead of having to redefine them
     * for every instance of Dog.
     */
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        //MUST call super when extending a class. Super calls the default constructor of the parent class.
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("The dog chews its food.");
    }

    //This is an annotation that tells the compiler we are trying to override the parent method.
    //If we do not properly override the method we will get a warning.
    //This is useful to make sure we don't make a mistake, and in case the parent method has changed we will be warned.
    @Override
    public void eat() {
        System.out.println("Dog.eat() called.");
        super.eat();
        chew();
    }

    public void walk() {
        System.out.println("The dog walks.");
        move(5);
    }

    public void run() {
        System.out.println("The dog runs.");
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("The dog moves its legs at " + speed);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
