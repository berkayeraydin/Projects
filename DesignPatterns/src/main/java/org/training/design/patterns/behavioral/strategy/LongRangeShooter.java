package org.training.design.patterns.behavioral.strategy;

import java.security.SecureRandom;
import java.util.Random;

public class LongRangeShooter implements IShoot{

    @Override
    public void shoot(int range) {
        Random random = new SecureRandom();
        int i = random.nextInt(100);
        int rangeReduction = range > 10 ? range / 3 : 0;
        if (i > 40 + rangeReduction){
            System.out.println("vurdum");
        } else {
            System.out.println("vuramadım");
        }
    }
}
