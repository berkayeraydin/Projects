package org.training.java.advanced.generics;

public class GenericCharHolder<A extends CharSequence> {

    private A value;

    public void show(){
        System.out.println(value.toString());
    }

    public A getValue() {
        return value;
    }

    public void setValue(A value) {
        this.value = value;
    }
}
