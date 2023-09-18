package org.training.java.advanced.enums;

import org.training.java.advanced.intf.IHello;

public enum EStatus implements IHello {
    BOOTING("sistem boot",
            100) {
        @Override
        public void doSomething() {
            System.out.println("boot işlemi yürütülüyor");
        }
    },
    RUNNING("sistem çalışıyor",
            200),
    STARTING("sistem başlatılıyor",
             3000) {
        @Override
        public String sayHello(String name,
                               String surname) {
            return super.sayHello(name,
                                  surname);
        }
    },
    SUSPENDED("sistem durduruldu",
              6000);

    private final String str;
    private final int eventCause;

    private EStatus(String str,
                    int eventCause) {
        this.str = str;
        this.eventCause = eventCause;
    }

    public String getStr() {
        return str;
    }

    public int getEventCause() {
        return eventCause;
    }

    public void doSomething(){
        System.out.println("Doing something");
    }

    @Override
    public String sayGoodBye(String name,
                             String surname) {
        return null;
    }

    @Override
    public String sayHello(String name,
                           String surname) {
        return null;
    }
}
//public class BOOTING_IMPL extends EStatus;
//BOOTING_IMPL BOOTING = new BOOTING_IMPL();