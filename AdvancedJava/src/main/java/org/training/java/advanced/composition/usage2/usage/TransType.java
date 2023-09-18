package org.training.java.advanced.composition.usage2.usage;

public class TransType {
    private int range;

    public TransType(int range) {
        this.range = range;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public boolean forward(int forwardRange) {
         if (range > forwardRange){
             range = range -forwardRange;
                return true;
         }
         return false;
    }
}
