package com.virtualzoo;

public class Zoo {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        Dolphin dolphin = new Dolphin();
        Bat bat = new Bat();
        Penguin penguin = new Penguin();
        Duck duck = new Duck();
        Animal zooStar = new Duck();
        zooStar.setName("Duck");
        monkey.move();    // Monkey walks
        monkey.eat();     // Monkey eats

        dolphin.move();   // Dolphin swims
        dolphin.eat();    // Dolphin eats

        bat.move();       // Bat flies
        bat.eat();        // Bat eats

        penguin.move();   // Penguin walks and swims
        penguin.eat();    // Penguin eats

        duck.move();      // Duck walks,swims and flies
        duck.eat();       // Duck eats

        zooStar.move();   // Duck walks,swims and flies
        System.out.println("The Zoo Star is:" +zooStar.getName());
    }
}