package org.training.java.advanced.generics;

import java.util.List;

public class MyGeneric<A,B> {

    public void copy(/*IN*/A a,/*OUT*/B b){

    }

    public void copy(/*IN*/ List<? extends A> a,/*OUT*/ List<? super B> b){

    }
    public void show(List<A> a){

    }

}
