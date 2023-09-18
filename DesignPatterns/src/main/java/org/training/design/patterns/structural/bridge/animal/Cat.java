package org.training.design.patterns.structural.bridge.animal;

public class Cat extends Animal{

    @Override
    public void walk() {
        System.out.println("Waliking with 4 legs");;
    }

    @Override
    public void talk() {
        System.out.println("miyaw");;
    }
}
