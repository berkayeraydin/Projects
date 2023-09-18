package org.training.design.patterns.creational.singleton;

// Singletonlar ikiye ayrılıyor. Eager ve Lazy olarak.
// Eager anlamı = Herhangi bir classdan import edilirse bu class otomatikmen kendini oluşturuyor.

public class MyEagerSingleton {

    private static MyEagerSingleton instance = new MyEagerSingleton();

    public static MyEagerSingleton getInstance() {
        return instance;
    }

    private MyEagerSingleton() {

    }

    public void hello(){
        System.out.println("Hello World");
    }
}
