package com.company;

public class Animal {
    private String name;
    private int age;

    public Animal(String nameParameter, int ageParameter) {
        this.name = nameParameter;
        this.age = ageParameter;
    }

    //TODO metoda toString powinna być na dole klasy
    @Override
    public String toString() {
        return "To zwierzę wabi się " + name + ". " + name + " żyje już " + age + ".";
    }

    public void iAmAnimal (){
        System.out.println("Jestem Zwierzę!");
    }
}

