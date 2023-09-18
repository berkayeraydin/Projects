package org.training.java.advanced.composition;

public class BMWDizel extends BMW {
    public BMWDizel(int speed,
                    int horsePower) {
        super(speed,
              horsePower);
    }

    @Override
    public void forward() {
        super.forward();
    }
}
