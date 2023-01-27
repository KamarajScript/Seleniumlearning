package com.studydemo;

public class Dog extends Animal{

    @Override
    public void animalSound() {
        System.out.println("Woo... Woo...");
    }

    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.animalSound();
    }
}
