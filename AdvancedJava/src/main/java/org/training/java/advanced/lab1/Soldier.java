package org.training.java.advanced.lab1;

import java.security.SecureRandom;
import java.util.Random;

public class Soldier {

    private String name;
    private IShoot shoot;
    private IDuck duck;
    private Random random = new SecureRandom();


    public Soldier(String name,
                   IShoot shoot,
                   IDuck duck) {
        this.name = name;
        this.shoot = shoot;
        this.duck = duck;
    }

    public void war(int range) {
        System.out.println("Savaş başlıyor : " +
                                   name);
        if (shoot.shoot(range)) {
            System.out.println(name + " Vurdum");
        } else {
            if (random.nextInt(10) > 5) {
                System.out.println(name + " Vurdum");
            } else {
                System.out.println(name + " Vuramadım");
            }
        }
        if (duck.duck(range)) {
            System.out.println(name + " Kaçtım");
        } else {
            if (random.nextInt(10) > 5) {
                System.out.println(name + " Kaçtım");
            } else {
                System.out.println(name  + " Vuruldum");
            }
        }
    }

}
