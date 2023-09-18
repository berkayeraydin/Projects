package org.training.java.advanced.enums;

public class StatusRun {

    public static void main(String[] args) {

        EStatus eStatus = EStatus.BOOTING;

        String str = eStatus.getStr();
        eStatus.doSomething();
        System.out.println("--------------------");
        int ordinal = eStatus.ordinal();
        String name = eStatus.name();

        if (eStatus == EStatus.BOOTING) {
            // ...
        }

        switch (eStatus) {
            case BOOTING:
                System.out.println("sistem boot");
                break;
            case STARTING:
                System.out.println("sistem açılıyor");
                break;
            case SUSPENDED:
                System.out.println("sistem durduruldu");
                break;
            default:
                System.out.println("sistem bilinmez");
                break;
        }
    }
}
