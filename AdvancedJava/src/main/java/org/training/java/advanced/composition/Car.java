package org.training.java.advanced.composition;

public class Car {

    private int speed;
    private int horsePower;

    public Car(int speed,
               int horsePower) {
        this.speed = speed;
        this.horsePower = horsePower;
    }

    public void forward(){
        System.out.println("ileri");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
