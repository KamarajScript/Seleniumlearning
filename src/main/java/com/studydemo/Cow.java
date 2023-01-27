package com.studydemo;

public class Cow extends Dog {

    @Override
    public void animalSound() {
        System.out.println("Maa... Maa...");
    }

    public static void main(String[] args) {
        Cow obj = new Cow();
        Dog dog = new Dog();
        dog.animalSound();
        obj.animalSound();
    }
}
