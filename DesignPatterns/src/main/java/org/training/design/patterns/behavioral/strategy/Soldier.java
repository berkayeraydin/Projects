package org.training.design.patterns.behavioral.strategy;

import java.security.SecureRandom;
import java.util.Random;

public class Soldier {
    private IShoot shoot;
    private IDuck duck;

    public Soldier(IShoot shoot,
                   IDuck duck) {
        this.shoot = shoot;
        this.duck = duck;
    }

    public void shoot(int range){
        shoot.shoot(range);
    }

    public void duck(int range) {
        duck.duck(range);
    }


}
