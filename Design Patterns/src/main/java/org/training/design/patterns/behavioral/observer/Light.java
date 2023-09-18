package org.training.design.patterns.behavioral.observer;

public class Light implements IAlarmObserver {
    private String name;
    private int index;

    public Light(String name,
                 int index) {
        this.name = name;
        this.index = index;
    }


    @Override
    public void alarmOn(EAlarmType alarmType) {
        System.out.println("Light " + name + "-"+ index + " turned on.");
    }

    @Override
    public void alarmOff() {
        System.out.println("Light " + name + "-"+ index + " turned off.");

    }
}
