package Abstractions;

abstract class Animal {
    abstract void soundOfAnimal();  // It is just an idea
}

class Cat extends Animal {
    void soundOfAnimal() {
        System.out.println("Meoh");
        //Implementation of the idea according to requirements of sub class
    }
}

class Dog extends Animal {
    void soundOfAnimal() {
        System.out.println("Bow Bow");
        //Implementation of the idea according to requirements of sub class
    }
}