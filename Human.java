package com.company;

public class Human {
    private String humanName;
    private String humanSurname;
    private Animal humansAnimal;
    private Address contactDetails;

    public Human (String humanNameParameter, String humanSurnameParameter){
        this.humanName = humanNameParameter;
        this.humanSurname = humanSurnameParameter;
    }

    public Animal getHumansAnimal() {
        return humansAnimal;
    }

    public void setHumansAnimal(Animal humansAnimal) {
        this.humansAnimal = humansAnimal;
    }

    public void introduce(){
        System.out.println("Cześć. Nazywam się " + this.humanName + " " + this.humanSurname + ".");
    }

    public void introduce(String methodParameter){
        System.out.println("Cześć. Nazywam się " + this.humanName + " " + this.humanSurname + ". " + methodParameter);
    }
}
