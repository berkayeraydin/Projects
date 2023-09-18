package org.training.java.advanced.generics;

public class GenericTwoHolder<A,B> {

    private A value;
    private Integer val;
    private B nextValue;

    public A getValue() {
        return value;
    }

    public void setValue(A value) {
        this.value = value;
    }

    public Integer getVal() {
        return val;
    }

    public void setVal(Integer val) {
        this.val = val;
    }

    public B getNextValue() {
        return nextValue;
    }

    public void setNextValue(B nextValue) {
        this.nextValue = nextValue;
    }
}
