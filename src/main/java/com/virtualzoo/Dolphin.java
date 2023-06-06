package com.virtualzoo;

public class Dolphin extends Animal implements Swimming {
    @Override
    public void eat() {
        System.out.println("Dolphin is eating");
    }
    @Override
    public void move() {
        swim();
    }
    @Override
    public void swim() {
        System.out.println("Dolphin is swimming");
    }
}
