package org.training.java.advanced.composition.usage2.usage;

public class CarType {

    private int horsePower;

    public CarType(int horsePower) {
        this.horsePower = horsePower;
    }


    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int forward() {
        return horsePower * 100 / 55;
    }
}
