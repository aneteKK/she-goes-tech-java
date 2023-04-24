package com.sda.she_likes_java.polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal someAnimal = new Animal();
        Cat myCat = new Cat();
        Animal secondCat = new Cat();
        Animal dog = new Dog();
        dog.makeSound();
    }
}
