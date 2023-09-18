package org.training.java.advanced.composition.usage;

public class CarRun {

    public static void main(String[] args) {
        Car car = new Car(new CarType(ECarType.DIZEL,
                                      120),
                          new TransType(ETransType.MANUEL,
                                        180));
        Car car1 = new Car(new CarType(ECarType.BENZINLI,
                                       150),
                           new TransType(ETransType.AUTOMATIC,
                                         180));

    }

}
