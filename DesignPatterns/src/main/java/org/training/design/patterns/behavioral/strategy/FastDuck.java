package org.training.design.patterns.behavioral.strategy;

import java.security.SecureRandom;
import java.util.Random;

public class FastDuck implements IDuck{
    @Override
    public void duck(int range) {
        Random random = new SecureRandom();
        int i = random.nextInt(100);
        if (i > 30 + (range/5)){
            System.out.println("vururulmadım");
        } else {
            System.out.println("vuruldum");
        }
    }
}
