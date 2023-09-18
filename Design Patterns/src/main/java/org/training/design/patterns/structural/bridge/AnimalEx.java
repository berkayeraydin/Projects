package org.training.design.patterns.structural.bridge;

public class AnimalEx {

    private AnimalTalking animalTalking;
    private AnimalWalking animalWalking;

    public AnimalEx(AnimalTalking animalTalking,
                    AnimalWalking animalWalking) {
        this.animalTalking = animalTalking;
        this.animalWalking = animalWalking;
    }

    public void walk(){
        System.out.println(animalWalking.walk());
    }

    public void talk(){
        System.out.println(animalTalking.talk());
    }
}
