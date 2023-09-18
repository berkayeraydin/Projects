package org.training.java.advanced.composition.usage;

public class TransType {
    private ETransType transType;
    private int range;

    public TransType(ETransType transType,
                     int range) {
        this.transType = transType;
        this.range = range;
    }

    public ETransType getTransType() {
        return transType;
    }

    public void setTransType(ETransType transType) {
        this.transType = transType;
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
