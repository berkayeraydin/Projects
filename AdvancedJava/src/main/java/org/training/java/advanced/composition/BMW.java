package org.training.java.advanced.composition;

public class BMW extends Car {


    public BMW(int speed,
               int horsePower) {
        super(speed,
              horsePower);
    }

    @Override
    public void forward() {
        super.forward();
    }

}
