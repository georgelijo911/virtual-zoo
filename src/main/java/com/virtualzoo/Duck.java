package com.virtualzoo;

public class Duck extends Animal implements Walking, Swimming, Flying {
    @Override
    public void eat() {
        System.out.println("Duck is eating");
    }
    @Override
    public void move() {
        walk();
        swim();
        fly();
    }
    @Override
    public void walk() {
        System.out.println("Duck is walking");
    }
    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
}
