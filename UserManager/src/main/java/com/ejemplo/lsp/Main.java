package com.ejemplo.lsp;

import com.ejemplo.lsp.Dog;
import com.ejemplo.lsp.Animal;
import com.ejemplo.lsp.Fish;
import com.ejemplo.lsp.WalkingAnimal;

public class Main 
{
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal fish = new Fish();
 
        dog.makeSound();
        if (dog instanceof WalkingAnimal) {
            ((WalkingAnimal) dog).walk();
        }
 
        fish.makeSound();
        if (fish instanceof WalkingAnimal) {
            ((WalkingAnimal) fish).walk();
        }
    }
}