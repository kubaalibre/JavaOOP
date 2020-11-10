package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        Animal cat = new Cat();
        cat.sound();
        Animal[] animals = new Animal[]{new Dog(), new Cat(), new Dog(), new Dog()};
        for (Animal animal : animals) {
            animal.sound();
        }
        ((Dog) dog).sound(5);
    }
}