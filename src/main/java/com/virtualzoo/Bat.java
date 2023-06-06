package com.virtualzoo;

public class Bat extends Animal implements Flying {
    @Override
    public void eat() {
        System.out.println("Bat is eating");
    }
    @Override
    public void move() {
        fly();
    }
    @Override
    public void fly() {
        System.out.println("Bat is flying");
    }
}
