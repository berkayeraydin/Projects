package org.training.java.advanced.collections;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class QueueEntry implements Delayed {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(10,
                            TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return 0;
    }
}
