package org.training.java.advanced.enums;

public enum ETimeCovert1 {
    DAY(24 * 60 * 60 * 1_000),
    HOUR(60 * 60 * 1_000),
    MINUTE(60 * 1_000),
    SECOND(1_000);

    private final long mult;

    ETimeCovert1(long mult) {
        this.mult = mult;
    }

    public long getMult() {
        return mult;
    }
    public long convertMilis(long l){
        return mult * l;
    }
}
