package org.training.java.advanced.composition.usage;

public class CarType {

    private ECarType carType;
    private int horsePower;

    public CarType(ECarType carType,
                   int horsePower) {
        this.carType = carType;
        this.horsePower = horsePower;
    }

    public ECarType getCarType() {
        return carType;
    }

    public void setCarType(ECarType carType) {
        this.carType = carType;
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
