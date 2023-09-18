package org.training.java.advanced.navigation.transportation;

public class Araba {

    private int speed;
    private String brand;
    private int weight;
    private int turnCap;

    private int cayHolder;

    // MISS - Make it simple stupid
    // KISS - Keep it simple stupid

    public void cookTea() {
        System.out.println("Çay yap");
    }

    public void horse() {
        System.out.println("Atla gezi");
    }


    public void forward() {
        System.out.println("İleri git");
    }

    public void turn() {
        System.out.println("Dön işlemi");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTurnCap() {
        return turnCap;
    }

    public void setTurnCap(int turnCap) {
        this.turnCap = turnCap;
    }
}
