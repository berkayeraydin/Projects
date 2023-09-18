package org.training.java.advanced.lab1;

public class War {
    public static void main(String[] args) {
        Soldier fastSharpSoldier = new Soldier("FastSharpSoldier",
                                               r -> r < 100,
                                               r -> r > 30);
        fastSharpSoldier.war(120);
        Soldier slowNormalSoldier = new Soldier("SlowNormalSoldier",
                                               r -> r < 50,
                                               r -> r > 80);
        slowNormalSoldier.war(55);
        Soldier elitSoldier = new Soldier("elitSoldier",
                                                r -> r < 120,
                                                r -> r > 10);

        elitSoldier.war(30);


    }
}
