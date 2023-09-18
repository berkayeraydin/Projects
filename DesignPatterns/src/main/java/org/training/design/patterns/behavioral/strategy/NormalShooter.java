package org.training.design.patterns.behavioral.strategy;

import java.security.SecureRandom;
import java.util.Random;

public class NormalShooter implements IShoot{

    @Override
    public void shoot(int range) {
        Random random = new SecureRandom();
        int i = random.nextInt(100);
        if (i > 50 + (range/10)){
            System.out.println("vurdum");
        } else {
            System.out.println("vuramadım");
        }
    }
}
