package org.training.design.patterns.structural.bridge;

import org.training.design.patterns.structural.bridge.animal.Animal;
import org.training.design.patterns.structural.bridge.animal.Lion;

public class AnimalRun {

    public static void main(String[] args) {
        Animal a = new Lion();
        a.walk();
        a.talk();

        AnimalEx cat = new AnimalEx(new CatTalking(),new FourLegAnimal());
        cat.talk();
        cat.walk();

        AnimalEx cat2 = new AnimalEx(new CatTalking(),new TwoLegAnimal());
        cat.talk();
        cat.walk();

        AnimalEx cat3 = new AnimalEx(new LionTalking(),new TwoLegAnimal());
        cat.talk();
        cat.walk();

        AnimalEx cat4 = new AnimalEx(new LionTalking(),new FourLegAnimal());
        cat.talk();
        cat.walk();

        AnimalEx cat5 = new AnimalEx(new LionTalking(),new SixLegAnimal());
        cat.talk();
        cat.walk();

    }

}
