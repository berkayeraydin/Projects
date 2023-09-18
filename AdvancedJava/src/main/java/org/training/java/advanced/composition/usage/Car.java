package org.training.java.advanced.composition.usage;

public class Car {

    private CarType carType;
    private TransType transType;

    public Car(CarType carType,
               TransType transType) {
        this.carType = carType;
        this.transType = transType;
    }

    public void forward(int metre){
        int forwardRange = carType.forward();
        transType.forward(forwardRange);
    }
}
