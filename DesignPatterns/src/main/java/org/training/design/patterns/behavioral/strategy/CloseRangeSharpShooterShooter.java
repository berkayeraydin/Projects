package org.training.design.patterns.behavioral.strategy;

import java.security.SecureRandom;
import java.util.Random;

public class CloseRangeSharpShooterShooter implements IShoot{

    @Override
    public void shoot(int range) {
        Random random = new SecureRandom();
        int i = random.nextInt(100);
        if (i > 20 + (range/2)){
            System.out.println("vurdum");
        } else {
            System.out.println("vuramadım");
        }
    }
}
