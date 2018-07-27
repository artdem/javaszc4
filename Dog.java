package com.company;

public class Dog extends Animal {
    private DogBreeds dogBreeds;

    public Dog(String nameFromUser, int ageFromUser) {
        super(nameFromUser, ageFromUser);
    }

    @Override
    public void iAmAnimal(){
        System.out.println("Jestem psem.");
    }
}

