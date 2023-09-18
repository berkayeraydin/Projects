package org.training.design.patterns.creational.singleton;

// Enum lar default olarak bir singletondur.
// EnumSingleton da bir eagerdır. Yani otomatikmen oluşur.
public enum MyEnumSingleton {

    instance;

    public void hello(){
        System.out.println("Hello World");
    }
}
