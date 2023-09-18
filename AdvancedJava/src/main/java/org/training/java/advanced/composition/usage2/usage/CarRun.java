package org.training.java.advanced.composition.usage2.usage;

public class CarRun {

    public static void main(String[] args) {
        Car car = new Car(new Dizel(120),
                          new Manuel(180));
        Car car1 = new Car(new Benzinli(150),
                           new Otomatik(180));
        car.forward(100);
    }

}
