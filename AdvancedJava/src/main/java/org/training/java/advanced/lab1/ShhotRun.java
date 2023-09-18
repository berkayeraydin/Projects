package org.training.java.advanced.lab1;

import java.security.SecureRandom;
import java.util.Random;

public class ShhotRun {
    public static void main(String[] args) {
        IShoot sharpShooter = r -> r < 100;
        IShoot normalShooter = r -> r < 50;
        IShoot sloppyShooter = r -> r < 10;
        IShoot randomShooter = r -> {
            Random random = new SecureRandom();
            int rangeLimit = random.nextInt(100);
            return r < rangeLimit;
        };

        System.out.println("sharp : " + sharpShooter.shoot(45));
        System.out.println("normal : " + normalShooter.shoot(45));
        System.out.println("sloppy : " + sloppyShooter.shoot(45));
        System.out.println("random : " + randomShooter.shoot(45));
        System.out.println("random : " + randomShooter.shoot(45));
        System.out.println("random : " + randomShooter.shoot(45));
        System.out.println("random : " + randomShooter.shoot(45));
        System.out.println("random : " + randomShooter.shoot(45));
        System.out.println("random : " + randomShooter.shoot(45));

    }
}
