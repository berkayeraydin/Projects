package org.training.design.patterns.behavioral.strategy;

import java.security.SecureRandom;
import java.util.Random;

public class LongRangeSharpShooterShooter implements IShoot{

    @Override
    public void shoot(int range) {
        Random random = new SecureRandom();
        int i = random.nextInt(100);
        int rangeReduction = range > 100 ? range / 5 : 0;
        if (i > 30 + rangeReduction){
            System.out.println("vurdum");
        } else {
            System.out.println("vuramadım");
        }
    }
}
