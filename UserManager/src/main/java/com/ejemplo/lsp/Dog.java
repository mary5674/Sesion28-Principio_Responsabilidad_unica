package com.ejemplo.lsp;

class Dog extends Animal implements WalkingAnimal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
    @Override
    public void walk() {
        System.out.println("Dog walk.");
    }
}