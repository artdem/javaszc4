package com.company;

public class Cat extends Animal {
    private CatBreeds catBreeds;

    public Cat(String nameFromUser, int ageFromUser) {
        super(nameFromUser, ageFromUser);
    }

    @Override
    public void iAmAnimal(){
        System.out.println("Jestem kotem.");
    }
}
