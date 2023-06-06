package com.virtualzoo;

public class Penguin extends Animal implements Walking, Swimming {
    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }
    @Override
    public void move() {
        walk();
        swim();
    }
    @Override
    public void walk() {
        System.out.println("Penguin is walking");
    }
    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }
}
