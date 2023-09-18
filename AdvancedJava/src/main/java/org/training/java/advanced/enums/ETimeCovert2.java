package org.training.java.advanced.enums;

public enum ETimeCovert2 {
    DAY() {
        public long convertMilis(long l) {
            return 24 * HOUR.convertMilis(l);
        }
    },
    HOUR() {
        public long convertMilis(long l) {
            return 60 * MINUTE.convertMilis(l);
        }
    },
    MINUTE() {
        public long convertMilis(long l) {
            return 60 * SECOND.convertMilis(l);
        }
    },
    SECOND() {
        public long convertMilis(long l) {
            return l * 1_000;
        }
    };


    public long convertMilis(long l) {
        return l;
    }
}
