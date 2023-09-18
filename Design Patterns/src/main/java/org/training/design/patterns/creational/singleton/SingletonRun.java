package org.training.design.patterns.creational.singleton;

public class SingletonRun {

    public static void main(String[] args) {

        // OOP de önerilmiyor.
        MyEagerSingleton.getInstance().hello();

        MyLazySingleton.getInstance().hello();

        // ikisi arasında ki fark ;
        // MyEager kullanılmasa da devreye giriyor.
        // MyLazy 11. Satırda ki kod çalıştığı zaman bu objenin instance oluşur.

        MyEnumSingleton.instance.hello();
    }
}
