package org.training.design.patterns;

import org.training.design.patterns.creational.singleton.MyLazySingleton;

public class Araba {
    private int hiz;
    private int uzaklık;

    // Cohesion deniyor. Birbirine girdi. Bir objenin paketi dahil yaptığı iş yada
    // sorumlulukla anlam bütünlüğü olmalıdır.
 /*   private int caymiktari;
    public void cayyap(){

    }*/

    public void ileri(){
        MyLazySingleton.getInstance().hello();

    }

    public void geri(){

    }

    public void don(){

    }
}
