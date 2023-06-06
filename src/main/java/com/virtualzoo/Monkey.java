package com.virtualzoo;

public class Monkey extends Animal implements Walking {
    @Override
    public void eat() {
        System.out.println("Monkey is eating");
    }
    @Override
    public void move() {
        walk();
    }
    @Override
    public void walk() {
        System.out.println("Monkey is walking");
    }
}
